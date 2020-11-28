package team.burden.music.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.cundong.recyclerview.EndlessRecyclerOnScrollListener;
import com.cundong.recyclerview.HeaderAndFooterRecyclerViewAdapter;
import com.cundong.recyclerview.RecyclerViewUtils;
import com.xuexiang.xui.widget.actionbar.TitleBar;
import com.xuexiang.xui.widget.searchview.MaterialSearchView;

import org.apache.commons.lang3.tuple.Pair;

import java.util.ArrayList;
import java.util.List;

import team.burden.music.R;
import team.burden.music.adapter.BaseRecyclerAdapter;
import team.burden.music.adapter.HomeSongAdapter;
import team.burden.music.config.Const;
import team.burden.music.protos.Music;
import team.burden.music.service.GrpcService;
import team.burden.music.service.impl.GrpcServiceImpl;
import team.burden.music.util.FileUtil;
import team.burden.music.util.RecyclerViewStateUtil;
import team.burden.music.util.SongUtil;
import team.burden.music.widget.Footer;

/**
 * Created by burden on 2020/10/31.
 */
public class Home extends Fragment {

    private final static String LOG_TAG = "Home";

    private View view;
    private MaterialSearchView searchView;
    private TitleBar titleBar;
    private RecyclerView recyclerView;
    private SwipeRefreshLayout swipeRefreshLayout;

    private HomeSongAdapter homeSongAdapter;
    private HeaderAndFooterRecyclerViewAdapter headerAndFooterRecyclerViewAdapter;

    private GrpcService grpcService;

    private List<Music.Song> songs;

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
        initSongs();

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

        homeSongAdapter = new HomeSongAdapter(getContext(), songs);
        homeSongAdapter.setOnItemClickListener(new BaseRecyclerAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(View itemView, int pos) {
                Log.d(LOG_TAG, String.format("Start downloading song: %s", songs.get(pos).getTitle()));
                downSong(songs.get(pos).getTitle());
            }
        });
        headerAndFooterRecyclerViewAdapter = new HeaderAndFooterRecyclerViewAdapter(homeSongAdapter);
        recyclerView = view.findViewById(R.id.home_recycler_view);
        recyclerView.setAdapter(headerAndFooterRecyclerViewAdapter);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.addItemDecoration(new DividerItemDecoration(getContext(), DividerItemDecoration.VERTICAL));
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.addOnScrollListener(new EndlessRecyclerOnScrollListener() {
            @Override
            public void onLoadNextPage(View view) {
                super.onLoadNextPage(view);
                loadSongs(false);
            }
        });
        RecyclerViewUtils.setFooterView(recyclerView, new Footer(getContext()));
        headerAndFooterRecyclerViewAdapter.notifyDataSetChanged();

        swipeRefreshLayout = view.findViewById(R.id.home_swipe);
        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                loadSongs(true);
                try {
                    Thread.sleep(1000);
                    swipeRefreshLayout.setRefreshing(false);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        grpcService = new GrpcServiceImpl();
        loadSongs(false);
    }

    private void initSongs() {
        songs = new ArrayList<>();
        SongUtil.loadLocalSongs(getContext());
    }

    private void loadSongs(final boolean refresh) {
        if (refresh) {
            songs.clear();
        }
        RecyclerViewStateUtil.setFooterViewState(getActivity(), recyclerView, Footer.State.Loading, null);
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    final Footer.State state;
                    Pair<List<Music.Song>, Integer> result = grpcService.getSongs("", songs.size(), Const.PAGE_SIZE);
                    for (Music.Song s : result.getKey()) {
                        songs.add(s);
                    }
                    if (songs.size() == result.getValue()) {
                        state = Footer.State.TheEnd;
                    } else {
                        state = Footer.State.Normal;
                    }
                    getActivity().runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            homeSongAdapter.notifyDataSetChanged();
                            RecyclerViewStateUtil.setFooterViewState(getActivity(), recyclerView, state, null);
                            if (refresh) {
                                swipeRefreshLayout.setRefreshing(false);
                            }
                        }
                    });
                } catch (Exception e) {
                    Log.e(LOG_TAG, String.format("Load songs error: %s", e));
                    getActivity().runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            homeSongAdapter.notifyDataSetChanged();
                            RecyclerViewStateUtil.setFooterViewState(getActivity(), recyclerView, Footer.State.NetWorkError, null);
                            if (refresh) {
                                swipeRefreshLayout.setRefreshing(false);
                            }
                        }
                    });
                }
            }
        }).start();
    }

    private void downSong(final String title) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Music.Song song = grpcService.getSong(title);
                    FileUtil.writeFile(getContext(), Const.SONG_PATH, title, song.toByteArray());
                    SongUtil.addLocalSong(song);
                    Log.d(LOG_TAG, String.format("Download song completed: %s", song.getTitle()));
                } catch (Exception e) {
                    Log.e(LOG_TAG, String.format("Download song %s error: %s", title, e));
                }
            }
        }).start();
    }

}
