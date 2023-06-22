package com.example.food_ordering_app.Activity.pizzas;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.food_ordering_app.R;
import com.google.firebase.database.DatabaseReference;

public class supreme extends AppCompatActivity {
    Button order;
    private DatabaseReference databaseReference;
    ImageView back, home, cart, support, about;
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.supreme);

    }
}
