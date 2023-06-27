package com.example.food_ordering_app.Activity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.food_ordering_app.Model.pizzaordermodel;
import com.example.food_ordering_app.R;
import com.example.food_ordering_app.databinding.ActivityMainBinding;
import com.example.food_ordering_app.databinding.ActivityPizzaBinding;
import com.example.food_ordering_app.databinding.ActiviyIndiPizzaBinding;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class pizza extends AppCompatActivity {
    FirebaseDatabase db;
    ActiviyIndiPizzaBinding binding;
    DatabaseReference databaseReference;
    String pizza, price;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        binding = ActiviyIndiPizzaBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        String string = bundle.getString("pizzaname");
        String string1 = bundle.getString("pizzaprice");
        int image = bundle.getInt("pizza");
        binding.textView12.setText(string);
        binding.textView16.setText(string1);
        binding.imageView12.setImageResource(image);
        binding.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pizza = binding.textView12.getText().toString();
                price = binding.textView16.getText().toString();
                if(!pizza.isEmpty()){
                    pizzaordermodel pizzaordermodel = new pizzaordermodel(pizza, price);
                    db = FirebaseDatabase.getInstance();
                    databaseReference = db.getReference("Pizza orders");
                    databaseReference.child(pizza).setValue(pizzaordermodel).addOnCompleteListener(new OnCompleteListener<Void>() {
                        @Override
                        public void onComplete(@NonNull Task<Void> task) {
                            Toast.makeText(pizza.this, "Order Placed", Toast.LENGTH_LONG).show();
                        }
                    });
                }
            }
        });

    }

}
