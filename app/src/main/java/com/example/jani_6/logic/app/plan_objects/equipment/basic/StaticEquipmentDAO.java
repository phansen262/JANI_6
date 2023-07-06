package com.example.jani_6.logic.app.plan_objects.equipment.basic;

import androidx.room.Dao;
import androidx.room.Query;

import java.util.List;

@Dao
public interface StaticEquipmentDAO {

    @Query("DELETE FROM StaticEquipment")
    void resetTable();

    @Query("SELECT * FROM StaticEquipment")
    List<StaticEquipment> getAllStaticEquipment();
}
