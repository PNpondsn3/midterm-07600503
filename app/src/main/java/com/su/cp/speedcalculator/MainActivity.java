package com.su.cp.speedcalculator;

import androidx.appcompat.app.AppCompatActivity;

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
        Button calculate = findViewById(R.id.CALCULATE);
        Button clear = findViewById(R.id.clear);
        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText editTextNumber =findViewById(R.id.editTextNumber);
                String distance = editTextNumber.getText().toString();
                Double distances = Double.parseDouble(distance);
                EditText editTextNumber2 = findViewById(R.id.editTextNumber2);
                String time = editTextNumber2.getText().toString();
                Double times = Double.parseDouble(time);
                if(distances == null && times == null){
                    Toast t = Toast.makeText(MainActivity.this,"Distance and Time are required.",Toast.LENGTH_LONG);}
                else if(distances == null){
                        Toast t = Toast.makeText(MainActivity.this,"Distance is required.",Toast.LENGTH_LONG);
                    }
                else if(times == null){
                    Toast t = Toast.makeText(MainActivity.this,"Time is required.",Toast.LENGTH_LONG);
                }
                else if(times == 0){
                    Toast t = Toast.makeText(MainActivity.this,"Time must be greater than zero.",Toast.LENGTH_LONG);
                }

            }
        });
    }
}