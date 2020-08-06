package com.example.listview;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

public class MyAdapter extends ArrayAdapter<String> {
    private final Activity context;
    private final String[] progNames;
    private final Integer[] progImages;

    public MyAdapter(Activity context, String[] progNames, Integer[] progImages) {
        super(context, R.layout.activity_image_list, progNames);
        this.context = context;
        this.progNames = progNames;
        this.progImages = progImages;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.activity_image_list, null, true);
        TextView textView = (TextView) rowView.findViewById(R.id.textView);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.imageView);

        textView.setText(progNames[position]);
        imageView.setImageResource(progImages[position]);

        return rowView;
    }
}
