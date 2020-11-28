package team.burden.music.service;

import org.apache.commons.lang3.tuple.Pair;

import java.util.List;

import team.burden.music.protos.Music;

/**
 * Created by burden on 2020/11/21.
 */
public interface GrpcService {

    Pair<List<Music.Song>, Integer> getSongs(String text, int offset, int size);

    Music.Song getSong(String title);

}
