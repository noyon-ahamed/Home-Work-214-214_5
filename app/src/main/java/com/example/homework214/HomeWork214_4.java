package com.example.homework214;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class HomeWork214_4 extends AppCompatActivity {

    EditText edbangla,edendlish,edphysics,edchemestry,edbiology,edmath;
    Button resultbtn;
    TextView tvresult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_work214_4);

        edbangla=findViewById(R.id.edbangla);
        edphysics=findViewById(R.id.edphysics);
        edbiology=findViewById(R.id.edbiology);
        edchemestry=findViewById(R.id.edchemestry);
        edendlish=findViewById(R.id.edenglish);
        edmath=findViewById(R.id.edmath);

        resultbtn=findViewById(R.id.resultbtn);
        tvresult=findViewById(R.id.tvresult);

        resultbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String sedbangla=edbangla.getText().toString();
                String sedphysics=edphysics.getText().toString();
                String sedchemestry=edchemestry.getText().toString();
                String sedenglish=edendlish.getText().toString();
                String sedbiology=edbiology.getText().toString();
                String sedmatth=edmath.getText().toString();

                float bangla=Float.parseFloat(sedbangla);
                float english=Float.parseFloat(sedenglish);
                float math=Float.parseFloat(sedmatth);
                float physics=Float.parseFloat(sedphysics);
                float chemestry=Float.parseFloat(sedchemestry);
                float biology=Float.parseFloat(sedbiology);

               float parcentige;
               parcentige= (float) ((physics+chemestry+bangla+math+english+biology)/5.0);

               if (parcentige>=90){
                   tvresult.setText( parcentige+" Golden A+");
               } else if (parcentige>=80) {
                   tvresult.setText( parcentige+" Grade A");
               } else if (parcentige>=60) {
                   tvresult.setText( parcentige+" Grade B");
               } else if (parcentige>=50) {
                   tvresult.setText( parcentige+" Grade C");
               } else if (parcentige>=43) {
                   tvresult.setText( parcentige+" Grade D");
               } else if (parcentige>=33) {
                   tvresult.setText( parcentige+" Grade E");
               }else {
                   tvresult.setText( parcentige+" Grade F");
               }


            }
        });


    }
}