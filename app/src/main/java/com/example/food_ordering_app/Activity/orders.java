package com.example.food_ordering_app.Activity;

import static android.widget.Toast.LENGTH_LONG;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

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
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class orders extends AppCompatActivity {
    DatabaseReference databaseReference;
    RecyclerView recyclerView;
    FirebaseDatabase db;
    orderlistAdapter orderlistAdapter;
    ArrayList<ordersmodel> list;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orders);
        db = FirebaseDatabase.getInstance();
        list = new ArrayList<>();
        databaseReference = db.getReference("Pizza orders");
        recyclerView = findViewById(R.id.orderview);
        recyclerView.setHasFixedSize(true);
        databaseReference.keepSynced(true);
        orderlistAdapter = new orderlistAdapter(list, this);
        recyclerView.setAdapter(orderlistAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                for (DataSnapshot postSnapshot: dataSnapshot.getChildren()) {
                    ordersmodel ordersmodel = postSnapshot.getValue(ordersmodel.class);
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
