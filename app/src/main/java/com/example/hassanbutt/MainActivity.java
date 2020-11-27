package com.example.hassanbutt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //    Declared
    private Button mSignUpBtn;
    private EditText mUserName, mEmail, mPassword, mRetyepPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Set ID Initialized
        mSignUpBtn = findViewById(R.id.signUpBtn);
        mUserName = findViewById(R.id.editTextName);
        mEmail = findViewById(R.id.editTextEmail);
        mPassword = findViewById(R.id.editTextPassword);
        mRetyepPassword = findViewById(R.id.editTextRetypePassword);

//        Lambda click
        mSignUpBtn.setOnClickListener(v -> {
            userSignUp();
        });

    }

    private void userSignUp() {
        String name = mUserName.getText().toString().trim();
        String email = mEmail.getText().toString().trim();
        String password = mPassword.getText().toString().trim();
        String retypePassword = mRetyepPassword.getText().toString().trim();

        if (name.isEmpty()) {
            mUserName.setError("Enter User Name");
            return;
        }
        if (email.isEmpty()) {
            mEmail.setError("Enter Email");
            return;
        }
        if (password.isEmpty()) {
            mPassword.setError("Enter Password");
            return;
        }
        if (retypePassword.isEmpty()) {
            mRetyepPassword.setError("Enter Retype Password");
            return;
        }

//        Toast.makeText(this,
//                "Name is: " + name +
//                        "Email is: " + email,
//                Toast.LENGTH_SHORT).show();

//        Toast.makeText(this, "Welcome " + name, Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(this, WelcomeActivity.class);
        intent.putExtra("HelloUser", name);
        startActivity(intent);
    }
}