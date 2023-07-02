package com.example.jani_6.gui.main;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.jani_6.R;
import com.example.jani_6.gui.library.SideNavBar;

public class MainActivity extends AppCompatActivity {

    public SideNavBar sideNavBar;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState){

        super.onCreate(savedInstanceState);

        //Initiate layout
        setContentView(R.layout.activity_main);

        //Initiate side navigation bar menu
        sideNavBar = new SideNavBar(this, R.id.drawer_am, R.string.app_name);

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
