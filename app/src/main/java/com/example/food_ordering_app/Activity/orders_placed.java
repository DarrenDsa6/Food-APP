package com.example.food_ordering_app.Activity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.food_ordering_app.R;

public class orders_placed extends AppCompatActivity {
    Button Return, Orders;
    @SuppressLint("MissingInflatedId")
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.order_placed);
        Return  = findViewById(R.id.button3);
        Return.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(orders_placed.this, MainActivity.class);
                startActivity(intent);
            }
        });
        Orders = findViewById(R.id.button4);
        Orders.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(orders_placed.this, orders.class);
                startActivity(intent);
            }
        });
    }
}
