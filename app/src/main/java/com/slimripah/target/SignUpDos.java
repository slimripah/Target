package com.slimripah.target;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SignUpDos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_dos);
    }

    public void signTwo (View view) {
        Intent intent = new Intent(SignUpDos.this, SignUpTres.class);
        startActivity(intent);
        finish();
    }

}