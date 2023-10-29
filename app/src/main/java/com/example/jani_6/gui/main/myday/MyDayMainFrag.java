package com.example.jani_6.gui.main.myday;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.jani_6.databinding.FragmentHomeMydayBinding;

public class MyDayMainFrag extends Fragment {

    private FragmentHomeMydayBinding mBinding;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        mBinding = FragmentHomeMydayBinding.inflate(inflater, container, false);
        return mBinding.getRoot();
    }
}
