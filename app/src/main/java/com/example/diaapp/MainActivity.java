package com.example.diaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button factsbutton = findViewById(R.id.main_factsbtn);
        factsbutton.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, Facts.class);
            startActivity(intent);
        });

        Button gamebutton = findViewById(R.id.main_gamebtn);
        gamebutton.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, GAME.class);
            startActivity(intent);
            setContentView(R.layout.activity_main);
        });

    }
}