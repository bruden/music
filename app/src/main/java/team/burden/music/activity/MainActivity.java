package team.burden.music.activity;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.ashokvarma.bottomnavigation.BottomNavigationBar;
import com.ashokvarma.bottomnavigation.BottomNavigationItem;
import com.xuexiang.xfloatview.permission.FloatWindowPermission;

import team.burden.music.R;
import team.burden.music.fragment.Home;
import team.burden.music.fragment.User;

/**
 * Created by burden on 2020/10/31.
 */
public class MainActivity extends AppCompatActivity implements BottomNavigationBar.OnTabSelectedListener {

    private BottomNavigationBar bar;
    private Home home;
    private User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bar = findViewById(R.id.main_bottom_navigation_bar);
        bar.setTabSelectedListener(this)
                .setBarBackgroundColor(R.color.colorPrimary)
                .addItem(new BottomNavigationItem(R.drawable.home, R.string.bar_home).setActiveColorResource(R.color.colorAccent))
                .addItem(new BottomNavigationItem(R.drawable.people, R.string.bar_user).setActiveColorResource(R.color.colorAccent))
                .setFirstSelectedPosition(0)
                .initialise();
        setDefaultFragment();

        FloatWindowPermission.getInstance().applyFloatWindowPermission(this);
    }

    private void setDefaultFragment() {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        home = new Home();
        transaction.replace(R.id.main_fragment, home).commit();
    }

    @Override
    public void onTabSelected(int position) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        switch (position) {
            case 0:
                if (home == null) home = new Home();
                transaction.replace(R.id.main_fragment, home);
                break;
            case 1:
                if (user == null) user = new User();
                transaction.replace(R.id.main_fragment, user);
                break;
        }
        transaction.commit();
    }

    @Override
    public void onTabUnselected(int position) {
    }

    @Override
    public void onTabReselected(int position) {
    }

}
