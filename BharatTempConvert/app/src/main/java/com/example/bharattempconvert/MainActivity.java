package com.example.bharattempconvert;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText input;
    private TextView output;
    private Button c2fBtn, f2cBtn;
    private double temp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input = findViewById(R.id.input);
        output = findViewById(R.id.output);
        c2fBtn = findViewById(R.id.c2fBtn);
        f2cBtn = findViewById(R.id.f2cBtn);

        c2fBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String inputInString = input.getText().toString();
                Double inputInDouble = Double.parseDouble(inputInString);
                temp = (inputInDouble*9/5)+32;

                output.setVisibility(View.VISIBLE);
                output.setText(String.valueOf(inputInString + " Celsius in Fahreinheit = " + temp));
            }
        });

        f2cBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String inputInString = input.getText().toString();
                Double inputInDouble = Double.parseDouble(inputInString);
                temp = Math.round((inputInDouble - 32)*5/9);

                output.setVisibility(View.VISIBLE);
                output.setText(String.valueOf(inputInString + " Fahreinheit in Celsius = " + temp));
            }
        });
    }
}