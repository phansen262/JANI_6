package com.example.jani_6.gui.snav.goals;

import android.os.Bundle;

import androidx.annotation.Nullable;

import com.example.jani_6.R;
import com.example.jani_6.databinding.ActivityGoalsBinding;
import com.example.jani_6.gui.library.SnavActivity;

import java.lang.ref.WeakReference;

public class GoalsActivity extends SnavActivity {

    private ActivityGoalsBinding mBinding;
    private static WeakReference<GoalsActivity> selfReference;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        selfReference = new WeakReference<GoalsActivity>(this);

        //Initiate layout
        mBinding = ActivityGoalsBinding.inflate(getLayoutInflater());
        setContentView(mBinding.getRoot());

        //Initiate side navigation bar menu
        //sideNavBar = new SideNavBar(this, R.id.drawer_ae, R.string.equipment);
        useSNAV(this, R.id.drawer_ae, R.string.goals);
    }

    @Override
    public void useBackButton(){
        super.useBackButton();
    }

    public static WeakReference<GoalsActivity> getSelfReference(){return selfReference;}
}
