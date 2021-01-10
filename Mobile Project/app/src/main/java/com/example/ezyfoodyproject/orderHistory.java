package com.example.ezyfoodyproject;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class orderHistory extends AppCompatActivity {
    private Button MainMenuButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.order_history);


        MainMenuButton = findViewById(R.id.MainMenuButton);
        MainMenuButton.setOnClickListener(view -> MainMenu());

    }
    public void MainMenu(){
        Intent intent =new Intent( this,MainActivity.class);
        startActivity(intent);
    }


}
