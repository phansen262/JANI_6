package com.example.jani_6.gui.snav.trainingplan;

import android.os.Bundle;

import androidx.annotation.Nullable;

import com.example.jani_6.R;
import com.example.jani_6.databinding.ActivityManageplansBinding;
import com.example.jani_6.gui.library.SnavActivity;

import java.lang.ref.WeakReference;

public class ManagePlansActivity extends SnavActivity {

    private ActivityManageplansBinding mBinding;
    private static WeakReference<ManagePlansActivity> selfReference;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        selfReference = new WeakReference<ManagePlansActivity>(this);

        //Initiate layout
        mBinding = ActivityManageplansBinding.inflate(getLayoutInflater());
        setContentView(mBinding.getRoot());

        //Initiate side navigation bar menu
        //sideNavBar = new SideNavBar(this, R.id.drawer_ae, R.string.equipment);
        useSNAV(this, R.id.drawer_ae, R.string.manage_plans);
    }

    @Override
    public void useBackButton(){
        super.useBackButton();
    }

    public static WeakReference<ManagePlansActivity> getSelfReference(){return selfReference;}
}
