package com.applook.pilot;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PPLActivity extends AppCompatActivity {
    Button weather_button;
    Button law_button;
    Button nav_button;
    Button people_button;
    Button oper_button;
    Button ltx_button;
    Button fuel_button;
    Button flight_button;
    Button call_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ppl);
        weather_button = findViewById(R.id.weather1);
        law_button = findViewById(R.id.air_law1);
        nav_button = findViewById(R.id.navigation_plane);
        people_button = findViewById(R.id.people);
        oper_button = findViewById(R.id.operating);
        ltx_button = findViewById(R.id.ltx_btn);
        fuel_button = findViewById(R.id.fuel_system1);
        flight_button = findViewById(R.id.flight1);
        call_button = findViewById(R.id.call_p);

        weather_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), weather2.class);
                startActivity(intent);
            }
        });
        law_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), law.class);
                startActivity(intent);
            }
        });
        nav_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Navigation.class);
                startActivity(intent);
            }
        });
        people_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), People.class);
                startActivity(intent);
            }
        });
        oper_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Opereting.class);
                startActivity(intent);
            }
        });
        ltx_button.setOnClickListener(v -> {
            Intent intent = new Intent(PPLActivity.this, LTX.class);
            startActivity(intent);
        });
        fuel_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Fuel_system.class);
                startActivity(intent);
            }
        });
        flight_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Flight.class);
                startActivity(intent);
            }
        });
        call_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Call.class);
                startActivity(intent);
            }
        });

    }
}