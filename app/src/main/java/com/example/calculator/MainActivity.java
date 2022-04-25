package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    private EditText firstNum;
    private EditText secondNum;
    private EditText result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstNum = findViewById(R.id.firstNum);
        secondNum = findViewById(R.id.secondNum);
        result = findViewById(R.id.result);
    }

    public void plus(View view) {
        int res = Integer.parseInt(firstNum.getText().toString()) + Integer.parseInt(secondNum.getText().toString());
        result.setText(String.valueOf(res));
    }

    public void minus(View view) {
        int res = Integer.parseInt(firstNum.getText().toString()) - Integer.parseInt(secondNum.getText().toString());
        result.setText(String.valueOf(res));
    }

    public void multiply(View view) {
        int res = Integer.parseInt(firstNum.getText().toString()) * Integer.parseInt(secondNum.getText().toString());
        result.setText(String.valueOf(res));
    }

    public void divide(View view) {
        double res = Double.parseDouble(firstNum.getText().toString()) + Double.parseDouble(secondNum.getText().toString());
        result.setText(String.valueOf(res));
    }
}