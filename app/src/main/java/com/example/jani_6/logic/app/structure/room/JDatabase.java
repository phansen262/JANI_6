package com.example.jani_6.logic.app.structure.room;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.jani_6.logic.app.plan_objects.equipment.basic.StaticEquipment;
import com.example.jani_6.logic.app.plan_objects.equipment.basic.StaticEquipmentDAO;
import com.example.jani_6.logic.app.support_objects.Sport;
import com.example.jani_6.logic.app.support_objects.SportDAO;

@Database(entities = {
    StaticEquipment.class, Sport.class
}, version = 4)

public abstract class JDatabase extends RoomDatabase {

    public abstract StaticEquipmentDAO staticEquipmentDAO();
    public abstract SportDAO sportDAO();
}
