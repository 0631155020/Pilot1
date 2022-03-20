package com.applook.pilot;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;


public class law extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_law);
        final ImageView image_left = (ImageView) findViewById(R.id.image_left);
//скругляем углы левой
        image_left.setClipToOutline(true);

        final ImageView image_right = (ImageView) findViewById(R.id.image_right);
//скругляем углы правой
        image_right.setClipToOutline(true);

        // кнопка назад
        Button btn_back = (Button) findViewById(R.id.button_back);
        btn_back.setOnClickListener(v -> {
            //обрабативаем нажатие
            try {
                //вернутся назад
                Intent intent = new Intent(law.this, PPLActivity.class);
                startActivity(intent);
                finish();
            } catch (Exception e) {

            }
        });

    }
}