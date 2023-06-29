package com.example.food_ordering_app.Activity;

import static android.widget.Toast.LENGTH_LONG;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
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
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.storage.StorageReference;

import java.util.ArrayList;

public class orders extends AppCompatActivity {
    DatabaseReference databaseReference;
    RecyclerView recyclerView;
    FirebaseDatabase db;
    orderlistAdapter orderlistAdapter;
    ArrayList<ordersmodel> list;
    TextView Total;
    Button Order;
    String n;
    int size;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orders);
        db = FirebaseDatabase.getInstance();
        list = new ArrayList<>();
        Total = findViewById(R.id.textView22);
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
                for (DataSnapshot postSnapshot : dataSnapshot.getChildren()) {
                    ordersmodel ordersmodel = postSnapshot.getValue(ordersmodel.class);
                    list.add(ordersmodel);
                    size = list.size();
                    n = Integer.toString(size * 125);
                    Total.setText("Order Total : " + n);
                }
                orderlistAdapter.notifyDataSetChanged();

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        Order = findViewById(R.id.button2);
        Order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(orders.this, customerdetails.class);
                startActivity(intent);
            }
        });
    }
}
