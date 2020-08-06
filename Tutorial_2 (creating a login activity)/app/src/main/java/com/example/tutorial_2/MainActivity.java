package com.example.tutorial_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button createAccountBtn = findViewById(R.id.createAccountBtn);
        EditText username = findViewById(R.id.username);
        EditText email = findViewById(R.id.email);
        EditText password = findViewById(R.id.password);
        RadioGroup radioGroup = findViewById(R.id.radioGroup);
        RadioButton male = findViewById(R.id.male);
        RadioButton female = findViewById(R.id.female);

        createAccountBtn.setOnClickListener(v ->{
            String uName = username.getText().toString();
            String eMail = email.getText().toString();
            String passWord = password.getText().toString();

            // method 01 for the radio button
            int clickedButtonNumber = radioGroup.getCheckedRadioButtonId();
            RadioButton radiobutton = radioGroup.findViewById(clickedButtonNumber);

            // method 02 for the radio button
//            String gender = "";
//            if(male.isChecked()){
//                gender = "male";
//            }else{
//                gender = "female";
//            }

            String message = "Username: " + uName + "\nEmail: " + eMail + "\nPassword: " + passWord + "\nGender: " + radiobutton.getText();
            Toast.makeText(MainActivity.this,message,Toast.LENGTH_LONG).show();
        });
    }
}