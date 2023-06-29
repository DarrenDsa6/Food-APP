package com.example.food_ordering_app.Activity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.food_ordering_app.Adapter.FoodListAdapter;
import com.example.food_ordering_app.Model.pizzamodel;
import com.example.food_ordering_app.R;

import java.util.ArrayList;
import java.util.List;


public class allpizzas extends AppCompatActivity {
    RecyclerView recyclerView;
    ImageView home, cart, support, about;
    SearchView searchView;
    FoodListAdapter foodListAdapter;
    ArrayList<pizzamodel> items;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pizza);
        searchView = findViewById(R.id.searchview);
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                fileList(newText);
                return true;
            }
        });
        recyclerView = findViewById(R.id.recyclerview);
        items = new ArrayList<>();
        items.add(new pizzamodel(R.drawable.margarita, "Margarita", "Rs 125"));
        items.add(new pizzamodel(R.drawable.peppypaneer, "Peppy Paneer", "Rs 125"));
        items.add(new pizzamodel(R.drawable.farmhouse, "Farmhouse", "Rs 125"));
        items.add(new pizzamodel(R.drawable.mexican_green_wave, "Mexican Green Wave", "Rs 125"));
        items.add(new pizzamodel(R.drawable.pepperbarbequeonion, "Pepper Barbeque onion", "Rs 125"));
        items.add(new pizzamodel(R.drawable.chickenfiest, "Chicken Fiesta", "Rs 125"));
        items.add(new pizzamodel(R.drawable.chickenpepper, "Pepperoni chicken", "Rs 125"));
        items.add(new pizzamodel(R.drawable.nonvegsupreme, "Non Veg Supreme", "Rs 125"));
        foodListAdapter = new FoodListAdapter(this, items);
        recyclerView.setAdapter(foodListAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        home = (ImageView)findViewById(R.id.imageView8);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent home = new Intent(allpizzas.this, MainActivity.class);
                startActivity(home);
            }
        });
        cart = (ImageView)findViewById(R.id.imageView9);
        cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cart = new Intent(allpizzas.this, orders.class);
                startActivity(cart);
            }
        });
        support  = (ImageView)findViewById(R.id.imageView10);
        support.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent support = new Intent(allpizzas.this, support.class);
                startActivity(support);
            }
        });
        about  = (ImageView)findViewById(R.id.imageView11);
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent about = new Intent(allpizzas.this, about.class);
                startActivity(about);
            }
        });
    }

    private void fileList(String newText) {
        ArrayList<pizzamodel> filteredList = new ArrayList<>();
        for(pizzamodel item: items) {
            if (item.getPizza().toLowerCase().contains(newText.toLowerCase())) {
                filteredList.add(item);
            }
        }
        if(filteredList.isEmpty()){
            Toast.makeText(this, "No data found", Toast.LENGTH_LONG).show();
        } else{
            foodListAdapter.setFilteredList(filteredList, this);
        }
    }

}
