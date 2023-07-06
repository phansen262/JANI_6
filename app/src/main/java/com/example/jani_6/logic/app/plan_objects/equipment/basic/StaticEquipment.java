package com.example.jani_6.logic.app.plan_objects.equipment.basic;

import androidx.room.Entity;

import com.example.jani_6.logic.app.plan_objects.equipment.Equipment;
import com.example.jani_6.logic.app.structure.AppObjectDict;
import com.example.jani_6.logic.app.support_objects.Sport;

@Entity
public class StaticEquipment extends Equipment {

    //TODO: might need to add way to get actual objects of icon and image

    public StaticEquipment(int msID, boolean isActive,
                           String name, String description, Sport sport, Integer iconID, Integer imageID) {

        super(msID, isActive, AppObjectDict.STATIC_EQUIPMENT, name, description, sport, iconID, imageID);
    }

    //Used to lookup and return instance of the equipment based on ID?
    //TODO: Need to decide if this is actually needed
    public static StaticEquipment newEquipment(int msID){
        return null;
    }
}
