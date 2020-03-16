package com.example.loborator5;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class CarAdapter extends BaseAdapter {

    Context context;
    ArrayList<Car> cars;
    LayoutInflater inflter;

    public CarAdapter (Context context){
            //,  ArrayList<Car>  cars, int[] carsImg) {
        this.context = context;
        //this.cars = cars;
       // this.carsImg = carsImg;
        inflter = (LayoutInflater.from(context));
    }

    public void addCar(String nameCar, int resource){
        Car car = new Car();
        car.name = nameCar;
        car.imageResource = resource;
        cars.add(car);
        this.notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return cars.size();
    }

    @Override
    public Object getItem(int position) {
        return cars.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        TextView car = (TextView) view.findViewById(R.id.tv_name_element);
        ImageView icon = (ImageView) view.findViewById(R.id.iv_image_element);
        car.setText(cars.get(i).getName());
        return view;
    }
}
