package com.example.jani_6.logic.app.structure;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public abstract class Single {

    @PrimaryKey protected int msID;
    protected boolean isActive;
    protected AppObjectDict classType;

    //Full Constructor
    protected Single(int msID, boolean isActive, AppObjectDict classType){
        this.msID = msID;
        this.isActive = isActive;
        this.classType = classType;
    }

    public int getMsID() {
        return msID;
    }

    public void setMsID(int msID) {
        this.msID = msID;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public AppObjectDict getClassType() {
        return classType;
    }

    public void setClassType(AppObjectDict classType) {
        this.classType = classType;
    }
}
