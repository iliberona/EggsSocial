package com.example.p1;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionBar = getSupportActionBar();

        actionBar.setIcon(R.mipmap.ic_egg_square);
        actionBar.setDisplayShowHomeEnabled(true);

    }

    public void IniciarSesion(View view){
        Intent iniciarSesion = new Intent(this, WelcomeActivity.class);
        startActivity(iniciarSesion);
    }

    public void Registrarse(View view){
        Intent registrarse = new Intent(this, RegisterActivity.class);
        startActivity(registrarse);
    }
}
