package com.example.gunendu.calcounter;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by gunendu on 16/12/17.
 */

@Entity(tableName = "items")
public class Item {
    @PrimaryKey(autoGenerate = true)
    private int uid;

    @ColumnInfo(name = "item_name")
    private String itemname;

    @ColumnInfo(name = "protein")
    private String protein;

    public String getItemname() {
        return itemname;
    }

    public void setItemname(String itemname) {
        this.itemname = itemname;
    }

    public String getProtein() {
        return protein;
    }

    public void setProtein(String protein) {
        this.protein = protein;
    }

    public int getUid() {

        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }
}
