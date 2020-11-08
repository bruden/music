package team.burden.music.widget;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;

import com.xuexiang.xfloatview.XFloatView;

import team.burden.music.R;
import team.burden.music.model.Song;
import team.burden.music.protos.PositionOuterClass;
import team.burden.music.service.ClickService;
import team.burden.music.service.SongPlayService;
import team.burden.music.service.impl.ClickServiceImpl;
import team.burden.music.service.impl.SongPlayServiceImpl;
import team.burden.music.util.PositionUtil;

/**
 * Created by burden on 2020/11/7.
 */
public class FloatView extends XFloatView {

    private Context context;
    private ImageView playView;
    private ImageView stopView;

    private ClickService clickService;

    private PositionOuterClass.UserPosition userPosition;
    private Song song;
    private SongPlayService songPlayService;

    public FloatView(Context context) {
        super(context);
        this.context = context;
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
        song = new Song();
        userPosition = PositionUtil.getDefaultUserPosition();
        playView = findViewById(R.id.float_play);
        stopView = findViewById(R.id.float_stop);
        clickService = ClickServiceImpl.getInstance();
        playView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (songPlayService == null) {
                    songPlayService = new SongPlayServiceImpl(song, clickService, userPosition);
                }
                songPlayService.play();
            }
        });
        stopView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (songPlayService != null) {
                    songPlayService.stop();
                }
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

}