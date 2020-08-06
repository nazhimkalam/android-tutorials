package com.example.sqllite;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //--------------------------------------------------------------------------------------------------------------------------
//
//        //Writing data into the database
//
//        // we create an instance of the Student Class in order to create the database with the relevant columns
//        Student studentDBHelper = new Student(this);
//
//        // we use getWritableDatabase() in order to write into the database
//        SQLiteDatabase db = studentDBHelper.getWritableDatabase();
//
//        // ContentValues is like a "container" which holds the "data" to be inserted with respective to its "column name"
//        ContentValues values = new ContentValues();
//        values.put("sid",2019281);
//        values.put("sname","Nazhim Kalam");
//        values.put("marks",90);
//
//        // we insert the data into the table with in the database and this will return the row number of the inserted row
//        // which means the current row number of the inserted data in the table which will be always the last row of the table.
//        long row = db.insert("student",null,values);
//
//        System.out.println("row number is " + row);
//
        //--------------------------------------------------------------------------------------------------------------------------

//        // Reading data from the database
//
//        // we create an instance of the Student Class in order to create the database with the relevant columns
//        Student studentDBHelper = new Student(this);
//
//        // we use getReadableDatabase() in order to read from the database
//        SQLiteDatabase db = studentDBHelper.getReadableDatabase();
//
//        // These are the column names I wanted to filter from the table
//        String[] columnNames = {"sname","marks"};
//
//        // We collect the records which matched the query and store it in a cursor
//        Cursor cursor = db.query("student",columnNames, null,null,null,null,null);
//
//        // loops through the rows in the cursor and displays result
//        for (cursor.moveToFirst(); !cursor.isAfterLast(); cursor.moveToNext()) {
//
//            // we can specify the column by numbers (indexes)
//            System.out.println("Student name is " + cursor.getString(0));
//        }

    }
}