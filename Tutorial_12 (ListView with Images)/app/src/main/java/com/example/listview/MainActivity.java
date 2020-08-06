package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    // variables
    ListView listView;

    // Array with Images
    public static Integer[] progImages = {
            R.drawable.one, R.drawable.two, R.drawable.three,
            R.drawable.one, R.drawable.two, R.drawable.three
    };

    // Array with the Names
    public static String[] progNames = {
            "Python","Java","C#","C++","C","Android"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // I had to create my own adapter called MyAdapter, because we are dealing with an image and string both
        MyAdapter adapter = new MyAdapter(this,progNames,progImages);

        listView = (ListView)findViewById(R.id.listView);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "openning " + progNames[position],Toast.LENGTH_SHORT).show();
            }
        });

    }
}