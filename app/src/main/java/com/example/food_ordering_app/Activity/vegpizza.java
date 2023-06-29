package com.example.food_ordering_app.Activity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.food_ordering_app.Adapter.FoodListAdapter;
import com.example.food_ordering_app.Adapter.veglistAdapter;
import com.example.food_ordering_app.Model.pizzamodel;
import com.example.food_ordering_app.Model.vegmodel;
import com.example.food_ordering_app.R;

import java.util.ArrayList;

public class vegpizza extends AppCompatActivity {
    RecyclerView recyclerView;
    ImageView home, cart, about, support;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedIntanceState) {
        super.onCreate(savedIntanceState);
        setContentView(R.layout.veg);
        recyclerView = findViewById(R.id.recyclerview2);
        ArrayList<vegmodel> vegmodels = new ArrayList<>();
        vegmodels.add(new vegmodel(R.drawable.margarita, "Margarita", "Rs 125"));
        vegmodels.add(new vegmodel(R.drawable.peppypaneer, "Peppy Paneer", "Rs 125"));
        vegmodels.add(new vegmodel(R.drawable.farmhouse, "Farmhouse", "Rs 125"));
        vegmodels.add(new vegmodel(R.drawable.mexican_green_wave, "Mexican Green Wave", "Rs 125"));
        veglistAdapter veglistAdapter = new veglistAdapter(vegmodels, this);
        recyclerView.setAdapter(veglistAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        home = (ImageView)findViewById(R.id.imageView8);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent home = new Intent(vegpizza.this, MainActivity.class);
                startActivity(home);
            }
        });
        cart = (ImageView)findViewById(R.id.imageView9);
        cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cart = new Intent(vegpizza.this, orders.class);
                startActivity(cart);
            }
        });
        support  = (ImageView)findViewById(R.id.imageView10);
        support.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent support = new Intent(vegpizza.this, support.class);
                startActivity(support);
            }
        });
        about  = (ImageView)findViewById(R.id.imageView11);
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent about = new Intent(vegpizza.this, about.class);
                startActivity(about);
            }
        });
    }

}
