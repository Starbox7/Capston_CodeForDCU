package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class PointScreen extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.point_screen);

        ImageButton bbqButton = (ImageButton) findViewById(R.id.bbqBtn);
        Button returnButton = (Button) findViewById(R.id.returnBtn);
        Button  possessionBtn = (Button) findViewById(R.id.possessionBtn);

        returnButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                finish();
            }
        });

        bbqButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_campagin = new Intent(getApplicationContext(), ChickenScreen.class);
                startActivity(intent_campagin);
            }
        });
        possessionBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_campagin = new Intent(getApplicationContext(), HaveScreen.class);
                startActivity(intent_campagin);
            }
        });



    }
}