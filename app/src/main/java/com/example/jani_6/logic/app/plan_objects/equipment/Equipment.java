package com.example.jani_6.logic.app.plan_objects.equipment;

import androidx.room.ColumnInfo;
import androidx.room.Embedded;
import androidx.room.Entity;

import com.example.jani_6.logic.app.structure.AppObjectDict;
import com.example.jani_6.logic.app.structure.Single;
import com.example.jani_6.logic.app.support_objects.Sport;

@Entity
public abstract class Equipment extends Single {

    @ColumnInfo(name = "equipment_name") protected String name;
    protected String description;
    @Embedded protected Sport sport;
    protected Integer iconID;
    protected Integer imageID;

    protected Equipment(int msID, boolean isActive, AppObjectDict classType,
                        String name, String description, Sport sport, Integer iconID, Integer imageID) {

        super(msID, isActive, classType);

        this.name = name;
        this.description = description;
        this.sport = sport;
        this.iconID = iconID;
        this.imageID = imageID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Sport getSport() {
        return sport;
    }

    public void setSport(Sport sport) {
        this.sport = sport;
    }

    public Integer getIconID() {
        return iconID;
    }

    public void setIconID(Integer iconID) {
        this.iconID = iconID;
    }

    public Integer getImageID() {
        return imageID;
    }

    public void setImageID(Integer imageID) {
        this.imageID = imageID;
    }
}
