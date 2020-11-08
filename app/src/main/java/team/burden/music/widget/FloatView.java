package team.burden.music.widget;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextSwitcher;
import android.widget.TextView;

import com.xuexiang.xfloatview.XFloatView;
import com.xuexiang.xui.widget.progress.materialprogressbar.MaterialProgressBar;

import team.burden.music.R;
import team.burden.music.callback.Handler;
import team.burden.music.config.Const;
import team.burden.music.model.Song;
import team.burden.music.protos.PositionOuterClass;
import team.burden.music.service.ClickService;
import team.burden.music.service.SongPlayService;
import team.burden.music.service.impl.ClickServiceImpl;
import team.burden.music.service.impl.SongPlayServiceImpl;
import team.burden.music.util.ContextUtil;
import team.burden.music.util.FileUtil;
import team.burden.music.util.PositionUtil;
import team.burden.music.util.ToneUtil;

/**
 * Created by burden on 2020/11/7.
 */
public class FloatView extends XFloatView {

    private static final String LOG_TAG = "FloatView";

    private Context context;
    private ImageView playView;
    private MaterialProgressBar seekBar;
    private TextSwitcher textSwitcher;
    private ImageView settingView;

    private int statusBarHeight;

    private ToneView[] toneViews = new ToneView[15];

    private boolean settingState;

    private ClickService clickService;

    private PositionOuterClass.UserPosition userPosition;
    private Song song;
    private SongPlayService songPlayService;

    public FloatView(Context context) {
        super(context);
        this.context = context;
        statusBarHeight = ContextUtil.getStatusBarHeight(context);
        loadUserPosition();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.layout_float;
    }

    @Override
    protected boolean canMoveOrTouch() {
        return true;
    }

    @Override
    protected void initFloatView() {
        playView = findViewById(R.id.float_play);
        seekBar = findViewById(R.id.float_seek_bar);
        textSwitcher = findViewById(R.id.float_text_switcher);
        settingView = findViewById(R.id.float_setting);

        song = new Song();
        clickService = ClickServiceImpl.getInstance();
        settingState = false;

        playView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (songPlayService != null && songPlayService.isRunning()) { // 暂停
                    playView.setImageResource(R.drawable.music_play_button);
                    if (songPlayService != null) {
                        songPlayService.stop();
                    }
                } else {
                    playView.setImageResource(R.drawable.music_stop_button);
                    if (songPlayService == null) { // 播放
                        songPlayService = new SongPlayServiceImpl(song, clickService, userPosition, new Handler() {
                            @Override
                            public void handle() {
                                seekBar.setProgress(songPlayService.getProgress());
                                textSwitcher.post(new Runnable() {
                                    @Override
                                    public void run() {
                                        textSwitcher.setCurrentText(songPlayService.getTimeFormat());
                                    }
                                });
                            }
                        });
                    }
                    songPlayService.play();
                }
            }
        });

        settingView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!settingState) { // 设置
                    settingView.setImageResource(R.drawable.confirm);
                    for (int i = 0; i < 15; i++) {
                        PositionOuterClass.Position position = userPosition.getPositions(i);
                        toneViews[i] = new ToneView(context, ToneUtil.getToneString(i));
                        int x = position.getX() - Const.TONE_VIEW_LENGTH / 2;
                        int y = position.getY() - Const.TONE_VIEW_LENGTH / 2 - statusBarHeight;
                        toneViews[i].setWindowManagerParams(x, y, Const.TONE_VIEW_LENGTH, Const.TONE_VIEW_LENGTH);
                        toneViews[i].show();
                    }
                } else { // 设置完成
                    settingView.setImageResource(R.drawable.setting);
                    PositionOuterClass.UserPosition.Builder builder = PositionOuterClass.UserPosition.newBuilder();
                    for (int i = 0; i < 15; i++) {
                        WindowManager.LayoutParams layoutParams = toneViews[i].getWmParams();
                        int x = layoutParams.x + Const.TONE_VIEW_LENGTH / 2;
                        int y = layoutParams.y + Const.TONE_VIEW_LENGTH / 2 + statusBarHeight;
                        PositionOuterClass.Position position = PositionOuterClass.Position.newBuilder()
                                .setX(x)
                                .setY(y)
                                .build();
                        builder.addPositions(position);
                    }
                    userPosition = builder.build();
                    saveUserPosition();
                    cleanView();
                }
                settingState = !settingState;
            }
        });
    }

    @Override
    protected void initListener() {
        setOnFloatViewClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            }
        });
    }

    @Override
    protected boolean isAdsorbView() {
        return true;
    }

    @Override
    public void clear() {
        cleanView();
        super.clear();
    }

    private void cleanView() {
        for (int i = 0; i < 15; i++) {
            if (toneViews[i] != null) {
                toneViews[i].clear();
                toneViews[i] = null;
            }
        }
    }

    private void loadUserPosition() {
        byte[] data = FileUtil.readFile(context, Const.USER_PATH, Const.USER_POSITION_FILE_NAME);
        if (data != null) {
            try {
                userPosition = PositionOuterClass.UserPosition.parseFrom(data);
            } catch (Exception e) {
                Log.e(LOG_TAG, String.format("Load user position error: %s"), e);
                userPosition = PositionUtil.getDefaultUserPosition();
            }
        } else {
            userPosition = PositionUtil.getDefaultUserPosition();
        }
    }

    private void saveUserPosition() {
        byte[] data = userPosition.toByteArray();
        FileUtil.writeFile(context, Const.USER_PATH, Const.USER_POSITION_FILE_NAME, data);
    }

}