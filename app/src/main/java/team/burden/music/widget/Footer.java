package team.burden.music.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewStub;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;

import team.burden.music.R;

/**
 * Created by burden on 2020/11/28.
 */
public class Footer extends RelativeLayout {

    protected State mState = State.Normal;
    private View mLoadingView;
    private View mNetworkErrorView;
    private View mTheEndView;
    private ProgressBar mLoadingProgress;

    public Footer(Context context) {
        super(context);
        init(context);
    }

    public Footer(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public Footer(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    public void init(Context context) {
        inflate(context, R.layout.layout_footer, this);
        setOnClickListener(null);

        setState(State.Normal, true);
    }

    public State getState() {
        return mState;
    }

    public void setState(State status) {
        setState(status, true);
    }

    public void setState(State status, boolean showView) {
        if (mState == status) {
            return;
        }
        mState = status;

        switch (status) {

            case Normal:
                setOnClickListener(null);
                if (mLoadingView != null) {
                    mLoadingView.setVisibility(GONE);
                }

                if (mTheEndView != null) {
                    mTheEndView.setVisibility(GONE);
                }

                if (mNetworkErrorView != null) {
                    mNetworkErrorView.setVisibility(GONE);
                }

                break;
            case Loading:
                setOnClickListener(null);
                if (mTheEndView != null) {
                    mTheEndView.setVisibility(GONE);
                }

                if (mNetworkErrorView != null) {
                    mNetworkErrorView.setVisibility(GONE);
                }

                if (mLoadingView == null) {
                    ViewStub viewStub = (ViewStub) findViewById(R.id.footer_loading_viewstub);
                    mLoadingView = viewStub.inflate();

                    mLoadingProgress = (ProgressBar) mLoadingView.findViewById(R.id.footer_loading_progress);
                } else {
                    mLoadingView.setVisibility(VISIBLE);
                }

                mLoadingView.setVisibility(showView ? VISIBLE : GONE);

                mLoadingProgress.setVisibility(View.VISIBLE);
                break;
            case TheEnd:
                setOnClickListener(null);
                if (mLoadingView != null) {
                    mLoadingView.setVisibility(GONE);
                }

                if (mNetworkErrorView != null) {
                    mNetworkErrorView.setVisibility(GONE);
                }

                if (mTheEndView == null) {
                    ViewStub viewStub = (ViewStub) findViewById(R.id.footer_end_viewstub);
                    mTheEndView = viewStub.inflate();
                } else {
                    mTheEndView.setVisibility(VISIBLE);
                }

                mTheEndView.setVisibility(showView ? VISIBLE : GONE);
                break;
            case NetWorkError:
                if (mLoadingView != null) {
                    mLoadingView.setVisibility(GONE);
                }

                if (mTheEndView != null) {
                    mTheEndView.setVisibility(GONE);
                }

                if (mNetworkErrorView == null) {
                    ViewStub viewStub = (ViewStub) findViewById(R.id.footer_network_error_viewstub);
                    mNetworkErrorView = viewStub.inflate();
                } else {
                    mNetworkErrorView.setVisibility(VISIBLE);
                }

                mNetworkErrorView.setVisibility(showView ? VISIBLE : GONE);
                break;
            default:
                break;
        }
    }

    public static enum State {
        Normal,
        TheEnd,
        Loading,
        NetWorkError
    }

}
