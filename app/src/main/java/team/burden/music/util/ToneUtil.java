package team.burden.music.util;

import java.util.ArrayList;
import java.util.List;

import team.burden.music.protos.Music;
import team.burden.music.protos.PositionOuterClass;

/**
 * Created by burden on 2020/11/7.
 */
public class ToneUtil {

    private static final String[] TONE_STRING = {"C4", "D4", "E4", "F4", "G4",
            "A4", "B4", "C5", "D5", "E5",
            "F5", "G5", "A5", "B5", "C6"};

    public static List<PositionOuterClass.Position> toPosition(Music.Tone tone, PositionOuterClass.UserPosition userPosition) {
        List<PositionOuterClass.Position> positions = new ArrayList<>();
        for (int i = 0, len = tone.getToneCount(); i < len; i++) {
            positions.add(userPosition.getPositions(tone.getTone(i)));
        }
        return positions;
    }

    public static String getToneString(int index) {
        return TONE_STRING[index];
    }

}
