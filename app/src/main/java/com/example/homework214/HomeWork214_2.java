package com.example.homework214;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class HomeWork214_2 extends AppCompatActivity {

    EditText ednumber2;
    TextView tvresult;
    Button resultbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_work214_2);

        resultbtn=findViewById(R.id.resultbtn);
        tvresult =findViewById(R.id.tvresult);
        ednumber2=findViewById(R.id.ednumber2);

        resultbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String syear=ednumber2.getText().toString();

                if (syear.length()>0){

                    int year=Integer.parseInt(syear);
                    if (year%400==0){
                        tvresult.setText(year+" This year is leap year");
                    } else if (year%4==0 && year%100!=0) {
                        tvresult.setText(year+" This year is leap year");
                    }else {
                        tvresult.setText(year+" This year is Not leap year");
                    }

                }else {
                    Toast.makeText(HomeWork214_2.this, "Please input a year", Toast.LENGTH_SHORT).show();
                }

            }
        });

    }
}