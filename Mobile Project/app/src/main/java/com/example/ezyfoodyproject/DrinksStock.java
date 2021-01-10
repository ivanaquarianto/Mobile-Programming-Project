package com.example.ezyfoodyproject;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class DrinksStock extends AppCompatActivity {
    ArrayList<ShowProduct> stockList;
    RecyclerView viewDrinks;
    ViewAdapter adapter;
    private Button myOrderButton;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sub_menu_drinks);

        stockList = new ArrayList<>();
        drinksData();

        viewDrinks = findViewById(R.id.viewDrinks);
        viewDrinks.setLayoutManager(new LinearLayoutManager(this));

        adapter = new ViewAdapter(this,stockList);
        viewDrinks.setAdapter(adapter);

        myOrderButton = findViewById(R.id.myOrder);
        myOrderButton.setOnClickListener(view -> myOrder());
    }
    public void myOrder(){
        Intent myOrder = new Intent(this,MyOrder.class);
        startActivity(myOrder);
    }



    private void drinksData(){
        stockList = new ArrayList<>();
        stockList.add(new ShowProduct("Teh botol", 6000,R.drawable.tbotol));
        stockList.add(new ShowProduct("Teh Pucuk",5000,R.drawable.tpucuk));
        stockList.add(new ShowProduct("Teh Gelas",3000,R.drawable.tgelas));
        stockList.add(new ShowProduct("Coca Cola",5500,R.drawable.coca));
        stockList.add(new ShowProduct("Pepsi",4500,R.drawable.pepsi));

    }


}

