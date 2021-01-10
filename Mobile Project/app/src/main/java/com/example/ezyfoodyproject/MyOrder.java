package com.example.ezyfoodyproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyOrder extends AppCompatActivity {
    private Button PayButton;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_order);

        PayButton = findViewById(R.id.PayButton);
        PayButton.setOnClickListener(view -> openPay());
    }
    public void openPay(){
        Intent openPayButton = new Intent(this,OrderReceipt.class);
        startActivity(openPayButton);
    }



}
