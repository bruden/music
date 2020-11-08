package team.burden.music.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.xuexiang.xui.widget.actionbar.TitleBar;
import com.xuexiang.xui.widget.searchview.MaterialSearchView;

import java.util.List;

import team.burden.music.R;
import team.burden.music.model.Song;

/**
 * Created by burden on 2020/10/31.
 */
public class Home extends Fragment {

    private View view;
    private MaterialSearchView searchView;
    private TitleBar titleBar;

    private List<Song> songs;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_home, container, false);
        init();
        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
    }

    private void init() {
        searchView = view.findViewById(R.id.home_search_view);
        searchView.setVoiceSearch(false);
        searchView.setEllipsize(true);
        searchView.setOnSearchViewListener(new MaterialSearchView.SearchViewListener() {
            @Override
            public void onSearchViewShown() {
                //Do some magic
            }

            @Override
            public void onSearchViewClosed() {
                //Do some magic
            }
        });
        searchView.setSubmitOnClick(true);

        titleBar = view.findViewById(R.id.home_title_bar);
        titleBar.addAction(new TitleBar.ImageAction(R.drawable.action_search) {

            @Override
            public void performAction(View view) {
                searchView.showSearch();
            }
        });
    }
}
