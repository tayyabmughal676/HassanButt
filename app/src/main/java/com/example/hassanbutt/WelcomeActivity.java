package com.example.hassanbutt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class WelcomeActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        Intent intent = getIntent();
        String userName = intent.getStringExtra("HelloUser");

        TextView mWelcome = findViewById(R.id.textViewWelcome);
        mWelcome.setText("Welcome " + userName);
    }
}