package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button loginButton = (Button) findViewById(R.id.loginBtn);
        EditText editTextId = (EditText)findViewById(R.id.editTextId);
        EditText editTextPw = (EditText)findViewById(R.id.editTextPW);
        loginButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if(editTextId.getText().toString().equals("id")){
                    if(editTextPw.getText().toString().equals("pw")){
                        Intent intent = new Intent(getApplicationContext(), MainScreen.class);
                        startActivity(intent);
                    }
                    else{
                        Toast.makeText(getApplicationContext(), "비밀번호가 일치하지 않습니다.", Toast.LENGTH_SHORT).show();
                    }
                }
                else{
                    Toast.makeText(getApplicationContext(), "존재하는 아이디가 없습니다.", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}