package com.example.jani_6.logic.app.plan_objects.equipment.lifecycle;

import com.example.jani_6.logic.app.plan_objects.equipment.Equipment;
import com.example.jani_6.logic.app.structure.AppObjectDict;
import com.example.jani_6.logic.app.support_objects.Sport;

public class LifecycleEquipment extends Equipment {

    public LifecycleEquipment(int msID, boolean isActive,
                              String name, String description, Sport sport, Integer iconID, Integer imageID){

        super(msID, isActive, AppObjectDict.LIFECYCLE_EQUIPMENT, name, description, sport, iconID, imageID);
    }

    public static LifecycleEquipment newEquipment(int msID){return null;}
}
