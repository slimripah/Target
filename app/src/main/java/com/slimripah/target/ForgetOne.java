package com.slimripah.target;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ForgetOne extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forget_one);
    }

    public void set (View view) {
        Intent intent = new Intent(ForgetOne.this, ForgetTwo.class);
        startActivity(intent);
        finish();
    }

}