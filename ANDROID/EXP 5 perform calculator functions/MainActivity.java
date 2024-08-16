package com.example.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText inputField;
    private String operator = "";
    private double firstValue = Double.NaN;
    private Button buttonEqual; // Declare buttonEqual as an instance variable

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputField = findViewById(R.id.inputField);

        // Number Buttons
        setNumberButton(R.id.button0, "0");
        setNumberButton(R.id.button1, "1");
        setNumberButton(R.id.button2, "2");
        setNumberButton(R.id.button3, "3");
        setNumberButton(R.id.button4, "4");
        setNumberButton(R.id.button5, "5");
        setNumberButton(R.id.button6, "6");
        setNumberButton(R.id.button7, "7");
        setNumberButton(R.id.button8, "8");
        setNumberButton(R.id.button9, "9");

        // Operator Buttons
        setOperatorButton(R.id.buttonAdd, "+");
        setOperatorButton(R.id.buttonSubtract, "-");
        setOperatorButton(R.id.buttonMultiply, "*");
        setOperatorButton(R.id.buttonDivide, "/");

        // Clear Button
        Button buttonClear = findViewById(R.id.buttonClear);
        buttonClear.setOnClickListener(v -> {
            inputField.setText("");
            firstValue = Double.NaN;
            operator = "";
        });

        // Equals Button
        buttonEqual = findViewById(R.id.buttonEqual); // Initialize buttonEqual here
        buttonEqual.setOnClickListener(v -> {
            if (!operator.isEmpty()) {
                double secondValue = Double.parseDouble(inputField.getText().toString());
                double result = 0;
                switch (operator) {
                    case "+":
                        result = firstValue + secondValue;
                        break;
                    case "-":
                        result = firstValue - secondValue;
                        break;
                    case "*":
                        result = firstValue * secondValue;
                        break;
                    case "/":
                        if (secondValue != 0) {
                            result = firstValue / secondValue;
                        } else {
                            inputField.setText("Error");
                            return;
                        }
                        break;
                }
                inputField.setText(String.valueOf(result));
                operator = "";
                firstValue = Double.NaN;
            }
        });
    }

    private void setNumberButton(int buttonId, String value) {
        Button button = findViewById(buttonId);
        button.setOnClickListener(v -> {
            String currentText = inputField.getText().toString();
            inputField.setText(currentText + value);
        });
    }

    private void setOperatorButton(int buttonId, String op) {
        Button button = findViewById(buttonId);
        button.setOnClickListener(v -> {
            if (!operator.isEmpty()) {
                // Handle case when operator is already set
                buttonEqual.performClick();
            }
            operator = op;
            firstValue = Double.parseDouble(inputField.getText().toString());
            inputField.setText("");
        });
    }
}
