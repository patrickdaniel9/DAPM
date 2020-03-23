package com.example.laborator6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        final MySharedPreference preferinte = new MySharedPreference(SecondActivity.this);
        TextView txt = findViewById(R.id.textView);
    }
}
