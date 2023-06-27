package com.example.food_ordering_app.Activity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.food_ordering_app.Adapter.orderlistAdapter;
import com.example.food_ordering_app.Model.ordersmodel;
import com.example.food_ordering_app.R;
import com.example.food_ordering_app.databinding.ActivityOrdersBinding;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class orders extends AppCompatActivity {
    DatabaseReference databaseReference;
    FirebaseDatabase db;
    orderlistAdapter orderlistAdapter;
    ArrayList<ordersmodel> list;
    ActivityOrdersBinding binding;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        binding = ActivityOrdersBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        databaseReference = FirebaseDatabase.getInstance().getReference("Pizza Orders");
        binding.reyclerview4.setHasFixedSize(true);
        binding.reyclerview4.setLayoutManager(new LinearLayoutManager(this));

        list = new ArrayList<>();
        orderlistAdapter = new orderlistAdapter(list, this);
        binding.reyclerview4.setAdapter(orderlistAdapter);
        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                for(DataSnapshot dataSnapshot: snapshot.getChildren()){
                    ordersmodel ordersmodel = dataSnapshot.getValue(ordersmodel.class);
                    list.add(ordersmodel);
                }
                orderlistAdapter.notifyDataSetChanged();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });


    }
}
