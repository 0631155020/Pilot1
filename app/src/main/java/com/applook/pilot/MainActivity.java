package com.applook.pilot;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    CardView PPl_button;
    Button CPL_button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        PPl_button = findViewById(R.id.button);
        CPL_button = findViewById(R.id.button2);


        PPl_button.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, PPLActivity.class);
            startActivity(intent);
        });

        CPL_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), CPL.class);
                startActivity(intent);
            }
        });

    }
}