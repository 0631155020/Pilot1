package com.applook.pilot;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private long backPressedTime;
    private Toast backToast;
    CardView PPl_button;
    CardView CPL_button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        PPl_button = findViewById(R.id.test_btn);
        CPL_button = findViewById(R.id.random_btn);


        PPl_button.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, PPLActivity.class);
            startActivity(intent);
        });

        CPL_button.setOnClickListener(v -> {

            Intent intent = new Intent(getApplicationContext(), CPL.class);
            startActivity(intent);

        });

    }
// защита от случайного касания(двойное нажате на кнопку назад)

    @Override
    public void onBackPressed() {
        backToast.cancel();
        super.onBackPressed();

        if (backPressedTime + 2000 > System.currentTimeMillis()) {
            super.onBackPressed();
            return;
        } else {
            backToast = Toast.makeText(getBaseContext(), "Нажмите еще раз чтобы выйти", Toast.LENGTH_LONG);
            backToast.show();
        }

        backPressedTime = System.currentTimeMillis();
    }


}