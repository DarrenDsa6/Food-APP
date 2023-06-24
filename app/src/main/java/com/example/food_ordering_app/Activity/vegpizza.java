package com.example.food_ordering_app.Activity;

import android.annotation.SuppressLint;
import android.os.Bundle;

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
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedIntanceState) {
        super.onCreate(savedIntanceState);
        setContentView(R.layout.veg);
        recyclerView = findViewById(R.id.recyclerview2);
        ArrayList<vegmodel> vegmodels = new ArrayList<>();
        vegmodels.add(new vegmodel(R.drawable.margarita, "Margarita", "125"));
        vegmodels.add(new vegmodel(R.drawable.peppypaneer, "Peppy Paneer", "125"));
        vegmodels.add(new vegmodel(R.drawable.farmhouse, "Farmhouse", "125"));
        vegmodels.add(new vegmodel(R.drawable.mexican_green_wave, "Mexican Green Wave", "125"));
        veglistAdapter veglistAdapter = new veglistAdapter(vegmodels, this);
        recyclerView.setAdapter(veglistAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
