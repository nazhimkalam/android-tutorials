package com.example.tutorial_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {
    TextView usernameTextView,genderTextView, emailTextView, passwordTextView;
    Button backToLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        usernameTextView = findViewById(R.id.usernameTextView);
        genderTextView = findViewById(R.id.genderTextView);
        emailTextView = findViewById(R.id.emailTextView);
        passwordTextView = findViewById(R.id.passwordTextView);
        Intent intent = getIntent();

        String userTextViewSetText = "Username: " + intent.getStringExtra("initials")+ intent.getStringExtra("name");
        String genderTextViewSetText = "Gender: " + intent.getStringExtra("gender");
        String emailTextViewSetText = "Email: " + intent.getStringExtra("email");
        String passwordTextViewSetText = "Password: " + intent.getStringExtra("password");

        usernameTextView.setText(userTextViewSetText);
        genderTextView.setText(genderTextViewSetText);
        emailTextView.setText(emailTextViewSetText);
        passwordTextView.setText(passwordTextViewSetText);

        backToLogin = findViewById(R.id.backToLogin);
        backToLogin.setOnClickListener(v ->{
            Toast.makeText(SecondActivity.this,"back to login form",Toast.LENGTH_SHORT).show();

            Intent intent2 = new Intent(SecondActivity.this, MainActivity.class);
            startActivity(intent2);
        });

    }
}