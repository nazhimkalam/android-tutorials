package com.example.sqllite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

// SQLiteOpenHelper is an Abstract class so we have to implement all of it's methods
public class Student extends SQLiteOpenHelper {

//     context to use for locating paths to the the database (like the mainActivity)
//     name of the database file, or null for an in-memory database
//     factory to use for creating cursor objects, or null for the default
//     version number of the database (starting at 1)

    public Student(Context context) {
        super(context, "stud.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table student (sid text,sname text,marks text)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists student");  // used to drop the table if it exists
        onCreate(db);
    }
}
