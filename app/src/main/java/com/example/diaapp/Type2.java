package com.example.diaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class Type2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_type2);

        Button btn1 = findViewById(R.id.type2_btn);
        btn1.setOnClickListener(view -> {
            Intent intent = new Intent(Type2.this, ResponsiveFacts2.class);
            startActivity(intent);
        });

        Button btn2 = findViewById(R.id.type2_btn2);
        btn2.setOnClickListener(view -> {
            Intent intent = new Intent(Type2.this, ResponsiveFacts2.class);
            startActivity(intent);
        });

        Button btn3 = findViewById(R.id.type2_btn3);
        btn3.setOnClickListener(view -> {
            Intent intent = new Intent(Type2.this, ResponsiveFacts2.class);
            startActivity(intent);
        });

        Button btn4 = findViewById(R.id.type2_btn4);
        btn4.setOnClickListener(view -> {
            Intent intent = new Intent(Type2.this, ResponsiveFacts2.class);
            startActivity(intent);
        });

        Button btn5 = findViewById(R.id.type2_btn5);
        btn5.setOnClickListener(view -> {
            Intent intent = new Intent(Type2.this, ResponsiveFacts2.class);
            startActivity(intent);
        });
    }
}