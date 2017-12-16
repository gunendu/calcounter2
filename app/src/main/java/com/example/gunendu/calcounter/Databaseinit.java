package com.example.gunendu.calcounter;

import android.os.AsyncTask;
import android.support.annotation.NonNull;

import java.util.ArrayList;
import java.util.List;


public class Databaseinit {



        private static final String TAG = Databaseinit.class.getName();

        public static void populateAsync(@NonNull final AppDatabase db, Item item) {
            PopulateDbAsync task = new PopulateDbAsync(db,item);
            task.execute();
        }


        public static void populateSync(@NonNull final AppDatabase db) {
            //populateWithTestData(db);
        }

        public static Item addItem(final AppDatabase db, Item item) {
            db.itemDao().insertAll(item);
            return item;
        }

        public static List<Item> getItems(final AppDatabase db) {
            return db.itemDao().getAll();
        }

        private static class PopulateDbAsync extends AsyncTask<Void, Void, Void> {

            private final AppDatabase mDb;
            private final Item mItem;

            PopulateDbAsync(AppDatabase db, Item item) {
                mDb = db;
                mItem = item;
            }

            @Override
            protected Void doInBackground(final Void... params) {
                addItem(mDb,mItem);
                return null;
            }

        }





}
