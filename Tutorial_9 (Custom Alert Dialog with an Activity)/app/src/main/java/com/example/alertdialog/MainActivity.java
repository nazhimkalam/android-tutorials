package com.example.alertdialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button show1, show2, show3;
    TextView textView1, textView2,textView3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView1 = (TextView)findViewById(R.id.textView1);
        textView2 = (TextView)findViewById(R.id.textView2);
        textView3 = (TextView)findViewById(R.id.textView3);

        show1 = (Button)findViewById(R.id.show1);
        show2 = (Button)findViewById(R.id.show2);
        show3 = (Button)findViewById(R.id.show3);

        show1.setOnClickListener(v ->{
            textView1.setText("Name: Nazhim Kalam");
        });

        show2.setOnClickListener(v->{
            textView2.setText("Acc No: 0154215458");
        });



        // we are going to display an activity in the Alert box
        // So to call another layout to this MainActivity we have to use "inflate", then only we can access and use their view elements.

        View view = LayoutInflater.from(MainActivity.this).inflate(R.layout.login,null);  // we don't have a View group such as linear layout etc.. so null
        final EditText username = (EditText) view.findViewById(R.id.username);
        final EditText password = (EditText) view.findViewById(R.id.password);

        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);  // this is an inner class
        builder.setTitle("Login Access")
                .setView(view)          // setting the login activity
                .setPositiveButton("login", (dialog, which) -> {       // lambda expression of setting the event
                    String username_ = username.getText().toString();
                    String password_ = password.getText().toString();
                    if(username_.equals("nk") && password_.equals("123")){
                        textView3.setText("Balance: 5000");
                    }else{
                        textView3.setText("Balance: Cannot view");
                    }
                })
                .setNegativeButton("Cancel",null)           // doesn't do anything if cancel is clicked
                .setCancelable(false);                                  // this makes sure when you click outside the dialog box it doesn't cancel it
        final AlertDialog alert = builder.create();

        show3.setOnClickListener(v->{
            alert.show();
        });
    }

    // if user clicks the back button to go back or exit we pop up an alert warning box
    // we override existing method for this
    @Override
    public void onBackPressed(){
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);  // this is an inner class
        builder.setTitle("Exit")
                .setMessage("Are you sure?")
                .setPositiveButton("Ok", (dialog, which) -> {       // lambda expression of setting the event
                    MainActivity.super.onBackPressed();                  // this processes the back event
                })
                .setNegativeButton("Cancel",null)           // doesn't do anything if cancel is clicked
                .setCancelable(false);                                  // this makes sure when you click outside the dialog box it doesn't cancel it
        AlertDialog alert = builder.create();
        alert.show();
    }
}