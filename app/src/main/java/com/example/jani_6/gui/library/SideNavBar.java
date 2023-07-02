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

public class SideNavBar {

    private enum SNAVLocation {
        HOME(MainActivity.class, R.id.navigation_snav_home),
        TRAINING_PLAN(TrainingPlanActivity.class, R.id.navigation_snav_plangroup_trainingplan),
        MANAGE_PLANS(ManagePlansActivity.class, R.id.navigation_snav_plangroup_manageplans),
        GOALS(GoalsActivity.class, R.id.navigation_snav_plangroup_goals),
        CALENDAR(CalendarActivity.class, R.id.navigation_snav_calendargroup_calendar),
        EXERCISES(ExerciseActivity.class, R.id.navigation_snav_itemsgroup_exercises),
        WORKOUTS(WorkoutActivity.class, R.id.navigation_snav_itemsgroup_workouts),
        EQUIPMENT(EquipmentActivity.class, R.id.navigation_snav_supportgroup_equipment),
        LOCANDEVENT(LocAndEventActivity.class, R.id.navigation_snav_supportgroup_loc_events),
        SETTINGS(SettingsActivity.class, R.id.navigation_snav_settingsgroup_settings);

        final Class<? extends AppCompatActivity> activityClass;
        final int locationMenuID;

        SNAVLocation(Class<? extends AppCompatActivity> activityClass, int locationMenuID){
            this.activityClass = activityClass;
            this.locationMenuID = locationMenuID;
        }
    }

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

            for(SNAVLocation navLocation : SNAVLocation.values()){
                if(item.getItemId() == navLocation.locationMenuID){
                    activity.startActivity(new Intent(activity, navLocation.activityClass));
                    activity.finish();
                    break;
                }
            }

            /*if(item.getTitle().toString().equals("Home")){
                activity.startActivity(new Intent(activity, MainActivity.class));
            }
            activity.finish();*/
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
