package com.example.homework214;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class HomeWork214_5 extends AppCompatActivity {

    EditText edcurrentbill;
    Button resultbtn;
    TextView tvresult;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_work214_5);

        edcurrentbill=findViewById(R.id.edcurrentbill);
        resultbtn=findViewById(R.id.resultbtn);
        tvresult=findViewById(R.id.tvresult);

        resultbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String scurrentbill=edcurrentbill.getText().toString();

                float currentbill=Float.parseFloat(scurrentbill);

                float bill;

                if (currentbill<=50){
                    bill= (float) (currentbill*0.50);
                } else if (currentbill<=150) {
                    bill = (float) (25+(currentbill-50)*0.75);
                } else if (currentbill<=250) {
                    bill= (float) (25+75+(currentbill-150)*1.20);
                }else {
                    bill= (float) (25+75+120+(currentbill-250)*1.50);
                }

                bill= (float) (bill+bill*0.20);

                tvresult.setText("Total Currrent Bill : "+bill);

            }
        });

    }
}