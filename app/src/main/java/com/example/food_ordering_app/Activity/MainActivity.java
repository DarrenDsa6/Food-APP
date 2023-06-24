package com.example.food_ordering_app.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.food_ordering_app.R;

public class MainActivity extends AppCompatActivity {
    ImageView veg, nonveg, drinks, home, cart, support, about, searchview;

    TextView order;
    @SuppressLint({"MissingInflatedId", "CutPasteId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        home = (ImageView)findViewById(R.id.imageView8);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent home = new Intent(MainActivity.this, MainActivity.class);
                startActivity(home);
            }
        });
        cart = (ImageView)findViewById(R.id.imageView9);
        cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cart = new Intent(MainActivity.this, orders.class);
                startActivity(cart);
            }
        });
        support  = (ImageView)findViewById(R.id.imageView9);
        support.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent support = new Intent(MainActivity.this, support.class);
                startActivity(support);
            }
        });
        about  = (ImageView)findViewById(R.id.imageView10);
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent about = new Intent(MainActivity.this, about.class);
                startActivity(about);
            }
        });
        nonveg = (ImageView) findViewById(R.id.imageView7);
        nonveg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nonveg = new Intent(MainActivity.this, nonvegpizza.class);
                startActivity(nonveg);
            }
        });
        order = (TextView)findViewById(R.id.textView4);
        order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent order = new Intent(MainActivity.this, allpizzas.class);
                startActivity(order);
            }
        });

        veg = (ImageView) findViewById(R.id.imageView5);
        veg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this, vegpizza.class);
                startActivity(it);
            }
        });
        drinks = (ImageView)findViewById(R.id.imageView6);
        drinks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent drinks = new Intent(MainActivity.this, drinks.class);
                startActivity(drinks);
            }
        });
        searchview = (ImageView) findViewById(R.id.searchview1);
        searchview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent search = new Intent(MainActivity.this, allpizzas.class);
                startActivity(search);
            }
        });


    }

}