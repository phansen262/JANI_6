package com.example.jani_6.gui.launcher;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.jani_6.R;
import com.example.jani_6.gui.main.MainActivity;
import com.example.jani_6.logic.app.structure.room.JDatabaseHandler;
import com.example.jani_6.logic.app.structure.threads.MExecutor;

import java.util.ArrayList;

public class LauncherActivity extends AppCompatActivity {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState){

        super.onCreate(savedInstanceState);

        //Entrance time log to set control for minimum splashscreen display
        long start = System.currentTimeMillis();

        //TODO: Move initialization into async task
        /*Start Initialization Methods*/
        setContentView(R.layout.activity_launcher);

        setServers();
        /*End Initialization Methods*/

        //Exit time log to set control for minimum splashscreen display
        long end = System.currentTimeMillis();

        //Check startup timer and log
        long elapsed = end - start;
        Log.d("JANI INFO", "Startup time in Millie's for initialization:  " + elapsed);

        //Proceed to Next Activity
        if(elapsed > 1500){
            toMainActivity();
        } else {
            //Set remaining time to wait
            new Handler(Looper.getMainLooper()).postDelayed(this::toMainActivity, 1500 - elapsed);
        }
    }

    //Method to move to main activity
    private void toMainActivity(){
        startActivity(new Intent(this, MainActivity.class));
        finish();
    }

    //Handles server and database initialization on app startup. 
    //Methods for handling versioning and safe checking/validating stored data
    private void setServers(){
        JDatabaseHandler.setAppServer(this);
    }
}
