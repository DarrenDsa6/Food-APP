package com.example.food_ordering_app.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.food_ordering_app.R;

import org.w3c.dom.Text;

import java.util.function.IntToDoubleFunction;

public class MainActivity extends AppCompatActivity {
    ImageView veg, nonveg, drinks;
    TextView order;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nonveg = (ImageView) findViewById(R.id.imageView7);
        nonveg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nonveg = new Intent(MainActivity.this, nonveg.class);
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
                Intent it = new Intent(MainActivity.this, com.example.food_ordering_app.Activity.veg.class);
                startActivity(it);
            }
        });
        nonveg = (ImageView) findViewById(R.id.imageView7);

        drinks = (ImageView)findViewById(R.id.imageView6);
    }
}