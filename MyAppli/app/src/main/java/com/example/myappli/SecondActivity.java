package com.example.myappli;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class SecondActivity extends AppCompatActivity {

    public static final Random RANDOM = new Random(10-0);
    public int Rand;
    public TextView textView;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.secondactivity);
        textView = findViewById(R.id.text2);

        newGame();



    }
    public void test(View view){
        EditText input = (EditText) findViewById(R.id.text1);
        if (input != null ){
            validate(input);
        }
    }

    public void validate(EditText input){

        EditText editText=findViewById(R.id.text1);
        String temp=editText.getText().toString();
        int value=0;
        if (!"".equals(temp)){
            value=Integer.parseInt(temp);
        }
        if(Rand>value)
            textView.setText("incearca mai mare");
        else
            if(Rand<value)
                textView.setText("incearca mai mic");
            else {
                textView.setText("felicitari");
                newGame();
            }
    }
    public void newGame(){
        Rand=RANDOM.nextInt(11);
    }
}
