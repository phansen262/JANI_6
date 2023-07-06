package com.example.jani_6.gui.main;

import android.os.Bundle;

import androidx.annotation.Nullable;

import com.example.jani_6.R;
import com.example.jani_6.gui.library.SnavActivity;

public class MainActivity extends SnavActivity {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState){

        super.onCreate(savedInstanceState);

        //Initiate layout
        setContentView(R.layout.activity_main);

        //Initiate side navigation bar menu
        //sideNavBar = new SideNavBar(this, R.id.drawer_am, R.string.app_name);
        useSNAV(this, R.id.drawer_am, R.string.app_name);
    }
}
