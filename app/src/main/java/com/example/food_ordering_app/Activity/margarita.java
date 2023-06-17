package com.example.food_ordering_app.Activity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.food_ordering_app.R;

public class margarita extends AppCompatActivity {
    Button order;
    ImageView back, home;
    @SuppressLint("MissingInflatedId")
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.margarita);
        order = (Button) findViewById(R.id.button2);
        back = (ImageView) findViewById(R.id.imageButton);
        home = (ImageView)findViewById(R.id.imageView8);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent home = new Intent(margarita.this, MainActivity.class);
                startActivity(home);
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent back = new Intent(margarita.this, veg.class);
                startActivity(back);
            }
        });

    }

}
