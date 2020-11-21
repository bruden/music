package team.burden.music.util;

import android.content.Context;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import team.burden.music.config.Const;
import team.burden.music.protos.Music;

public class SongUtil {

    private static final String LOG_TAG = "SongUtil";

    private static List<Music.Song> localSongs;

    private static boolean loaded = false;

    public static void loadLocalSongs(Context context) {
        if (loaded) {
            return;
        }
        localSongs = new ArrayList<>();
        List<String> fileNames = FileUtil.readAllFileNames(context, Const.SONG_PATH);
        for (String fileName : fileNames) {
            try {
                localSongs.add(Music.Song.parseFrom(FileUtil.readFile(context, Const.SONG_PATH, fileName)));
            } catch (Exception e) {
                Log.e(LOG_TAG, String.format("Load song %s error: %s", fileName, e));
            }
        }
        loaded = true;
    }

    // TODO: Use lock.
    public static void addLocalSong(Music.Song song) {
        for (Music.Song s : localSongs) {
            if (s.getTitle().equals(song.getTitle())) {
                return;
            }
        }
        localSongs.add(song);
    }

    public static List<Music.Song> getLocalSongs() {
        return localSongs;
    }

}
