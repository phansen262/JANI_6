package com.example.jani_6.gui.library;

import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import com.example.jani_6.R;
import com.example.jani_6.logic.app.plan_objects.activities.Activity;

import java.util.List;
import java.util.Objects;

public class SnavActivity extends AppCompatActivity {

    protected SideNavBar sideNavBar;
    protected boolean usingSNAV;

    //Adds SNAV as the upper left option, the SideNavBar constructor will handle setting up most of the drawer view.
    //Needs to be called in each activity to give the correct method parameters
    public void useSNAV(AppCompatActivity activity, int drawerID, int titleID){

        //Initiate side navigation bar menu
        sideNavBar = new SideNavBar(activity, drawerID, titleID);
        usingSNAV = true;
    }

    //Baseline changes from SNAV to using a back button, also sets the boolean as false. Need to override in child activity, but make sure to call super()
    public void useBackButton(){

        sideNavBar.getmBar().setHomeAsUpIndicator(R.drawable.baseline_arrow_back_24);
        usingSNAV = false;
    }

    //Handle Options Selected Event From SideNavBar or back button.
    //TODO: Check if back navigation by system back (side swipe) or bottom bar back button triggers this behavior, if it does still need to add additional check as it will only use back behavior if not using SNAV
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item){

        //If statement is actually needed, not sure what boolean is actually checking
        if(usingSNAV && sideNavBar.getmToggle().onOptionsItemSelected(item)){
            sideNavBar.setNavViewListener(this);
            return true;
        } else if (!usingSNAV){
            loadBackBehavior();
        }
        return super.onOptionsItemSelected(item);
    }

    //Empty method to be overriden by child class to provide activity custom behavior on back button
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

    //Code to return the tag of the fragment currently displayed in container, may only be applicable if only one fragment is currently in use, ie using nested fragments would break?
    //TODO: Try using fragmentcontainerview.getfragment().getTag(); {ie String tag = mBinding.containerAE.getFragment().getTag();}
    //This gets the most recently added fragment to the container view. Might have to add a null check somewhere
    //Can also try looking at backstack methods with getSupportFragmentManager().addOnBackStackChangedListener to handle determining if state change is needed on back behavior
    //Using this should allow for method of retreiving what fragment is now visible which should then be able to determine tag from that for selecting what nav is displayed on app bar.
    //Downside is that this avoids deeplink?
    public String getCurrentFragment(AppCompatActivity activity){

        List<Fragment> fragments = activity.getSupportFragmentManager().getFragments();
        if(fragments != null){
            for(Fragment fragment : fragments){
                if(fragment != null && fragment.isVisible())
                    return fragment.getTag();
            }
        }
        return null;
    }
}
