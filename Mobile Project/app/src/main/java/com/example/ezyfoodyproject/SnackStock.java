package com.example.ezyfoodyproject;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SnackStock extends AppCompatActivity {
    ArrayList<ShowProduct> stockList;
    RecyclerView viewSnack;
    ViewAdapter adapter;
    private Button myOrderButton;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sub_menu_snacks);

        stockList = new ArrayList<>();
        snacksData();

        viewSnack = findViewById(R.id.viewDrinks);
        viewSnack.setLayoutManager(new LinearLayoutManager(this));

        adapter = new ViewAdapter(this,stockList);
        viewSnack.setAdapter(adapter);

        myOrderButton = findViewById(R.id.myOrder);
        myOrderButton.setOnClickListener(view -> myOrder());
    }
    public void myOrder(){
        Intent myOrder = new Intent(this,MyOrder.class);
        startActivity(myOrder);
    }



    private void snacksData(){
        stockList = new ArrayList<>();
        stockList.add(new ShowProduct("Pisang Goreng", 17000,R.drawable.pisang));
        stockList.add(new ShowProduct("Otak - Otak",15000,R.drawable.otak));
        stockList.add(new ShowProduct("Roti Bakar",12000,R.drawable.roti));
        stockList.add(new ShowProduct("Kentang Goreng",19000,R.drawable.kentang));

    }


}

