package com.example.food_ordering_app.Activity;

import com.example.food_ordering_app.Activity.pizzas.*;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.food_ordering_app.R;

public class veg extends AppCompatActivity {
    ImageView margarita, farmhouse, peppypaneer, mexican, home, cart, support, about;
    ImageButton back;
    @SuppressLint("MissingInflatedId")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_veg_pizza);
        home = (ImageView)findViewById(R.id.imageView8);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent home = new Intent(veg.this, MainActivity.class);
                startActivity(home);
            }
        });
        back = (ImageButton)findViewById(R.id.imageButton2);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent back = new Intent(veg.this, MainActivity.class);
                startActivity(back);
            }
        });
        cart = (ImageView)findViewById(R.id.imageView9);
        cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cart = new Intent(veg.this, cart.class);
                startActivity(cart);
            }
        });
        support  = (ImageView)findViewById(R.id.imageView9);
        support.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent support = new Intent(veg.this, support.class);
                startActivity(support);
            }
        });
        about  = (ImageView)findViewById(R.id.imageView10);
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent about = new Intent(veg.this, about.class);
                startActivity(about);
            }
        });
        margarita = (ImageView) findViewById(R.id.margaritaimage);
        margarita.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(veg.this, com.example.food_ordering_app.Activity.pizzas.margarita.class);
                startActivity(it);
            }
        });
        peppypaneer = (ImageView) findViewById(R.id.paneerimage);
        peppypaneer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(veg.this, com.example.food_ordering_app.Activity.pizzas.peppypaneer.class);
                startActivity(it);
            }
        });
        mexican = (ImageView) findViewById(R.id.mexicangreenimage);
        mexican.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(veg.this, com.example.food_ordering_app.Activity.pizzas.mexican.class);
                startActivity(it);
            }
        });
        farmhouse = (ImageView) findViewById(R.id.farmhouseimage);
        farmhouse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(veg.this, com.example.food_ordering_app.Activity.pizzas.farmhouse.class);
                startActivity(it);
            }
        });

    }
}

