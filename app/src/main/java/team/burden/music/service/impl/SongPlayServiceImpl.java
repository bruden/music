package team.burden.music.service.impl;

import java.util.List;

import lombok.Data;
import team.burden.music.model.Song;
import team.burden.music.model.Tone;
import team.burden.music.protos.PositionOuterClass;
import team.burden.music.service.ClickService;
import team.burden.music.service.SongPlayService;
import team.burden.music.util.ToneUtil;

/**
 * Created by burden on 2020/11/7.
 */
@Data
public class SongPlayServiceImpl implements SongPlayService {

    private Song song;
    private ClickService clickService;
    private PositionOuterClass.UserPosition userPosition;

    private boolean isRunning;
    private int tongIndex, time;

    public SongPlayServiceImpl(Song song, ClickService clickService, PositionOuterClass.UserPosition userPosition) {
        this.song = song;
        this.clickService = clickService;
        this.userPosition = userPosition;
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

    class Play extends Thread {

        @Override
        public void run() {
            List<Tone> tones = song.getTones();
            for (int i = 0, tonesLen = tones.size(); i < tonesLen; i++) {
                tongIndex = i;
                if (!isRunning) {
                    break;
                }
                Tone tone = tones.get(i);
                clickService.click(ToneUtil.toPosition(tone, userPosition));
                try {
                    Thread.sleep(tone.getDuration());
                } catch (Exception e) {
                }
            }
        }

    }
}
