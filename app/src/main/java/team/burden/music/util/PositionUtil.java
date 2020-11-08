package team.burden.music.util;

import team.burden.music.protos.PositionOuterClass;

/**
 * Created by burden on 2020/11/7.
 */
public class PositionUtil {

    private static final PositionOuterClass.UserPosition DEFAULT_USER_POSITION;

    static {
        PositionOuterClass.UserPosition.Builder userPositionBuilder = PositionOuterClass.UserPosition.newBuilder();

        userPositionBuilder.addPositions(PositionOuterClass.Position.newBuilder().setX(435).setY(380).build());
        userPositionBuilder.addPositions(PositionOuterClass.Position.newBuilder().setX(539).setY(380).build());
        userPositionBuilder.addPositions(PositionOuterClass.Position.newBuilder().setX(629).setY(380).build());
        userPositionBuilder.addPositions(PositionOuterClass.Position.newBuilder().setX(746).setY(380).build());
        userPositionBuilder.addPositions(PositionOuterClass.Position.newBuilder().setX(851).setY(380).build());
        userPositionBuilder.addPositions(PositionOuterClass.Position.newBuilder().setX(435).setY(491).build());
        userPositionBuilder.addPositions(PositionOuterClass.Position.newBuilder().setX(539).setY(491).build());
        userPositionBuilder.addPositions(PositionOuterClass.Position.newBuilder().setX(629).setY(491).build());
        userPositionBuilder.addPositions(PositionOuterClass.Position.newBuilder().setX(746).setY(491).build());
        userPositionBuilder.addPositions(PositionOuterClass.Position.newBuilder().setX(851).setY(491).build());
        userPositionBuilder.addPositions(PositionOuterClass.Position.newBuilder().setX(435).setY(593).build());
        userPositionBuilder.addPositions(PositionOuterClass.Position.newBuilder().setX(539).setY(593).build());
        userPositionBuilder.addPositions(PositionOuterClass.Position.newBuilder().setX(629).setY(593).build());
        userPositionBuilder.addPositions(PositionOuterClass.Position.newBuilder().setX(746).setY(593).build());
        userPositionBuilder.addPositions(PositionOuterClass.Position.newBuilder().setX(851).setY(593).build());

        DEFAULT_USER_POSITION = userPositionBuilder.build();
    }

    public static PositionOuterClass.UserPosition getDefaultUserPosition() {
        return DEFAULT_USER_POSITION;
    }

}
