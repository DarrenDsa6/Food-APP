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

import com.example.food_ordering_app.R;


public class allpizzas extends AppCompatActivity {

    ImageView back, home, cart, support, about;
    ImageView farmhouse, peppypaneer, mexican, margarita, fiesta, supreme, barbeque, pepperoni;
    SearchView searchView;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pizza);
        back = (ImageButton) findViewById(R.id.imageButton2);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent back = new Intent(allpizzas.this, MainActivity.class);
                startActivity(back);
            }
        });
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
                Intent cart = new Intent(allpizzas.this, cart.class);
                startActivity(cart);
            }
        });
        support  = (ImageView)findViewById(R.id.imageView9);
        support.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent support = new Intent(allpizzas.this, support.class);
                startActivity(support);
            }
        });
        about  = (ImageView)findViewById(R.id.imageView10);
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent about = new Intent(allpizzas.this, about.class);
                startActivity(about);
            }
        });
        pepperoni = (ImageView) findViewById(R.id.pepperoniimage);
        pepperoni.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(allpizzas.this, com.example.food_ordering_app.Activity.pizzas.pepperoni.class);
                startActivity(it);
            }
        });
        barbeque = (ImageView) findViewById(R.id.pepperonionimage);
        barbeque.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(allpizzas.this, com.example.food_ordering_app.Activity.pizzas.barbeque.class);
                startActivity(it);
            }
        });
        supreme = (ImageView) findViewById(R.id.nonvegsupremeimage);
        supreme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(allpizzas.this, com.example.food_ordering_app.Activity.pizzas.supreme.class);
                startActivity(it);
            }
        });
        fiesta = (ImageView) findViewById(R.id.fiestaimage);
        fiesta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(allpizzas.this, com.example.food_ordering_app.Activity.pizzas.fiesta.class);
                startActivity(it);
            }
        });
        margarita = (ImageView) findViewById(R.id.margaritaimage);
        margarita.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(allpizzas.this, com.example.food_ordering_app.Activity.pizzas.margarita.class);
                startActivity(it);
            }
        });
        peppypaneer = (ImageView) findViewById(R.id.paneerimage);
        peppypaneer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(allpizzas.this, com.example.food_ordering_app.Activity.pizzas.peppypaneer.class);
                startActivity(it);
            }
        });
        mexican = (ImageView) findViewById(R.id.mexicangreenimage);
        mexican.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(allpizzas.this, com.example.food_ordering_app.Activity.pizzas.mexican.class);
                startActivity(it);
            }
        });
        farmhouse = (ImageView) findViewById(R.id.farmhouseimage);
        farmhouse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(allpizzas.this, com.example.food_ordering_app.Activity.pizzas.farmhouse.class);
                startActivity(it);
            }
        });
    }


}
