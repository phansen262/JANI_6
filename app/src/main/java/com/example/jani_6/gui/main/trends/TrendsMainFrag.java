package com.example.jani_6.gui.main.trends;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.jani_6.databinding.FragmentHomeTrendsBinding;

public class TrendsMainFrag extends Fragment {

    private FragmentHomeTrendsBinding mBinding;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        mBinding = FragmentHomeTrendsBinding.inflate(inflater, container, false);
        return mBinding.getRoot();
    }
}
