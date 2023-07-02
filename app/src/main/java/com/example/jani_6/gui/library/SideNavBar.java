package com.example.jani_6.gui.library;

import android.content.Intent;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import com.example.jani_6.R;
import com.example.jani_6.gui.main.MainActivity;
import com.example.jani_6.gui.snav.calendar.CalendarActivity;
import com.example.jani_6.gui.snav.equipment.EquipmentActivity;
import com.example.jani_6.gui.snav.exercise.ExerciseActivity;
import com.example.jani_6.gui.snav.goals.GoalsActivity;
import com.example.jani_6.gui.snav.loc_event.LocAndEventActivity;
import com.example.jani_6.gui.snav.settings.SettingsActivity;
import com.example.jani_6.gui.snav.trainingplan.ManagePlansActivity;
import com.example.jani_6.gui.snav.trainingplan.TrainingPlanActivity;
import com.example.jani_6.gui.snav.workout.WorkoutActivity;
import com.google.android.material.navigation.NavigationView;

import java.util.HashMap;

public class SideNavBar {

    HashMap<Integer, Class<? extends AppCompatActivity>> snavLocations = new HashMap<Integer, Class<? extends AppCompatActivity>>(){{
        put(R.id.navigation_snav_home, MainActivity.class);
        put(R.id.navigation_snav_plangroup_trainingplan, TrainingPlanActivity.class);
        put(R.id.navigation_snav_plangroup_manageplans, ManagePlansActivity.class);
        put(R.id.navigation_snav_plangroup_goals, GoalsActivity.class);
        put(R.id.navigation_snav_calendargroup_calendar, CalendarActivity.class);
        put(R.id.navigation_snav_itemsgroup_exercises, ExerciseActivity.class);
        put(R.id.navigation_snav_itemsgroup_workouts, WorkoutActivity.class);
        put(R.id.navigation_snav_supportgroup_equipment, EquipmentActivity.class);
        put(R.id.navigation_snav_supportgroup_loc_events, LocAndEventActivity.class);
        put(R.id.navigation_snav_settingsgroup_settings, SettingsActivity.class);
    }};

    private final ActionBarDrawerToggle mToggle;
    private final ActionBar mBar;

    public SideNavBar(@NonNull AppCompatActivity activity, int drawerID, int barTitle){

        //Handle Action Bar Creation
        mBar = activity.getSupportActionBar();
        mBar.setHomeAsUpIndicator(R.drawable.baseline_menu_24);
        mBar.setDisplayHomeAsUpEnabled(true);
        setBarTitle(barTitle);

        //Handle drawer layout and toggle
        DrawerLayout drawerLayout = activity.findViewById(drawerID);
        mToggle = new ActionBarDrawerToggle(activity, drawerLayout, barTitle, R.string.app_name);
        drawerLayout.addDrawerListener(mToggle);
        mToggle.syncState();
    }

    //Set Listener for Navigation
    public void setNavViewListener(@NonNull AppCompatActivity activity){

        NavigationView navigationView = activity.findViewById(R.id.navigation_view_gsm);
        navigationView.setNavigationItemSelectedListener(item -> {

            for(Integer menuID : snavLocations.keySet()){
                if(menuID == item.getItemId()){
                    activity.startActivity(new Intent(activity, snavLocations.get(menuID)));
                    activity.finish();
                    break;
                }
            }

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
