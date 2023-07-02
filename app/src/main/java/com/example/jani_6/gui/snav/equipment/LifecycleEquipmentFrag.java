package com.example.jani_6.gui.snav.equipment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.jani_6.databinding.FragmentEquipmentLifecycleMainBinding;

public class LifecycleEquipmentFrag extends Fragment {

    private FragmentEquipmentLifecycleMainBinding mBinding;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        mBinding = FragmentEquipmentLifecycleMainBinding.inflate(inflater, container, false);
        return mBinding.getRoot();
    }
}
