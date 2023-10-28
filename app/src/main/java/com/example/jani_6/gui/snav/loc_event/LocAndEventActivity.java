package com.example.jani_6.gui.snav.loc_event;

import android.os.Bundle;

import androidx.annotation.Nullable;

import com.example.jani_6.R;
import com.example.jani_6.databinding.ActivityLocEventBinding;
import com.example.jani_6.gui.library.SnavActivity;

import java.lang.ref.WeakReference;

public class LocAndEventActivity extends SnavActivity {

    private ActivityLocEventBinding mBinding;
    private static WeakReference<LocAndEventActivity> selfReference;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        selfReference = new WeakReference<LocAndEventActivity>(this);

        //Initiate layout
        mBinding = ActivityLocEventBinding.inflate(getLayoutInflater());
        setContentView(mBinding.getRoot());

        //Initiate side navigation bar menu
        //sideNavBar = new SideNavBar(this, R.id.drawer_ae, R.string.equipment);
        useSNAV(this, R.id.drawer_ae, R.string.loc_and_events);
    }

    @Override
    public void useBackButton(){
        super.useBackButton();
    }

    public static WeakReference<LocAndEventActivity> getSelfReference(){return selfReference;}
}
