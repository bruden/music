package team.burden.music.service.impl;

import android.accessibilityservice.AccessibilityService;
import android.accessibilityservice.GestureDescription;
import android.graphics.Path;
import android.view.accessibility.AccessibilityEvent;

import java.util.List;

import team.burden.music.config.Const;
import team.burden.music.protos.PositionOuterClass;
import team.burden.music.service.ClickService;

/**
 * Created by burden on 2020/11/7.
 */
public class ClickServiceImpl extends AccessibilityService implements ClickService {

    private static ClickService INSTANCE;

    public static ClickService getInstance() {
        return INSTANCE;
    }

    @Override
    protected void onServiceConnected() {
        INSTANCE = this;
    }

    @Override
    public void onAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
    }

    @Override
    public void onInterrupt() {

    }

    public void click(List<PositionOuterClass.Position> positions) {
        GestureDescription.Builder builder = new GestureDescription.Builder();
        for (PositionOuterClass.Position position : positions) {
            Path path = new Path();
            path.moveTo(position.getX(), position.getY());
            builder = builder.addStroke(new GestureDescription.StrokeDescription(path, Const.CLICK_START_TIME, Const.CLICK_DURATION));
        }
        GestureDescription description = builder.build();
        dispatchGesture(description, null, null);
    }
}
