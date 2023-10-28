package com.example.jani_6.gui.snav.workout;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.jani_6.R;
import com.example.jani_6.databinding.ActivityCalendarBinding;
import com.example.jani_6.databinding.ActivityWorkoutsBinding;
import com.example.jani_6.gui.library.SnavActivity;
import com.example.jani_6.gui.snav.calendar.CalendarActivity;

import java.lang.ref.WeakReference;

public class WorkoutActivity extends SnavActivity {

    private ActivityWorkoutsBinding mBinding;
    private static WeakReference<WorkoutActivity> selfReference;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        selfReference = new WeakReference<WorkoutActivity>(this);

        //Initiate layout
        mBinding = ActivityWorkoutsBinding.inflate(getLayoutInflater());
        setContentView(mBinding.getRoot());

        //Initiate side navigation bar menu
        //sideNavBar = new SideNavBar(this, R.id.drawer_ae, R.string.equipment);
        useSNAV(this, R.id.drawer_ae, R.string.workouts);
    }

    @Override
    public void useBackButton(){
        super.useBackButton();
    }

    public static WeakReference<WorkoutActivity> getSelfReference(){return selfReference;}
}
