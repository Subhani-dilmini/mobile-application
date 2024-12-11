package com.myapp.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    Button buttonAdd = findViewById(R.id.btn_add), buttonSub, buttonMul, buttonDiv;
    EditText editText1, editText2;
    TextView textView;
    int num1, num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        buttonAdd = findViewById(R.id.btn_add);
        buttonSub = findViewById(R.id.btn_sub);
        buttonMul = findViewById(R.id.btn_mul);
        buttonDiv = findViewById(R.id.btn_div);
        editText1 = findViewById(R.id.number1);
        editText2 = findViewById(R.id.number2);
        textView = findViewById(R.id.answer);

        buttonAdd.setOnClickListener(this);
        buttonSub.setOnClickListener(this);
        buttonMul.setOnClickListener(this);
        buttonDiv.setOnClickListener(this);

    }

    public int getIntFromEditText(EditText editText)
    {
        if (editText.getText().toString().equals("")) {
            Toast.makeText(editText.getContext(), "Enter number", Toast.LENGTH_SHORT).show();
            return 0;
        } else
        return Integer.parseInt(editText.getText().toString());
    }


    @Override
    public void onClick(View view) {
        try {
            int num1 = Integer.parseInt(editText1.getText().toString());
            int num2 = Integer.parseInt(editText2.getText().toString());

            if (view.getId() == R.id.btn_add) {
                textView.setText("Answer : " + (num1 + num2));
            } else if (view.getId() == R.id.btn_sub) {
                textView.setText("Answer : " + (num1 - num2));
            } else if (view.getId() == R.id.btn_mul) {
                textView.setText("Answer : " + (num1 * num2));
            } else if (view.getId() == R.id.btn_div) {
                if (num2 != 0) {
                    textView.setText("Answer : " + ((float) num1 / num2));
                } else {
                    textView.setText("Cannot divide by zero");
                }
            }
        } catch (NumberFormatException e) {
            textView.setText("Invalid input");
        }
    }




    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {
        super.onPointerCaptureChanged(hasCapture);
    }
}