package com.example.jani_6.gui.snav.equipment;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.jani_6.R;
import com.example.jani_6.gui.library.SideNavBar;

public class EquipmentActivity extends AppCompatActivity {

    public SideNavBar sideNavBar;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState){

        super.onCreate(savedInstanceState);

        //Initiate layout
        setContentView(R.layout.activity_equipment);

        //Initiate side navigation bar menu
        sideNavBar = new SideNavBar(this, R.id.drawer_ae, R.string.equipment);
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
