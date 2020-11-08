package team.burden.music.util;

import java.util.ArrayList;
import java.util.List;

import team.burden.music.model.Tone;
import team.burden.music.protos.PositionOuterClass;

/**
 * Created by burden on 2020/11/7.
 */
public class ToneUtil {

    public static List<PositionOuterClass.Position> toPosition(Tone tone, PositionOuterClass.UserPosition userPosition) {
        List<PositionOuterClass.Position> positions = new ArrayList<>();
        for (int i : tone.getTone()) {
            positions.add(userPosition.getPositions(i));
        }
        return positions;
    }

}
