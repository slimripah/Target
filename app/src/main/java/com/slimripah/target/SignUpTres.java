package com.slimripah.target;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SignUpTres extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_tres);
    }

    public void signThree (View view) {
        Intent intent = new Intent(SignUpTres.this, SignUpQuatro.class);
        startActivity(intent);
        finish();
    }

}