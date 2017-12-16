package com.example.gunendu.calcounter;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
/**
 * Created by gunendu on 16/12/17.
 */

@Database(entities = {Item.class}, version = 2)
public abstract class AppDatabase extends RoomDatabase {
    public abstract ItemDao itemDao();

}
