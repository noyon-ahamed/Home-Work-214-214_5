package com.example.homework214;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class HomeWork214_1 extends AppCompatActivity {

    EditText ednumber1;
    TextView tvresult;
    Button resultbtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_work214_1);

        ednumber1=findViewById(R.id.ednumber1);
        tvresult=findViewById(R.id.tvresult);
        resultbtn=findViewById(R.id.resultbtn);

        resultbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String snumber=ednumber1.getText().toString();

                if (snumber.length()>0){

                    float number=Float.parseFloat(snumber);
                    if (number%5==0 && number%11==0){
                        tvresult.setText(number+"  ৫ এবং ১১ ধারা বিভাজ্য ");
                    }else {
                        tvresult.setText(number+" ৫ এবং ১১ ধারা বিভাজ্য নয় ");
                    }
                }else {
                    Toast.makeText(HomeWork214_1.this, "please input number", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}