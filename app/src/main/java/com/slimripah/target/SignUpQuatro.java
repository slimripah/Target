package com.slimripah.target;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SignUpQuatro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_quatro);
    }

    public void signFour (View view) {
        Intent intent = new Intent(SignUpQuatro.this, SignUpCinco.class);
        startActivity(intent);
        finish();
    }

}