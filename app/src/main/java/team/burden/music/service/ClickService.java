package team.burden.music.service;

import java.util.List;

import team.burden.music.protos.PositionOuterClass;

/**
 * Created by burden on 2020/11/7.
 */
public interface ClickService {

    void click(List<PositionOuterClass.Position> positions);

}
