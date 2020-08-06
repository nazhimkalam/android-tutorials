package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView)findViewById(R.id.listView);

        final String[] programmingLang = {"Python","Java","C","C++","C#","VB","JS","Angular","React","Android"};
        // To make use of an Array in a List View we have to make use of an Adapter.
        // In here we are gonna use the ArrayAdapter

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1, Arrays.asList(programmingLang));
        // this refers to this main activity page
        // android.R.layout.simple_list_item_2 this refers to the style of the list
        // Arrays.asList(programmingLang) this is converting array into a list, the ArrayAdapter uses list not array

        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // programmingLang[position], position returns the position of the array element clicked
                Toast.makeText(MainActivity.this, "Loading " + programmingLang[position],Toast.LENGTH_LONG).show();
            }
        });
    }
}