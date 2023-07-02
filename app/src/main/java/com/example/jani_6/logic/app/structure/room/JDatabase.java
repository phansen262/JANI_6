package com.example.jani_6.logic.app.structure.room;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.jani_6.logic.app.plan_objects.equipment.Equipment;
import com.example.jani_6.logic.app.plan_objects.equipment.StaticEquipmentDAO;

@Database(entities = {
    Equipment.class
}, version = 1)

public abstract class JDatabase extends RoomDatabase {

    public abstract StaticEquipmentDAO staticEquipmentDAO();
}
