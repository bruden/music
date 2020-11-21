package team.burden.music.adapter;

import android.content.Context;
import android.content.pm.PackageManager;

import java.util.List;

import team.burden.music.R;
import team.burden.music.protos.Music;

/**
 * Created by burden on 2020/11/21.
 */
public class SongAdapter extends BaseRecyclerAdapter<Music.Song> {

    private PackageManager mPackageManager;

    public SongAdapter(Context context, List<Music.Song> list) {
        super(context, list);
        mPackageManager = context.getPackageManager();
    }

    @Override
    public int getItemLayoutId(int viewType) {
        return R.layout.item_song;
    }

    @Override
    public void bindData(RecyclerViewHolder holder, int position, Music.Song item) {
        holder.getTextView(R.id.item_song_title).setText(item.getTitle());
        holder.getTextView(R.id.item_song_creator).setText(item.getCreator());
    }

}
