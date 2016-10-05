package scs2682.session4.ui;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import scs2682.session4.R;

public class BackStackSupportFragment extends Fragment {
    public static final String NAME = BackStackSupportFragment.class.getSimpleName();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        
        return inflater.inflate(R.layout.backstacksupportfragment, container, false);
    }
}
