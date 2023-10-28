package com.example.jani_6.gui.snav.calendar;

import android.os.Bundle;

import androidx.annotation.Nullable;

import com.example.jani_6.R;
import com.example.jani_6.databinding.ActivityCalendarBinding;
import com.example.jani_6.gui.library.SnavActivity;

import java.lang.ref.WeakReference;

public class CalendarActivity extends SnavActivity {

    private ActivityCalendarBinding mBinding;
    private static WeakReference<CalendarActivity> selfReference;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        selfReference = new WeakReference<CalendarActivity>(this);

        //Initiate layout
        mBinding = ActivityCalendarBinding.inflate(getLayoutInflater());
        setContentView(mBinding.getRoot());

        //Initiate side navigation bar menu
        //sideNavBar = new SideNavBar(this, R.id.drawer_ae, R.string.equipment);
        useSNAV(this, R.id.drawer_ae, R.string.calendar);
    }

    @Override
    public void useBackButton(){
        super.useBackButton();
    }

    public static WeakReference<CalendarActivity> getSelfReference(){return selfReference;}
}
