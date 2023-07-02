package com.example.food_ordering_app.Activity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.food_ordering_app.Adapter.drinkListAdapter;
import com.example.food_ordering_app.Adapter.nonveglistAdapter;
import com.example.food_ordering_app.Model.drinkmodel;
import com.example.food_ordering_app.Model.nonvegmodel;
import com.example.food_ordering_app.R;

import java.util.ArrayList;

public class drinks extends AppCompatActivity {
    ImageView home, cart, support, about;
    RecyclerView recyclerView;
    @SuppressLint("MissingInflatedId")
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.drinks);
        recyclerView = findViewById(R.id.recyclerview4);
        ArrayList<drinkmodel> drinkmodel = new ArrayList<>();
        drinkmodel.add(new drinkmodel(R.drawable.pepsi, "Pepsi", "Rs 45"));
        drinkmodel.add(new drinkmodel(R.drawable.coke, "Coke", "Rs 45"));
        drinkmodel.add(new drinkmodel(R.drawable.fanta, "Fanta", "Rs 45"));
        drinkmodel.add(new drinkmodel(R.drawable.sprite, "Sprite", "Rs 45"));
        drinkListAdapter drinklistAdapter = new drinkListAdapter(drinkmodel, this);
        recyclerView.setAdapter(drinklistAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        home = (ImageView)findViewById(R.id.imageView8);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent home = new Intent(drinks.this, MainActivity.class);
                startActivity(home);
            }
        });
        cart = (ImageView)findViewById(R.id.imageView9);
        cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cart = new Intent(drinks.this, orders.class);
                startActivity(cart);
            }
        });
        support  = (ImageView)findViewById(R.id.imageView10);
        support.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent support = new Intent(drinks.this, support.class);
                startActivity(support);
            }
        });
        about  = (ImageView)findViewById(R.id.imageView11);
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent about = new Intent(drinks.this, about.class);
                startActivity(about);
            }
        });
    }
}
