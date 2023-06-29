package com.example.food_ordering_app.Activity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.food_ordering_app.Adapter.nonveglistAdapter;
import com.example.food_ordering_app.Model.nonvegmodel;
import com.example.food_ordering_app.Model.pizzamodel;
import com.example.food_ordering_app.R;

import java.util.ArrayList;

public class nonvegpizza extends AppCompatActivity {

    ImageView home, cart, support, about;
    RecyclerView recyclerView;
    @SuppressLint("MissingInflatedId")
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nonveg);
        recyclerView = findViewById(R.id.recyclerview3);
        ArrayList<nonvegmodel> nonvegmodel = new ArrayList<>();
        nonvegmodel.add(new nonvegmodel(R.drawable.pepperbarbequeonion, "Pepper Barbeque onion", "125"));
        nonvegmodel.add(new nonvegmodel(R.drawable.chickenfiest, "Chicken Fiesta", "125"));
        nonvegmodel.add(new nonvegmodel(R.drawable.chickenpepper, "Pepperoni chicken", "125"));
        nonvegmodel.add(new nonvegmodel(R.drawable.nonvegsupreme, "Non Veg Supreme", "125"));
        nonveglistAdapter nonveglistAdapter = new nonveglistAdapter(nonvegmodel, this);
        recyclerView.setAdapter(nonveglistAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        home = (ImageView)findViewById(R.id.imageView8);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent home = new Intent(nonvegpizza.this, MainActivity.class);
                startActivity(home);
            }
        });
        cart = (ImageView)findViewById(R.id.imageView9);
        cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cart = new Intent(nonvegpizza.this, orders.class);
                startActivity(cart);
            }
        });
        support  = (ImageView)findViewById(R.id.imageView10);
        support.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent support = new Intent(nonvegpizza.this, support.class);
                startActivity(support);
            }
        });
        about  = (ImageView)findViewById(R.id.imageView11);
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent about = new Intent(nonvegpizza.this, about.class);
                startActivity(about);
            }
        });
    }
}
