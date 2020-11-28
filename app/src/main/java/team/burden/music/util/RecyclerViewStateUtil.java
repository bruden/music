package team.burden.music.util;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.cundong.recyclerview.HeaderAndFooterRecyclerViewAdapter;

import team.burden.music.widget.Footer;

/**
 * Created by burden on 2020/11/28.
 */
public class RecyclerViewStateUtil {

    public static void setFooterViewState(Activity instance, RecyclerView recyclerView, Footer.State state, View.OnClickListener errorListener) {

        if (instance == null || instance.isFinishing()) {
            return;
        }

        RecyclerView.Adapter outerAdapter = recyclerView.getAdapter();

        if (outerAdapter == null || !(outerAdapter instanceof HeaderAndFooterRecyclerViewAdapter)) {
            return;
        }

        HeaderAndFooterRecyclerViewAdapter headerAndFooterAdapter = (HeaderAndFooterRecyclerViewAdapter) outerAdapter;

        Footer footerView;

        //已经有footerView了
        if (headerAndFooterAdapter.getFooterViewsCount() > 0) {
            footerView = (Footer) headerAndFooterAdapter.getFooterView();
            footerView.setState(state);

            if (state == Footer.State.NetWorkError) {
                footerView.setOnClickListener(errorListener);
            }
            recyclerView.scrollToPosition(headerAndFooterAdapter.getItemCount() - 1);
        } else {
            footerView = new Footer(instance);
            footerView.setState(state);

            if (state == Footer.State.NetWorkError) {
                footerView.setOnClickListener(errorListener);
            }

            headerAndFooterAdapter.addFooterView(footerView);
            recyclerView.scrollToPosition(headerAndFooterAdapter.getItemCount() - 1);
        }
    }

    public static Footer.State getFooterViewState(RecyclerView recyclerView) {

        RecyclerView.Adapter outerAdapter = recyclerView.getAdapter();
        if (outerAdapter != null && outerAdapter instanceof HeaderAndFooterRecyclerViewAdapter) {
            if (((HeaderAndFooterRecyclerViewAdapter) outerAdapter).getFooterViewsCount() > 0) {
                Footer footerView = (Footer) ((HeaderAndFooterRecyclerViewAdapter) outerAdapter).getFooterView();
                return footerView.getState();
            }
        }

        return Footer.State.Normal;
    }

    public static void setFooterViewState(RecyclerView recyclerView, Footer.State state) {
        RecyclerView.Adapter outerAdapter = recyclerView.getAdapter();
        if (outerAdapter != null && outerAdapter instanceof HeaderAndFooterRecyclerViewAdapter) {
            if (((HeaderAndFooterRecyclerViewAdapter) outerAdapter).getFooterViewsCount() > 0) {
                Footer footerView = (Footer) ((HeaderAndFooterRecyclerViewAdapter) outerAdapter).getFooterView();
                footerView.setState(state);
            }
        }
    }

}
