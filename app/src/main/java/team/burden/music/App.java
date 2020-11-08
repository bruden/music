package team.burden.music;

import android.app.Application;

import com.xuexiang.xui.XUI;

/**
 * Created by burden on 2020/10/31.
 */
public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        XUI.init(this);
        XUI.debug(true);
    }

}
