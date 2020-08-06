package com.example.tutorial_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText firstEditText = findViewById(R.id.firstNumberEditText);
        EditText secondEditText = findViewById(R.id.secondNumberEditText);
        Button addBtn = findViewById(R.id.addBtn);
        TextView answer = findViewById(R.id.answer);

        // we can perform the click button action in 2 ways
        //  1. By using the method attribute in the ADD Button and creating a method which calls it. (this method is possible but not recommended )
        //  2. By using onClickListener...

        addBtn.setOnClickListener(v -> {
            int firstNumber = Integer.parseInt(firstEditText.getText().toString());
            int secondNumber = Integer.parseInt(secondEditText.getText().toString());
            int result = firstNumber + secondNumber;
            answer.setText("Total: " + result);
        });

    }
}