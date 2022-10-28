package com.example.myapplication;

import android.content.Intent;
import android.graphics.Point;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainScreen extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_screen);

        Button logoutButton = (Button) findViewById(R.id.logoutBtn);
        Button campaginButton = (Button) findViewById(R.id.campaginBtn);
        Button infoButton = (Button) findViewById(R.id.infoBtn);
        Button qnaButton = (Button) findViewById(R.id.qnaBtn);
        Button pointButton = (Button) findViewById(R.id.pointBtn);
        logoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        campaginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_campagin = new Intent(getApplicationContext(), CampaginScreen.class);
                startActivity(intent_campagin);
            }
        });
        infoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_campagin = new Intent(getApplicationContext(), InfoScreen.class);
                startActivity(intent_campagin);
            }
        });
        qnaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_campagin = new Intent(getApplicationContext(), QnaScreen.class);
                startActivity(intent_campagin);
            }
        });
        pointButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_campagin = new Intent(getApplicationContext(), PointScreen.class);
                startActivity(intent_campagin);
            }
        });
    }
}