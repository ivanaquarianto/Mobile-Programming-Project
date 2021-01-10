 package com.example.ezyfoodyproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

 public class MainActivity extends AppCompatActivity {
     private Button drinksButton;
     private Button myOrderButton;
     private Button foodsButton;
     private Button snacksButton;
     private Button topupButton;
     private Button orderHistory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        drinksButton = findViewById(R.id.drinksbutton);
        drinksButton.setOnClickListener(view -> OpenDrinks());

        foodsButton = findViewById(R.id.foodsbutton);
        foodsButton.setOnClickListener(view -> OpenFoods());

        snacksButton = findViewById(R.id.snacksbutton);
        snacksButton.setOnClickListener(view -> OpenSnacks());

        topupButton = findViewById(R.id.topupbutton);
        topupButton.setOnClickListener(view -> OpenTopupButton());

        myOrderButton = findViewById(R.id.myOrder);
        myOrderButton.setOnClickListener(view -> myOrder());

        orderHistory = findViewById(R.id.history);
        orderHistory.setOnClickListener(view -> OrderHistory());
    }

    public void OpenDrinks(){
        Intent intent = new Intent (this, DrinksStock.class);
        startActivity(intent);
    }
     public void OpenFoods(){
         Intent intent = new Intent (this, FoodStock.class);
         startActivity(intent);
     }

     public void OpenSnacks(){
         Intent Snacks = new Intent (this, SnackStock.class);
         startActivity(Snacks);
     }

     public void OpenTopupButton(){
         Intent Topup = new Intent (this, TopUp.class);
         startActivity(Topup);
     }


    public void myOrder(){
        Intent myOrder = new Intent(this,MyOrder.class);
        startActivity(myOrder);
    }

     public void OrderHistory(){
         Intent history = new Intent(this,orderHistory.class);
         startActivity(history);
     }
}