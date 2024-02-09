package com.example.homework214;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class HomeWork214_3 extends AppCompatActivity {

    EditText ednumber3;
    Button resultbtn;
    TextView tvresult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_work214_3);

        ednumber3=findViewById(R.id.ednumber3);
        resultbtn=findViewById(R.id.resultbtn);
        tvresult=findViewById(R.id.tvresult);

        resultbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sweaknumber=ednumber3.getText().toString();

                if (sweaknumber.length()<=7){

                    int weaknumber=Integer.parseInt(sweaknumber);

                    if (weaknumber==1){
                        tvresult.setText(" Saturday");
                    } else if (weaknumber==2) {
                        tvresult.setText(" Sunday");
                    } else if (weaknumber==3) {
                        tvresult.setText(" Monday");
                    } else if (weaknumber==4) {
                        tvresult.setText(" Thuesday");
                    } else if (weaknumber==5) {
                        tvresult.setText(" Wednesday");
                    } else if (weaknumber==6) {
                       tvresult.setText(" Thursday");
                    } else if (weaknumber==7) {
                        tvresult.setText(" Friday");
                    }
                }else {
                    Toast.makeText(HomeWork214_3.this, "Input Number", Toast.LENGTH_SHORT).show();
                }

            }
        });

    }
}