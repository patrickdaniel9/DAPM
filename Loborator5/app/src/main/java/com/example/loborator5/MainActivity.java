package com.example.loborator5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView listOfCars;
    CarAdapter carAdapter;
    private EditText addNewCar;
    private Button addButton;
    private ArrayList<ImageView> imageViews;
    int[] carsIm = new int[]{
            R.drawable.lab5_car_icon};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listOfCars = (ListView) findViewById(R.id.lv_list_cars);
        final CarAdapter carAdapter = new CarAdapter(getApplicationContext());//, listOfCars, carsIm);
        carAdapter.addCar("BMW", 1);
        carAdapter.addCar("Mercedes", 2);
        carAdapter.addCar("Honda", 3);
        carAdapter.addCar("Ford", 4);
         addNewCar = (EditText) findViewById(R.id.ed_new_car);
        addButton = (Button) findViewById(R.id.b_add_car);

        addButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String str = addNewCar.getText().toString();
                carAdapter.addCar(str, 5);
                addNewCar.setText("");
            }
        });
    }

}
