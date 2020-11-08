package team.burden.music.widget;

import android.content.Context;
import android.widget.TextView;

import com.xuexiang.xfloatview.XFloatView;

import team.burden.music.R;

/**
 * Created by burden on 2020/11/7.
 */
public class ToneView extends XFloatView {

    private TextView textView;

    private String text;

    public ToneView(Context context, String text) {
        super(context);
        this.text = text;
    }

    @Override
    protected int getLayoutId() {
        return R.layout.layout_tone;
    }

    @Override
    protected boolean canMoveOrTouch() {
        return true;
    }

    @Override
    protected void initFloatView() {
        textView = findViewById(R.id.tone_text);
        textView.setText(text);
    }

    @Override
    protected void initListener() {

    }

    @Override
    protected boolean isAdsorbView() {
        return false;
    }

}
