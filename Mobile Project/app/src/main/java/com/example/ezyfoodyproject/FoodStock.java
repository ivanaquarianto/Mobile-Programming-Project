package com.example.ezyfoodyproject;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FoodStock extends AppCompatActivity {
    ArrayList<ShowProduct> stockList;
    RecyclerView viewFood;
    ViewAdapter adapter;
    private Button myOrderButton;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sub_menu_foods);

        stockList = new ArrayList<>();
        foodData();

        viewFood = findViewById(R.id.viewDrinks);
        viewFood.setLayoutManager(new LinearLayoutManager(this));

        adapter = new ViewAdapter(this,stockList);
        viewFood.setAdapter(adapter);

        myOrderButton = findViewById(R.id.myOrder);
        myOrderButton.setOnClickListener(view -> myOrder());
    }
    public void myOrder(){
        Intent myOrder = new Intent(this,MyOrder.class);
        startActivity(myOrder);
    }



    private void foodData(){
        stockList = new ArrayList<>();
        stockList.add(new ShowProduct("Cheese Burger", 15000,R.drawable.burger));
        stockList.add(new ShowProduct("Indomie Goreng",8000,R.drawable.indomie));
        stockList.add(new ShowProduct("Nasi Goreng",13000,R.drawable.nasgor));
        stockList.add(new ShowProduct("Pizza",45000,R.drawable.pizza));
        stockList.add(new ShowProduct("Sate",23000,R.drawable.sate));

    }


}

