package com.example.kgitbank.bmiapplication;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText height = findViewById(R.id.height);
        EditText weight = findViewById(R.id.weight);
        final String sHeight = height.getText().toString();
        double fHeight = Double.parseDouble(sHeight);
        final String sWeight = weight.getText().toString();
        double fweight = Double.parseDouble(sWeight);
        TextView res = findViewById(R.id.res);
       final Context ctx = MainActivity.this;
        findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double bmi = 0.0;
                double dHeight =Double.parseDouble(sHeight);
                double dWeight =Double.parseDouble(sWeight);
                String result="";
                bmi = dWeight/((dHeight*dHeight)*10000);
                Log.d("bmi",bmi+"");
                if(bmi>30){
                    result="비만";
                }else if(bmi>25) {
                    result = "과체중";
                }else if(bmi>18.5){
                    result = "정상";
                }else{
                    result = "저체중";
                }
                Toast.makeText(ctx,"클릭",Toast.LENGTH_LONG).show();
            }
        });


    }
}
