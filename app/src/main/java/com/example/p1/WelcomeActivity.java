package com.example.p1;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        ActionBar actionBar = getSupportActionBar();

        actionBar.setIcon(R.mipmap.ic_egg_square);
        actionBar.setDisplayShowHomeEnabled(true);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return false;
    }

    public void Add(View view){
        Intent add = new Intent(this, AddActivity.class);
        startActivity(add);
    }

    public void Share(View view){
        Intent share = new Intent();
        share.setAction(Intent.ACTION_SEND);
        share.putExtra(Intent.EXTRA_TEXT, "Compartir huevos");
        share.setType("text/plain");
        startActivity(share);
    }

    public void Like(View view){
        Toast toast = Toast.makeText(this, "Me gusta :)", Toast.LENGTH_SHORT);
        toast.show();
    }

    public void Dislike(View view){
        Toast toast = Toast.makeText(this, "No me gusta :(", Toast.LENGTH_SHORT);
        toast.show();
    }

}
