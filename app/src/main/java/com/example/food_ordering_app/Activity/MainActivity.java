package com.example.food_ordering_app.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.example.food_ordering_app.R;

import java.util.function.IntToDoubleFunction;

public class MainActivity extends AppCompatActivity {
    ImageView veg, nonveg, drinks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        veg = (ImageView) findViewById(R.id.imageView5);
        veg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this, com.example.food_ordering_app.Activity.veg.class);
                startActivity(it);
            }
        });
        nonveg = (ImageView) findViewById(R.id.imageView7);

        drinks = (ImageView)findViewById(R.id.imageView6);
    }
}