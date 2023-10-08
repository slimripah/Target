package com.slimripah.target;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ForgetTwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forget_two);
    }

    public void fin (View view) {
        Intent intent = new Intent(ForgetTwo.this, ForgetThree.class);
        startActivity(intent);
        finish();
    }

}