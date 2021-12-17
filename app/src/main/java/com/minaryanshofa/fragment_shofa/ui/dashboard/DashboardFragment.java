package com.minaryanshofa.fragment_shofa.ui.dashboard;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.minaryanshofa.fragment_shofa.R;

public class DashboardFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup
            container, @Nullable Bundle savedInstanceState) {
//just change the fragment_dashboard
//with the fragment you want to inflate
//like if the class is HomeFragment it should have
//if it is DashboardFragment it should have
        int fragment_dashboard = R.layout.fragment_dashboard;
        return inflater.inflate(fragment_dashboard, null);
    }
}
