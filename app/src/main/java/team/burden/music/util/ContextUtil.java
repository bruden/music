package team.burden.music.util;

import android.content.Context;
import android.content.res.Resources;

/**
 * Created by burden on 2020/11/8.
 */
public class ContextUtil {

    public static int getStatusBarHeight(Context context) {
        Resources resources = context.getResources();
        int resourceId = resources.getIdentifier("status_bar_height", "dimen", "android");
        int height = resources.getDimensionPixelSize(resourceId);
        return height;
    }

}
