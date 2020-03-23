package com.example.laborator6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final MySharedPreference preferinte = new MySharedPreference(MainActivity.this);
        Button butonSave = findViewById(R.id.Btn1);
        Button butonSecondActivity = findViewById(R.id.Btn2);
        final EditText txt = findViewById(R.id.editText);
        butonSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preferinte.save(txt.getText().toString());
            }
        });
        butonSecondActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                startActivity(intent);
            }
        });
    }
}