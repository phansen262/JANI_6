package com.example.jani_6.gui.main.timeline;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.jani_6.databinding.FragmentHomeTimelineBinding;

public class TimelineMainFrag extends Fragment {

    private FragmentHomeTimelineBinding mBinding;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        mBinding = FragmentHomeTimelineBinding.inflate(inflater, container, false);
        return mBinding.getRoot();
    }
}
