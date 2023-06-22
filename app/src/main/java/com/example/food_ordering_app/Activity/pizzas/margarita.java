package com.example.food_ordering_app.Activity.pizzas;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.food_ordering_app.R;
import com.example.food_ordering_app.Activity.*;

public class margarita extends AppCompatActivity {
    Button order;
    ImageView back, home, cart, support, about;
    @SuppressLint({"MissingInflatedId", "CutPasteId"})
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.margarita);
        order = (Button) findViewById(R.id.button2);
        order.setOnClickListener(new View.OnClickListener() {
            final String str = "Margarita".toString();
            @Override
            public void onClick(View v) {
                Intent order = new Intent(margarita.this, orders.class);
                startActivity(order);

            }
        });
        back = (ImageButton) findViewById(R.id.imageButton);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent back = new Intent(margarita.this, veg.class);
                startActivity(back);
            }
        });
        home = (ImageView)findViewById(R.id.imageView8);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent home = new Intent(margarita.this, com.example.food_ordering_app.Activity.MainActivity.class);
                startActivity(home);
            }
        });
        cart = (ImageView)findViewById(R.id.imageView9);
        cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cart = new Intent(margarita.this, com.example.food_ordering_app.Activity.cart.class);
                startActivity(cart);
            }
        });
        support  = (ImageView)findViewById(R.id.imageView9);
        support.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent support = new Intent(margarita.this, com.example.food_ordering_app.Activity.support.class);
                startActivity(support);
            }
        });
        about  = (ImageView)findViewById(R.id.imageView10);
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent about = new Intent(margarita.this, com.example.food_ordering_app.Activity.about.class);
                startActivity(about);
            }
        });

    }

}
