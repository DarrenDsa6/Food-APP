package com.example.food_ordering_app.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.food_ordering_app.R;

public class allpizzas extends AppCompatActivity {
    ImageView back, home;
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pizza);
        back = (ImageView) findViewById(R.id.imageButton2);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent back = new Intent(allpizzas.this, MainActivity.class);
                startActivity(back);
            }
        });
        home = (ImageView) findViewById(R.id.imageView8);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent home = new Intent(allpizzas.this, MainActivity.class);
                startActivity(home);
            }
        });
    }
}
