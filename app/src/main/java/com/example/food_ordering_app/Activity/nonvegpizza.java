package com.example.food_ordering_app.Activity;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.food_ordering_app.Adapter.nonveglistAdapter;
import com.example.food_ordering_app.Model.nonvegmodel;
import com.example.food_ordering_app.Model.pizzamodel;
import com.example.food_ordering_app.R;

import java.util.ArrayList;

public class nonvegpizza extends AppCompatActivity {

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
    }
}
