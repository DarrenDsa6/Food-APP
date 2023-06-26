package com.example.food_ordering_app.Activity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.example.food_ordering_app.Model.ordersmodel;
import com.example.food_ordering_app.Model.pizzamodel;
import com.example.food_ordering_app.R;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class orders extends AppCompatActivity {
    DatabaseReference databaseReference;
    TextView recievemessage;
    RecyclerView recyclerView;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.orders);
        recyclerView = findViewById(R.id.reyclerview4);
        ArrayList<ordersmodel> ordersmodels = new ArrayList<>();
        recievemessage = (TextView)findViewById(R.id.textView26);
        databaseReference = FirebaseDatabase.getInstance().getReference();
        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                if(snapshot.exists()){
                    String pizza = snapshot.getValue().toString();
                    recievemessage.setText(pizza);
                    if(pizza.equals("Margarita")){
                        ordersmodels.add(new ordersmodel(R.drawable.margarita, "Margarita"));
                    }
                    else if(pizza.equals("Peppy Paneer")){
                        ordersmodels.add(new ordersmodel(R.drawable.peppypaneer, "Peppy Paneer"));}
                    else if(pizza.equals("Farmhouse")){
                        ordersmodels.add(new ordersmodel(R.drawable.farmhouse, "Farmhouse"));}
                    else if(pizza.equals("Mexican Green Wave")){
                        ordersmodels.add(new ordersmodel(R.drawable.mexican_green_wave, "Mexican Green Wave"));}
                    else if(pizza.equals("Pepper Barbeque onion")){
                        ordersmodels.add(new ordersmodel(R.drawable.pepperbarbequeonion, "Pepper Barbeque onion"));}
                    else if(pizza.equals("Chicken Fiesta")){
                        ordersmodels.add(new ordersmodel(R.drawable.chickenfiest, "Chicken Fiesta"));}
                    else if(pizza.equals("Pepperoni chicken")){
                        ordersmodels.add(new ordersmodel(R.drawable.chickenpepper, "Pepperoni chicken"));}
                    else {
                        ordersmodels.add(new ordersmodel(R.drawable.nonvegsupreme, "Non Veg Supreme"));}
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }
}
