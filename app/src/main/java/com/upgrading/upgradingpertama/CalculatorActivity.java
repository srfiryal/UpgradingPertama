package com.upgrading.upgradingpertama;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class CalculatorActivity extends AppCompatActivity {
    EditText txt_firstNumber, txt_secondNumber;
    Button btn_add, btn_subtract, btn_multiply, btn_divide;
    TextView tv_result;
    double firstNumber, secondNumber, result;
    String firstNumberString, secondNumberString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        txt_firstNumber = findViewById(R.id.txt_firstNumber_calculator);
        txt_secondNumber = findViewById(R.id.txt_secondNumber_calculator);
        btn_add = findViewById(R.id.btn_add_calculator);
        btn_subtract = findViewById(R.id.btn_subtract_calculator);
        btn_multiply = findViewById(R.id.btn_multiply_calculator);
        btn_divide = findViewById(R.id.btn_divide_calculator);
        tv_result = findViewById(R.id.tv_result_calculator);

        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate("+");
            }
        });

        btn_subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate("-");
            }
        });

        btn_multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate("*");
            }
        });

        btn_divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate("/");
            }
        });
    }

    private void calculate(String operator) {
        firstNumberString = txt_firstNumber.getText().toString();
        secondNumberString = txt_secondNumber.getText().toString();

        if (firstNumberString.trim().isEmpty() && secondNumberString.trim().isEmpty()) {
            Toast.makeText(CalculatorActivity.this, "Please fill in all the fields", Toast.LENGTH_SHORT).show();
        } else {
            firstNumber = Double.parseDouble(firstNumberString);
            secondNumber = Double.parseDouble(secondNumberString);

            switch (operator) {
                case "+":
                    result = firstNumber + secondNumber;
                    tv_result.setText(String.valueOf(result));
                    break;
                case "-":
                    result = firstNumber - secondNumber;
                    tv_result.setText(String.valueOf(result));
                    break;
                case "*":
                    result = firstNumber * secondNumber;
                    tv_result.setText(String.valueOf(result));
                    break;
                case "/":
                    result = firstNumber / secondNumber;
                    tv_result.setText(String.valueOf(result));
                    break;
                default:
                    Toast.makeText(CalculatorActivity.this, "Error calculating result", Toast.LENGTH_SHORT).show();
                    break;
            }
        }
    }
}