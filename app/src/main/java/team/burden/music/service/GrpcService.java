package team.burden.music.service;

import java.util.List;

import team.burden.music.protos.Music;

/**
 * Created by burden on 2020/11/21.
 */
public interface GrpcService {

    List<Music.Song> getSongs();

    Music.Song getSong(String title);

}
