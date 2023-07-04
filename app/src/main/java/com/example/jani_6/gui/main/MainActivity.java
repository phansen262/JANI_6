package com.example.jani_6.gui.main;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.jani_6.R;
import com.example.jani_6.gui.library.SideNavBar;
import com.example.jani_6.gui.library.SnavActivity;
import com.example.jani_6.logic.app.plan_objects.equipment.StaticEquipment;
import com.example.jani_6.logic.app.plan_objects.equipment.StaticEquipmentDAO;
import com.example.jani_6.logic.app.structure.room.JDatabase;
import com.example.jani_6.logic.app.structure.room.JDatabaseHandler;
import com.example.jani_6.logic.app.structure.threads.MExecutor;
import com.example.jani_6.logic.app.support_objects.Sport;

import java.util.ArrayList;

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
