package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button button_add,button_sub,button_mul,button_div,button_clear;
    private TextView textView_result;
    private EditText editText_value;
    private int sum = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button_add = findViewById(R.id.add_btn);
        button_sub = findViewById(R.id.sub_btn);
        button_mul = findViewById(R.id.multiply_btn);
        button_div =  findViewById(R.id.div_btn);
        button_clear = findViewById(R.id.clear_btn);
        textView_result = findViewById(R.id.result);
        editText_value = findViewById(R.id.enter_value);
        button_add.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                String str = editText_value.getText().toString();
                textView_result.setText(""+addition(str));
                setIntent(intent);
            }
        });
        button_sub.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                String str = editText_value.getText().toString();
                textView_result.setText(""+subtraction(str));
                setIntent(intent);
            }
        });
        button_mul.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                String str = editText_value.getText().toString();
                textView_result.setText(""+multiplication(str));
                setIntent(intent);
            }
        });
        button_div.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                String str = editText_value.getText().toString();
                textView_result.setText(""+division(str));
                setIntent(intent);
            }
        });
        button_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                textView_result.setText(clear());
            }
        });
    }

    public int addition(String str){
        int num = Integer.parseInt(str);
        sum = sum + num;
        return sum;
    }
    public int subtraction(String str){
        int num = Integer.parseInt(str);
        sum = sum - num;
        return sum;
    }
    public int multiplication(String str){
        int num = Integer.parseInt(str);
        sum = sum * num;
        return sum;
    }
    public int division(String str){
        int num = Integer.parseInt(str);
        sum = sum / num;
        return sum;
    }
    public String clear(){
        return "0";
    }
}