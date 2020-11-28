package team.burden.music.service.impl;

import org.apache.commons.lang3.tuple.Pair;

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

    private static ManagedChannel managedChannel;
    private static GrpcServiceGrpc.GrpcServiceBlockingStub grpcServiceBlockingStub;

    static {
        managedChannel = ManagedChannelBuilder.forAddress(Const.SERVER_IP, Const.SERVER_PORT).usePlaintext().build();
        grpcServiceBlockingStub = GrpcServiceGrpc.newBlockingStub(managedChannel);
    }

    @Override
    public Pair<List<Music.Song>, Integer> getSongs(String text, int offset, int size) {
        List<Music.Song> result = new ArrayList<>();
        Grpc.QuerySongsRequest request = Grpc.QuerySongsRequest.newBuilder()
                .setText(text)
                .setOffset(offset)
                .setSize(size)
                .buildPartial();
        Grpc.QuerySongsResponse response = grpcServiceBlockingStub.querySongs(request);
        for (Grpc.SongWithoutTones swt : response.getSongsList()) {
            result.add(Music.Song.newBuilder()
                    .setCreator(swt.getCreator())
                    .setTitle(swt.getTitle())
                    .setCreateTime(swt.getCreateTime())
                    .setDownloadCount(swt.getDownloadCount())
                    .build());
        }
        return Pair.of(result, response.getCount());
    }


    @Override
    public Music.Song getSong(String title) {
        Grpc.QuerySongRequest request = Grpc.QuerySongRequest.newBuilder().setTitle(title).buildPartial();
        Grpc.QuerySongResponse response = grpcServiceBlockingStub.querySong(request);
        return response.getSong();
    }
}
