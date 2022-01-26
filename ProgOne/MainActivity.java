package com.example.lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText number1;
    EditText number2;
    Button Add_button;
    TextView result;
    int ans=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        number1=(EditText) findViewById(R.id.editTextTextPersonName2);
        number2=(EditText) findViewById(R.id.editTextTextPersonName8);
        Add_button=(Button) findViewById(R.id.button);
        result = (TextView) findViewById(R.id.editTextTextPersonName9);

        Intent res=new Intent(this,addition.class);

        Add_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // num1 or num2 double type
                // get data which is in edittext, convert it to string
                // using parse Double convert it to Double type
                int num1 = Integer.parseInt(number1.getText().toString());
                int num2 = Integer.parseInt(number2.getText().toString());
                // add both number and store it to sum
                int sum = num1 + num2;
                // set it ot result textview
                result.setText(Double.toString(sum));

                result.putExtra(name: "Result",Integer.toString(sum));
            }
        });
    }
}