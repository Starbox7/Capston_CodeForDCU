package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class HaveScreen extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.have_screen);
        Button returnButton = (Button) findViewById(R.id.returnBtn);
        ImageButton pizzaBtn = (ImageButton) findViewById(R.id.pizaaBtn);
        ImageButton bhcBtn = (ImageButton) findViewById(R.id.bhcBtn);
        ImageButton cakeBtn = (ImageButton) findViewById(R.id.cakeBtn);
        ImageView imageView = (ImageView) findViewById(R.id.orderview);
        ImageButton pizzaBtn1 = (ImageButton) findViewById(R.id.pizaaBtn1);

        pizzaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView.setImageResource(R.drawable.domino2);
            }
        });
        bhcBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView.setImageResource(R.drawable.bhc2);
            }
        });
        cakeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView.setImageResource(R.drawable.cake2);
            }
        });
        pizzaBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView.setImageResource(R.drawable.domino2);
            }
        });


        returnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}