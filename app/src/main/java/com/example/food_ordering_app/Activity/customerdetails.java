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
import com.example.food_ordering_app.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class customerdetails extends AppCompatActivity {
    String firstname, lastname, phno, email, deladdress;
    Button place;
    EditText fname, lname, add, ph, em;
    DatabaseReference databaseReference;

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customerdetails);
        fname = findViewById(R.id.editTextText);
        lname = findViewById(R.id.editTextText2);
        ph = findViewById(R.id.editTextText5);
        add = findViewById(R.id.editTextText3);
        em = findViewById(R.id.editTextText4);

        place = findViewById(R.id.button5);
        place.setOnClickListener(new View.OnClickListener() {
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
                        customerdetailsmodel customerdetailsmodel = new customerdetailsmodel(firstname, lastname, phno, email, deladdress);
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
    }
}
