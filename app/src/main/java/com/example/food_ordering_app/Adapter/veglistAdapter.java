package com.example.food_ordering_app.Adapter;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.food_ordering_app.Activity.pizza;
import com.example.food_ordering_app.Activity.vegpizza;
import com.example.food_ordering_app.Model.vegmodel;
import com.example.food_ordering_app.R;

import java.util.ArrayList;

public class veglistAdapter extends RecyclerView.Adapter<veglistAdapter.ViewHolder> {
    ArrayList<vegmodel> items;
    Context context;

    public veglistAdapter(ArrayList<vegmodel> items, Context context) {
        this.items = items;
        this.context = context;
    }

    @NonNull
    @Override
    public veglistAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.margarita, parent, false);
        context = parent.getContext();
        return new ViewHolder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull veglistAdapter.ViewHolder holder, int position) {
        vegmodel vegmodel = items.get(position);
        holder.image.setImageResource(vegmodel.getId());
        holder.name.setText(vegmodel.getPizza());
        holder.price.setText(vegmodel.getPrice());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, pizza.class);
                Bundle bundle = new Bundle();
                bundle.putInt("pizza", vegmodel.getId());
                bundle.putString("pizzaname", vegmodel.getPizza());
                bundle.putString("pizzaprice", vegmodel.getPrice());
                intent.putExtras(bundle);
                context.startActivity(intent, bundle);
            }
        });

    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
    ImageView image;
    TextView name;
    TextView price;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.imageView);
            name = itemView.findViewById(R.id.textView13);
            price = itemView.findViewById(R.id.textView14);
        }
    }
}
