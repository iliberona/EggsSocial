package com.example.p1;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        ActionBar actionBar = getSupportActionBar();

        actionBar.setIcon(R.mipmap.ic_egg_square);
        actionBar.setDisplayShowHomeEnabled(true);

    }

    public void Registrarse(View view){
        Intent registrarse = new Intent(this, WelcomeActivity.class);
        startActivity(registrarse);
    }
}
