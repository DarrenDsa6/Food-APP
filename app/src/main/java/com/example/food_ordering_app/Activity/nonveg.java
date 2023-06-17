package com.example.food_ordering_app.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.food_ordering_app.R;

public class nonveg extends AppCompatActivity {
    ImageView back, home, cart, support, about;
    ImageView fiesta, barbeque, pepperoni, supreme;
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nonveg);
        home = (ImageView)findViewById(R.id.imageView8);
        back = (ImageButton) findViewById(R.id.imageButton2);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent back = new Intent(nonveg.this, MainActivity.class);
                startActivity(back);
            }
        });
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent home = new Intent(nonveg.this, MainActivity.class);
                startActivity(home);
            }
        });
        cart = (ImageView)findViewById(R.id.imageView9);
        cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cart = new Intent(nonveg.this, cart.class);
                startActivity(cart);
            }
        });
        support  = (ImageView)findViewById(R.id.imageView9);
        support.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent support = new Intent(nonveg.this, support.class);
                startActivity(support);
            }
        });
        about  = (ImageView)findViewById(R.id.imageView10);
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent about = new Intent(nonveg.this, about.class);
                startActivity(about);
            }
        });
        pepperoni = (ImageView) findViewById(R.id.pepperoniimage);
        pepperoni.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(nonveg.this, com.example.food_ordering_app.Activity.pizzas.pepperoni.class);
                startActivity(it);
            }
        });
        barbeque = (ImageView) findViewById(R.id.pepperonionimage);
        barbeque.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(nonveg.this, com.example.food_ordering_app.Activity.pizzas.barbeque.class);
                startActivity(it);
            }
        });
        supreme = (ImageView) findViewById(R.id.nonvegsupremeimage);
        supreme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(nonveg.this, com.example.food_ordering_app.Activity.pizzas.supreme.class);
                startActivity(it);
            }
        });
        fiesta = (ImageView) findViewById(R.id.fiestaimage);
        fiesta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(nonveg.this, com.example.food_ordering_app.Activity.pizzas.fiesta.class);
                startActivity(it);
            }
        });
    }
}
