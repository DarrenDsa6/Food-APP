package com.example.food_ordering_app.Activity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.food_ordering_app.Model.pizzamodel;
import com.example.food_ordering_app.R;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class pizza extends AppCompatActivity {
    DatabaseReference databaseReference;
    ImageView imageView;
    TextView name;
    TextView price;
    Button order;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.indi_pizza);
        databaseReference = FirebaseDatabase.getInstance().getReference();
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
                String Pizza = name.getText().toString();
                databaseReference.setValue(Pizza);
                Intent intent1 = new Intent(pizza.this, orders_placed.class);
                startActivity(intent1);
                Intent intent2 = new Intent(pizza.this, orders.class);
                Bundle bundle1 = new Bundle();
                bundle1.putInt("image", image);
                bundle1.putString("name", string);
                bundle1.putString("price", string1);
                intent.putExtras(bundle);
            }
        });
    }

}
