package com.example.food_ordering_app.Activity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.example.food_ordering_app.R;

public class gpay extends AppCompatActivity {
    Button btnPay;
    String p,n,u;
    Spinner spin;
    EditText name,phno,upi;
    String[] code={"@oksbi","@okhdfc","@okicici","@okaxis"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gpay_act);
        btnPay=findViewById(R.id.btnPay);
        spin=findViewById(R.id.spinner);
        name=findViewById(R.id.editTextText6);
        phno=findViewById(R.id.editTextText9);
        upi=findViewById(R.id.etUPI);
        ArrayAdapter<String> adapter= new ArrayAdapter<String>(gpay.this, android.R.layout.simple_spinner_item,code);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin.setAdapter(adapter);
        spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long l) {
                String value = parent.getItemAtPosition(position).toString();
                ((TextView)parent.getChildAt(0)).setTextColor(Color.WHITE);
                Toast.makeText(gpay.this, value, Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                // Do nothing if nothing is selected.
            }
        });


        btnPay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                p=phno.getText().toString();
                n=name.getText().toString();
                u=upi.getText().toString();
                if(TextUtils.isEmpty(n) && TextUtils.isEmpty(p) && TextUtils.isEmpty(u)){
                    Toast.makeText(gpay.this, "Please enter all the details", Toast.LENGTH_LONG).show();
                }
                else {

                    Intent intent = new Intent(gpay.this, orderloading.class);
                    startActivity(intent);
                }
            }
        });

    }
}

