package team.burden.music.adapter;

import android.content.Context;
import android.content.pm.PackageManager;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import team.burden.music.R;
import team.burden.music.protos.Music;

/**
 * Created by burden on 2020/11/21.
 */
public class HomeSongAdapter extends BaseRecyclerAdapter<Music.Song> {

    private PackageManager mPackageManager;

    private OnItemClickListener mClickListener;

    public HomeSongAdapter(Context context, List<Music.Song> list) {
        super(context, list);
        mPackageManager = context.getPackageManager();
    }

    @Override
    public int getItemLayoutId(int viewType) {
        return R.layout.item_home_song;
    }

    @Override
    public void bindData(RecyclerViewHolder holder, int position, Music.Song item) {
        holder.getTextView(R.id.item_home_song_title).setText(item.getTitle());
        holder.getTextView(R.id.item_home_song_creator).setText(item.getCreator());
    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        final RecyclerViewHolder holder = new RecyclerViewHolder(mContext,
                mInflater.inflate(getItemLayoutId(viewType), parent, false));
        if (mClickListener != null) {
            holder.itemView.findViewById(R.id.item_home_song_download).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mClickListener.onItemClick(holder.itemView, holder.getLayoutPosition());
                }
            });
        }
        return holder;
    }

    @Override
    public void setOnItemClickListener(OnItemClickListener listener) {
        mClickListener = listener;
    }

}
