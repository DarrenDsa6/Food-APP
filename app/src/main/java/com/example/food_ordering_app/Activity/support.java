package com.example.food_ordering_app.Activity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.food_ordering_app.R;

public class support extends AppCompatActivity implements View.OnClickListener {
    Button bcall,bmail;

    @SuppressLint("MissingInflatedId")
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.support);
        bcall=(Button)findViewById(R.id.button6);
        bcall.setOnClickListener(this);
        bmail=(Button)findViewById(R.id.button7);
        bmail.setOnClickListener(this);


    }
    public void onClick(View v){
        if(v.equals(bcall)){
            Intent intent = new Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse("tel:1111-2222-333"));
            startActivity(intent);
        }
        if(v.equals(bmail)){
            Intent emailIntent = new Intent(Intent.ACTION_SEND);
            String[] recipients={"Pizzeria_Support@gmail.com"};
            emailIntent.putExtra(Intent.EXTRA_EMAIL, recipients);
            emailIntent.putExtra(Intent.EXTRA_CC, "Pizzeria_support@gmail.com");
            emailIntent.putExtra(Intent.EXTRA_SUBJECT,"Subject text here...");
            emailIntent.putExtra(Intent.EXTRA_TEXT,"Body of the content here...");
            emailIntent.setType("text/html");
            emailIntent.setPackage("com.google.android.gm");
            startActivity(Intent.createChooser(emailIntent, "Send mail"));
        }

    }
}