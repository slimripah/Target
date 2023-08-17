package com.slimripah.target;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void forgot (View view) {
        Intent intent = new Intent(Login.this, ForgetOne.class);
        startActivity(intent);
        finish();
    }

    public void shop (View view) {
        Intent intent = new Intent(Login.this, Dashboard.class);
        startActivity(intent);
        finish();
    }

    public void create (View view) {
        Intent intent = new Intent(Login.this, SignUp.class);
        startActivity(intent);
        finish();
    }

}