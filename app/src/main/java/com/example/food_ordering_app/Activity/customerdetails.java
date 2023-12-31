package com.example.food_ordering_app.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.food_ordering_app.Model.customerdetailsmodel;
import com.example.food_ordering_app.Model.ordersmodel;
import com.example.food_ordering_app.Model.pizzamodel;
import com.example.food_ordering_app.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class customerdetails extends AppCompatActivity {
    String firstname, lastname, phno, email, deladdress;
    Button Cod,gpay,cancel;
    EditText fname, lname, add, ph, em;
    DatabaseReference databaseReference;
    ArrayList<ordersmodel> orders = new ArrayList<>();

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customerdetails);
        fname = findViewById(R.id.editTextText);
        lname = findViewById(R.id.editTextText2);
        ph = findViewById(R.id.editTextText5);
        add = findViewById(R.id.editTextText3);
        em = findViewById(R.id.editTextText4);
        gpay=findViewById(R.id.button10);
        cancel=findViewById(R.id.button9);

        Cod = findViewById(R.id.button5);
        databaseReference = FirebaseDatabase.getInstance().getReference("Pizza orders");
        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                for (DataSnapshot postSnapshot : dataSnapshot.getChildren()) {
                    ordersmodel ordersmodel = postSnapshot.getValue(ordersmodel.class);
                    orders.add(ordersmodel);
                }
            }
            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        Cod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstname = fname.getText().toString();
                lastname = lname.getText().toString();
                phno = ph.getText().toString();
                email = em.getText().toString();
                deladdress = add.getText().toString();
                if(TextUtils.isEmpty(firstname) && TextUtils.isEmpty(lastname) && TextUtils.isEmpty(phno) && TextUtils.isEmpty(email) && TextUtils.isEmpty(deladdress)){
                    Toast.makeText(customerdetails.this, "Please enter the details", Toast.LENGTH_LONG).show();
                }
                else {
                    Intent intent = new Intent(customerdetails.this, orderloading.class);
                    if (!firstname.isEmpty()) {
                        customerdetailsmodel customerdetailsmodel = new customerdetailsmodel(firstname, lastname, phno, email, deladdress, orders);
                        databaseReference = FirebaseDatabase.getInstance().getReference("User");
                        databaseReference.child(firstname).setValue(customerdetailsmodel).addOnCompleteListener(new OnCompleteListener<Void>() {
                            @Override
                            public void onComplete(@NonNull Task<Void> task) {
                                Toast.makeText(customerdetails.this, "Order Placed", Toast.LENGTH_LONG);
                            }
                        });
                    }
                    startActivity(intent);
                }


            }
        });
        cancel.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                try{
                Intent intent = new Intent(customerdetails.this,MainActivity.class);
                Toast.makeText(customerdetails.this, "Order Cancelled", Toast.LENGTH_LONG).show();
                startActivity(intent);
            }catch (Exception e) {
                }
            }


        });
        gpay.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                firstname = fname.getText().toString();
                lastname = lname.getText().toString();
                phno = ph.getText().toString();
                email = em.getText().toString();
                deladdress = add.getText().toString();
                if (TextUtils.isEmpty(firstname) && TextUtils.isEmpty(lastname) && TextUtils.isEmpty(phno) && TextUtils.isEmpty(email) && TextUtils.isEmpty(deladdress)) {
                    Toast.makeText(customerdetails.this, "Please enter the details", Toast.LENGTH_LONG).show();
                } else {
                    Intent intent1 = new Intent(customerdetails.this,gpay.class);
                    startActivity(intent1);

                }
            }
        });

    }
}
