package com.example.jani_6.gui.library;

import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;

public class SnavActivity extends AppCompatActivity {

    public SideNavBar sideNavBar;
    public boolean usingSNAV;

    //Add SNAV
    public void useSNAV(AppCompatActivity activity, int drawerID, int titleID){

        //Initiate side navigation bar menu
        sideNavBar = new SideNavBar(activity, drawerID, titleID);
        usingSNAV = true;
    }

    public void useBackButton(){

        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        usingSNAV = false;
    }

    //Handle Options Selected Event From SideNavBar
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item){

        //If statement is actually needed
        if(sideNavBar.getmToggle().onOptionsItemSelected(item)){
            sideNavBar.setNavViewListener(this);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
