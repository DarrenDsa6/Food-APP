package com.example.food_ordering_app.Activity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import com.example.food_ordering_app.R;

public class veg extends AppCompatActivity {
    ImageView margarita, home, cart, settings;
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
        margarita = (ImageView) findViewById(R.id.imageView4);
        margarita.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(veg.this, margarita.class);
                startActivity(it);
            }
        });
    }
}

