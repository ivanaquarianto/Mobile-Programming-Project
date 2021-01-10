package com.example.ezyfoodyproject;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class FoodLayout extends AppCompatActivity {
    private Button addOrderButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.drinks_layout);

        addOrderButton = findViewById(R.id.addOrder);
        addOrderButton.setOnClickListener(view -> addOrder());
    }

    public void addOrder(){
        Intent intent = new Intent (this, MyOrder.class);
        startActivity(intent);
    }
}
