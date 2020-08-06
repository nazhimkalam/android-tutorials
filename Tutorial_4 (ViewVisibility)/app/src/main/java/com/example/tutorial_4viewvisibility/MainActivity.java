package com.example.tutorial_4viewvisibility;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button01, button02, button03;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button01 = findViewById(R.id.button01);
        button02 = findViewById(R.id.button02);
        button03 = findViewById(R.id.button03);

    }

    public void btn01Clicked(View v) {
        button01.setVisibility(View.GONE);
        button02.setVisibility(View.VISIBLE);
        button03.setVisibility(View.VISIBLE);
    }

    public void btn02Clicked(View v) {
        button02.setVisibility(View.GONE);
        button01.setVisibility(View.VISIBLE);
        button03.setVisibility(View.VISIBLE);
    }

    public void btn03Clicked(View v) {
        button03.setVisibility(View.GONE);
        button02.setVisibility(View.VISIBLE);
        button01.setVisibility(View.VISIBLE);
    }

    public void reset(View v){
        button01.setVisibility(View.VISIBLE);
        button02.setVisibility(View.VISIBLE);
        button03.setVisibility(View.VISIBLE);
    }
}