package com.example.jani_6.logic.app.structure.room;

import android.app.Activity;

import androidx.room.Room;

public class JDatabaseHandler {

    public static JDatabase jDatabase;

    public static void setAppServer(Activity activity){

        jDatabase = Room.databaseBuilder(activity.getApplicationContext(), JDatabase.class, "new-base").fallbackToDestructiveMigration().build();
    }
}
