package com.example.jani_6.gui.library;

import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.jani_6.R;

import java.util.Objects;

public class SnavActivity extends AppCompatActivity {

    protected SideNavBar sideNavBar;
    protected boolean usingSNAV;

    //Add SNAV
    public void useSNAV(AppCompatActivity activity, int drawerID, int titleID){

        //Initiate side navigation bar menu
        sideNavBar = new SideNavBar(activity, drawerID, titleID);
        usingSNAV = true;
    }

    public void useBackButton(){

        sideNavBar.getmBar().setHomeAsUpIndicator(R.drawable.baseline_arrow_back_24);
        usingSNAV = false;
    }

    //Handle Options Selected Event From SideNavBar
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item){

        //If statement is actually needed
        if(usingSNAV && sideNavBar.getmToggle().onOptionsItemSelected(item)){
            sideNavBar.setNavViewListener(this);
            return true;
        } else if (!usingSNAV){
            loadBackBehavior();
        }
        return super.onOptionsItemSelected(item);
    }

    //Empty method to be overriden by child class to provide behavior on back button
    protected void loadBackBehavior(){}

    public SideNavBar getSideNavBar() {
        return sideNavBar;
    }

    public boolean isUsingSNAV() {
        return usingSNAV;
    }

    public void setUsingSNAV(boolean usingSNAV) {
        this.usingSNAV = usingSNAV;
    }
}
