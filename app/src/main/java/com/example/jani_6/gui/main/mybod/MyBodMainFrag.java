package com.example.jani_6.gui.main.mybod;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.jani_6.databinding.FragmentHomeMybodBinding;

public class MyBodMainFrag extends Fragment {

    private FragmentHomeMybodBinding mBinding;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        mBinding = FragmentHomeMybodBinding.inflate(inflater, container, false);
        return mBinding.getRoot();
    }
}
