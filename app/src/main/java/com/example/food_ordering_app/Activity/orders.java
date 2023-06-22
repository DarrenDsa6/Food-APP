package com.example.food_ordering_app.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.food_ordering_app.R;

public class orders extends AppCompatActivity {
    TextView recievemessage;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.orders);
        recievemessage = (TextView)findViewById(R.id.textView18);

    }
}
