package com.example.jani_6.gui.library;

import android.content.Intent;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import com.example.jani_6.R;
import com.example.jani_6.gui.main.MainActivity;
import com.google.android.material.navigation.NavigationView;

public class SideNavBar {
    private final ActionBarDrawerToggle mToggle;
    private final ActionBar mBar;

    public SideNavBar(@NonNull AppCompatActivity activity, int barTitle){

        //Handle Action Bar Creation
        mBar = activity.getSupportActionBar();
        mBar.setHomeAsUpIndicator(R.drawable.baseline_menu_24);
        mBar.setDisplayHomeAsUpEnabled(true);
        setBarTitle(barTitle);

        //Handle drawer layout and toggle
        DrawerLayout drawerLayout = activity.findViewById(R.id.drawer_am);
        mToggle = new ActionBarDrawerToggle(activity, drawerLayout, barTitle, R.string.app_name);
        drawerLayout.addDrawerListener(mToggle);
        mToggle.syncState();
    }

    //Set Listener for Navigation
    public void setNavViewListener(AppCompatActivity activity){

        NavigationView navigationView = activity.findViewById(R.id.navigation_view_gsm);
        navigationView.setNavigationItemSelectedListener(item -> {

            if(item.getTitle().toString().equals("Home")){
                activity.startActivity(new Intent(activity, MainActivity.class));
            }
            //TODO: Location to add new destinations
            activity.finish();
            return false;
        });
    }

    //Need to supply as String Resource
    public void setBarTitle(int barTitle){
        mBar.setTitle(barTitle);
    }

    //Allow toggle to be "got" at location, needed within location onOptionsItemSelected method
    public ActionBarDrawerToggle getmToggle(){return mToggle;}
}
