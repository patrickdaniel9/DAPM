package com.example.myappli;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText Name;
    private EditText Password;
    private Button Login;
    private int counter = 10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Login = (Button)findViewById(R.id.btnLogin);

        Login.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Name = (EditText) findViewById(R.id.etName);
                Password = (EditText) findViewById(R.id.etPassword);
                validate(Name.getText().toString(), Password.getText().toString());
            }
        });

    }

    private void validate(String userName, String userPassword){
        if((userName.equals("student")) && (userPassword.equals("student"))){
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        startActivity(intent);
    }else{
            counter--;
            if(counter == 0){
                Login.setEnabled(false);
            }
        }
    }
}

