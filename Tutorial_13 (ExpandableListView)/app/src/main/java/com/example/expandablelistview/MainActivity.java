package com.example.expandablelistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    ExpandableListView expandableListView;      // this is the expandable list view we created in the main_activity layout
    List<String> languages;                     // the languages or parent list topics
    Map<String, List<String>> topics;           // a map which maps the parent topic key with its child list values
    ExpandableListAdapter listAdapter;
    // ExpandableListAdapter is an Interface which uses an abstract class called BaseExpandableListAdapter
    // we have to create our own class to implement this BaseExpandableListAdapter.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        expandableListView = (ExpandableListView) findViewById(R.id.expandableListView);
        fillData();

        listAdapter = new MyExListAdapter(this, languages, topics);
        expandableListView.setAdapter(listAdapter);

        expandableListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id) {
                Toast.makeText(MainActivity.this, languages.get(groupPosition) + ":" + topics.get(languages.get(groupPosition)).get(childPosition),Toast.LENGTH_SHORT).show();

                return  false;
            }
        });
    }

    private void fillData() {
        languages = new ArrayList<>();  // parent part
        topics = new HashMap<>();       // child part

        languages.add("Java");
        languages.add("Python");

        List<String> java = new ArrayList<>();
        List<String> python = new ArrayList<>();

        java.add("super keyword");
        java.add("Genrics");
        java.add("Collections");
        java.add("Interface");
        java.add("OOP");

        python.add("NumPy");
        python.add("Pandas");
        python.add("Seaborn");
        python.add("OOP");
        python.add("this keyword");

        topics.put(languages.get(0),java);
        topics.put(languages.get(1),python);

    }
}