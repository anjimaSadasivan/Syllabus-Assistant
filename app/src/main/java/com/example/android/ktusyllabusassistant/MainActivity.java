package com.example.android.ktusyllabusassistant;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button S7;
    private Button S8;
   private Button S6;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        S7 = findViewById(R.id.S7);
        S7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, S7.class);
                startActivity(intent);
            }
        });

        S8 = findViewById(R.id.S8);
        S8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, S8.class);
                startActivity(intent);
            }
        });

        S6 = findViewById(R.id.S6);
        S6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, S6.class);
                startActivity(intent);
            }
        });


    }
}