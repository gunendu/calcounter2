package com.example.gunendu.calcounter;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

/**
 * Created by gunendu on 16/12/17.
 */

@Dao
public interface ItemDao {

    @Query("SELECT * FROM items")
    List<Item> getAll();

    @Insert
    void insertAll(Item item);

}
