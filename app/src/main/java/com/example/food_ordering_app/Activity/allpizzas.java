package com.example.food_ordering_app.Activity;

import android.annotation.SuppressLint;
import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SearchView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.food_ordering_app.Adapter.FoodListAdapter;
import com.example.food_ordering_app.Model.pizzamodel;
import com.example.food_ordering_app.R;

import java.util.ArrayList;


public class allpizzas extends AppCompatActivity {
    RecyclerView recyclerView;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pizza);
        recyclerView = findViewById(R.id.recyclerview);
        ArrayList<pizzamodel> pizzamodels = new ArrayList<>();
        pizzamodels.add(new pizzamodel(R.drawable.margarita, "Margarita", "125"));
        pizzamodels.add(new pizzamodel(R.drawable.peppypaneer, "Peppy Paneer", "125"));
        pizzamodels.add(new pizzamodel(R.drawable.farmhouse, "Farmhouse", "125"));
        pizzamodels.add(new pizzamodel(R.drawable.mexican_green_wave, "Mexican Green Wave", "125"));
        pizzamodels.add(new pizzamodel(R.drawable.pepperbarbequeonion, "Pepper Barbeque onion", "125"));
        pizzamodels.add(new pizzamodel(R.drawable.chickenfiest, "Chicken Fiesta", "125"));
        pizzamodels.add(new pizzamodel(R.drawable.chickenpepper, "Pepperoni chicken", "125"));
        pizzamodels.add(new pizzamodel(R.drawable.nonvegsupreme, "Non Veg Supreme", "125"));
        FoodListAdapter foodListAdapter = new FoodListAdapter(this, pizzamodels);
        recyclerView.setAdapter(foodListAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

}
