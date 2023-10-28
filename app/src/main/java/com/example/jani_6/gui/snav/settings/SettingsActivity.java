package com.example.jani_6.gui.snav.settings;

import android.os.Bundle;

import androidx.annotation.Nullable;

import com.example.jani_6.R;
import com.example.jani_6.databinding.ActivitySettingsBinding;
import com.example.jani_6.gui.library.SnavActivity;

import java.lang.ref.WeakReference;

public class SettingsActivity extends SnavActivity {

    private ActivitySettingsBinding mBinding;
    private static WeakReference<SettingsActivity> selfReference;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        selfReference = new WeakReference<SettingsActivity>(this);

        //Initiate layout
        mBinding = ActivitySettingsBinding.inflate(getLayoutInflater());
        setContentView(mBinding.getRoot());

        //Initiate side navigation bar menu
        //sideNavBar = new SideNavBar(this, R.id.drawer_ae, R.string.equipment);
        useSNAV(this, R.id.drawer_ae, R.string.settings);
    }

    @Override
    public void useBackButton(){
        super.useBackButton();
    }

    public static WeakReference<SettingsActivity> getSelfReference(){return selfReference;}
}
