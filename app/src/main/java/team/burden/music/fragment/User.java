package team.burden.music.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;

import com.xuexiang.xfloatview.permission.FloatWindowPermission;
import com.xuexiang.xui.widget.textview.supertextview.SuperTextView;

import team.burden.music.R;
import team.burden.music.widget.FloatView;

/**
 * Created by burden on 2020/11/1.
 */
public class User extends Fragment {

    private SuperTextView switchFlow;
    private FloatView floatView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_user, container, false);

        switchFlow = view.findViewById(R.id.user_switch_float);
        switchFlow.setSwitchCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if (isChecked) {
                    if (floatView == null) {
                        floatView = new FloatView(getContext());
                        floatView.show();
                    }
                } else {
                    clearFloatView();
                }
            }
        });

        return view;
    }

    @Override
    public void onDestroyView() {
        clearFloatView();
        super.onDestroyView();
    }

    private void clearFloatView() {
        if (floatView != null) {
            floatView.clear();
            floatView = null;
        }
    }

}
