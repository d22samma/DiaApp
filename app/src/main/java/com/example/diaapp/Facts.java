package com.example.diaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class Facts extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facts);

        Button Type1 = findViewById(R.id.facts_type1btn);
        Type1.setOnClickListener(view -> {
            Intent intent = new Intent(Facts.this, Type1.class);
            intent.putExtra("Titles", "Titletext type1"); //Title
            intent.putExtra("Descs", "Welcome type1"); // Desc
            startActivity(intent);
        });

        Button Type2 = findViewById(R.id.facts_type2btn);
        Type2.setOnClickListener(view -> {
            Intent intent = new Intent(Facts.this, Type2.class);
            intent.putExtra("Titles", "Titletext type2"); //Title
            intent.putExtra("Descs", "Welcome type2"); // Desc
            startActivity(intent);
        });
    }
}