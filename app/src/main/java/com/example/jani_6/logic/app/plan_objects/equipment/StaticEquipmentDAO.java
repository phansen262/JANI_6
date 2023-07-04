package com.example.jani_6.logic.app.plan_objects.equipment;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

@Dao
public interface StaticEquipmentDAO {

    @Query("SELECT * FROM StaticEquipment WHERE equipment_name = :searchname")
    StaticEquipment search(String searchname);

    @Insert
    void add(StaticEquipment staticEquipment);
}
