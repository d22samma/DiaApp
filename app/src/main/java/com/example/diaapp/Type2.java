package com.example.diaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class Type2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_type2);

        TextView collectvalues = (TextView) findViewById(R.id.type2_title1);
        TextView collectvals = (TextView) findViewById(R.id.type2_desc);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String Titles = extras.getString("Titles");
            String Descs = extras.getString("Descs");

            collectvalues.setText(Titles);
            collectvals.setText(Descs);
        }





        Button btn1 = findViewById(R.id.type2_btn);
        btn1.setOnClickListener(view -> {
            Intent intent = new Intent(Type2.this, ResponsiveFacts2.class);
            intent.putExtra("Title1", "Titletext one"); //Title
            intent.putExtra("Desc1", "Welcome one"); // Desc
            startActivity(intent);
        });

        Button btn2 = findViewById(R.id.type2_btn2);
        btn2.setOnClickListener(view -> {
            Intent intent = new Intent(Type2.this, ResponsiveFacts2.class);
            intent.putExtra("Title1", "Titletext two"); //Title
            intent.putExtra("Desc1", "Welcome two"); // Desc
            startActivity(intent);
        });

        Button btn3 = findViewById(R.id.type2_btn3);
        btn3.setOnClickListener(view -> {
            Intent intent = new Intent(Type2.this, ResponsiveFacts2.class);
            intent.putExtra("Title1", "Titletext three"); //Title
            intent.putExtra("Desc1", "Welcome three"); // Desc
            startActivity(intent);
        });

        Button btn4 = findViewById(R.id.type2_btn4);
        btn4.setOnClickListener(view -> {
            Intent intent = new Intent(Type2.this, ResponsiveFacts2.class);
            intent.putExtra("Title1", "Titletext four"); //Title
            intent.putExtra("Desc1", "Welcome four"); // Desc
            startActivity(intent);
        });

        Button btn5 = findViewById(R.id.type2_btn5);
        btn5.setOnClickListener(view -> {
            Intent intent = new Intent(Type2.this, ResponsiveFacts2.class);
            intent.putExtra("Title1", "Titletext five"); //Title
            intent.putExtra("Desc1", "Welcome five"); // Desc
            startActivity(intent);
        });
    }
}