package com.example.jani_6.gui.snav.exercise;

import android.os.Bundle;

import androidx.annotation.Nullable;

import com.example.jani_6.R;
import com.example.jani_6.databinding.ActivityExercisesBinding;
import com.example.jani_6.gui.library.SnavActivity;

import java.lang.ref.WeakReference;

public class ExerciseActivity extends SnavActivity {

    private ActivityExercisesBinding mBinding;
    private static WeakReference<ExerciseActivity> selfReference;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        selfReference = new WeakReference<ExerciseActivity>(this);

        //Initiate layout
        mBinding = ActivityExercisesBinding.inflate(getLayoutInflater());
        setContentView(mBinding.getRoot());

        //Initiate side navigation bar menu
        //sideNavBar = new SideNavBar(this, R.id.drawer_ae, R.string.equipment);
        useSNAV(this, R.id.drawer_ae, R.string.exercises);
    }

    @Override
    public void useBackButton(){
        super.useBackButton();
    }

    public static WeakReference<ExerciseActivity> getSelfReference(){return selfReference;}
}
