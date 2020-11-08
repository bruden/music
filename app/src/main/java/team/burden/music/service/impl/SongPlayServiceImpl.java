package team.burden.music.service.impl;

import android.util.Log;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import team.burden.music.callback.Handler;
import team.burden.music.config.Const;
import team.burden.music.model.Song;
import team.burden.music.model.Tone;
import team.burden.music.protos.PositionOuterClass;
import team.burden.music.service.ClickService;
import team.burden.music.service.SongPlayService;
import team.burden.music.util.ToneUtil;

/**
 * Created by burden on 2020/11/7.
 */
public class SongPlayServiceImpl implements SongPlayService {

    private final static String LOG_TAG = "SongPlayServiceImpl";

    private final static SimpleDateFormat SIMPLE_DATE_FORMAT = new SimpleDateFormat("mm:ss");

    private Song song;
    private ClickService clickService;
    private PositionOuterClass.UserPosition userPosition;
    private Handler playHandler;

    private boolean isRunning;
    private int tongIndex, time;

    public SongPlayServiceImpl(Song song, ClickService clickService, PositionOuterClass.UserPosition userPosition, Handler playHandler) {
        this.song = song;
        this.clickService = clickService;
        this.userPosition = userPosition;
        this.playHandler = playHandler;
        this.isRunning = false;
        this.tongIndex = 0;
        this.time = 0;
    }

    @Override
    public void play() {
        isRunning = true;
        new Thread(new Play()).start();
    }

    @Override
    public void stop() {
        isRunning = false;
    }

    @Override
    public void reset() {
        isRunning = false;
        tongIndex = 0;
        time = 0;
    }

    @Override
    public boolean isRunning() {
        return isRunning;
    }

    @Override
    public int getProgress() {
        return 100 * time / song.getDuration();
    }

    @Override
    public String getTimeFormat() {
        Date total = new Date(song.getDuration());
        Date now = new Date(time);
        return SIMPLE_DATE_FORMAT.format(now) + "/" + SIMPLE_DATE_FORMAT.format(total);
    }

    class Play extends Thread {

        @Override
        public void run() {
            List<Tone> tones = song.getTones();
            for (int i = tongIndex, tonesLen = tones.size(); i < tonesLen; i++) {
                tongIndex = i;
                if (!isRunning) {
                    break;
                }
                Tone tone = tones.get(i);
                clickService.click(ToneUtil.toPosition(tone, userPosition));
                int duration = tone.getDuration();
                while (duration > 0) {
                    int t = Math.min(duration, Const.PLAY_UPDATE_DURATION);
                    try {
                        Thread.sleep(t);
                    } catch (Exception e) {
                        Log.e(LOG_TAG, String.format("Thread sleep error: %s", e));
                    }
                    time += t;
                    duration = -t;
                    playHandler.handle();
                }
            }
        }

    }
}
