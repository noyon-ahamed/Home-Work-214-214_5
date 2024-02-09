package com.example.homework214;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView homework1,homework2,homework3,homework4,homework5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        homework1=findViewById(R.id.homework1);
        homework2=findViewById(R.id.homework2);
        homework3=findViewById(R.id.homework3);
        homework4=findViewById(R.id.homework4);
        homework5=findViewById(R.id.homework5);

        homework1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent=new Intent(MainActivity.this,HomeWork214_1.class);
                startActivity(myintent);
            }
        });

        homework2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent=new Intent(MainActivity.this,HomeWork214_2.class);
                startActivity(myintent);
            }
        });

        homework3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent=new Intent(MainActivity.this,HomeWork214_3.class);
                startActivity(myintent);
            }
        });

        homework4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent=new Intent(MainActivity.this,HomeWork214_4.class);
                startActivity(myintent);
            }
        });

        homework5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent=new Intent(MainActivity.this,HomeWork214_5.class);
                startActivity(myintent);
            }
        });

    }
}