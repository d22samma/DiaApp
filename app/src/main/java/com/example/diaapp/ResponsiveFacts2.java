package com.example.diaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ResponsiveFacts2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_responsive_facts2);

        TextView collectvalue = (TextView) findViewById(R.id.resp_title2);
        TextView collectval = (TextView) findViewById(R.id.resp_desc2);


        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String Title = extras.getString("Title1");
            String Desc = extras.getString("Desc1");

            collectvalue.setText(Title);
            collectval.setText(Desc);
        }
    }
}