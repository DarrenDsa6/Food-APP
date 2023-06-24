package com.example.food_ordering_app.Activity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.food_ordering_app.R;

public class pizza extends AppCompatActivity {
    ImageView imageView;
    TextView name;
    TextView price;
    Button order;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.indi_pizza);
        imageView = findViewById(R.id.imageView12);
        name = findViewById(R.id.textView12);
        price = findViewById(R.id.textView16);
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        String string = bundle.getString("pizzaname");
        String string1 = bundle.getString("pizzaprice");
        int image = bundle.getInt("pizza");
        name.setText(string);
        price.setText(string1);
        imageView.setImageResource(image);
        order = findViewById(R.id.button);
        order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(pizza.this, orders.class);
                startActivity(intent1);
            }
        });
    }

}
