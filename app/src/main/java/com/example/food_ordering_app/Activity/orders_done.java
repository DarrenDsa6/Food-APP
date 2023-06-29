package com.example.food_ordering_app.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.food_ordering_app.R;

public class orders_done extends AppCompatActivity {
    Button home;
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acitivty_ordersdone);
        home = findViewById(R.id.button3);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(orders_done.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}
