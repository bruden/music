package team.burden.music.service.impl;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import team.burden.music.config.Const;
import team.burden.music.protos.Grpc;
import team.burden.music.protos.GrpcServiceGrpc;
import team.burden.music.protos.Music;
import team.burden.music.service.GrpcService;

/**
 * Created by burden on 2020/11/21.
 */
public class GrpcServiceImpl implements GrpcService {

    private final static String LOG_TAG = "GrpcServiceImpl";

    private static ManagedChannel managedChannel;
    private static GrpcServiceGrpc.GrpcServiceBlockingStub grpcServiceBlockingStub;

    static {
        managedChannel = ManagedChannelBuilder.forAddress(Const.SERVER_IP, Const.SERVER_PORT).usePlaintext().build();
        grpcServiceBlockingStub = GrpcServiceGrpc.newBlockingStub(managedChannel);
    }

    @Override
    public List<Music.Song> getSongs() {
        List<Music.Song> result = new ArrayList<>();
        try {
            Grpc.QueryAllSongsRequest request = Grpc.QueryAllSongsRequest.newBuilder().buildPartial();
            Grpc.QueryAllSongsResponse response = grpcServiceBlockingStub.queryAllSongs(request);
            for (Grpc.SongWithoutTones swt : response.getSongsList()) {
                result.add(Music.Song.newBuilder()
                        .setCreator(swt.getCreator())
                        .setTitle(swt.getTitle())
                        .build());
            }
            return result;
        } catch (Exception e) {
            Log.e(LOG_TAG, String.format("get songs error:%s", e));
        }
        return result;
    }

    @Override
    public Music.Song getSong(String title) {
        try {
            Grpc.QuerySongRequest request = Grpc.QuerySongRequest.newBuilder().setTitle(title).buildPartial();
            Grpc.QuerySongResponse response = grpcServiceBlockingStub.querySong(request);
            return response.getSong();
        } catch (Exception e) {
            Log.e(LOG_TAG, String.format("get song error:%s", e));
        }
        return null;
    }
}
