package com.example.gunendu.calcounter;

import android.arch.persistence.db.SupportSQLiteDatabase;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.migration.Migration;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import java.util.List;

public class AddItem extends AppCompatActivity {

    static final Migration MIGRATION_1_2 = new Migration(1, 2) {
        @Override
        public void migrate(SupportSQLiteDatabase database) {
            // Since we didn't alter the table, there's nothing else to do here.
        }
    };

    AppDatabase db = Room.databaseBuilder(this,AppDatabase.class,"nutriton").addMigrations(MIGRATION_1_2).build();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_item);
    }

    public void saveItem(View view) {
       System.out.print("save item is called");
       final EditText itemName = (EditText) findViewById(R.id.itemname);
       String name = itemName.getText().toString();

       final EditText protein = (EditText) findViewById(R.id.protein);
       String proVal = protein.getText().toString();

       Item item = new Item();
       item.setItemname(name);
       item.setProtein(proVal);

       Databaseinit.populateAsync(db,item);
       Intent intent = new Intent(getBaseContext(),ShowActivity.class);
       startActivity(intent);
       //new GetDbAsync().execute();
    }

}
