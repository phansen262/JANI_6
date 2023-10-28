package com.example.jani_6.gui.snav.trainingplan;

import android.os.Bundle;

import androidx.annotation.Nullable;

import com.example.jani_6.R;
import com.example.jani_6.databinding.ActivityTrainingplanBinding;
import com.example.jani_6.gui.library.SnavActivity;

import java.lang.ref.WeakReference;

public class TrainingPlanActivity extends SnavActivity {

    private ActivityTrainingplanBinding mBinding;
    private static WeakReference<TrainingPlanActivity> selfReference;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        selfReference = new WeakReference<TrainingPlanActivity>(this);

        //Initiate layout
        mBinding = ActivityTrainingplanBinding.inflate(getLayoutInflater());
        setContentView(mBinding.getRoot());

        //Initiate side navigation bar menu
        //sideNavBar = new SideNavBar(this, R.id.drawer_ae, R.string.equipment);
        useSNAV(this, R.id.drawer_ae, R.string.training_plans);
    }

    @Override
    public void useBackButton(){
        super.useBackButton();
    }

    public static WeakReference<TrainingPlanActivity> getSelfReference(){return selfReference;}
}
