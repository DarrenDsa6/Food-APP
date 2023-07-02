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

import com.example.food_ordering_app.Activity.drinks;
import com.example.food_ordering_app.Activity.pizza;
import com.example.food_ordering_app.Model.drinkmodel;
import com.example.food_ordering_app.Model.vegmodel;
import com.example.food_ordering_app.R;

import java.util.ArrayList;

public class drinkListAdapter extends RecyclerView.Adapter<drinkListAdapter.ViewHolder>{
    ArrayList<drinkmodel> items;
    Context context;

    public drinkListAdapter(ArrayList<drinkmodel> items, Context context) {
        this.items = items;
        this.context = context;
    }

    @NonNull
    @Override
    public drinkListAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_drinks, parent, false);
        context = parent.getContext();
        return new ViewHolder(inflate);
    }
    @Override
    public void onBindViewHolder(@NonNull drinkListAdapter.ViewHolder holder, int position) {
        drinkmodel drinkmodel = items.get(position);
        holder.image.setImageResource(drinkmodel.getId());
        holder.name.setText(drinkmodel.getDrink());
        holder.price.setText(drinkmodel.getPrice());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, pizza.class);
                Bundle bundle = new Bundle();
                bundle.putInt("pizza", drinkmodel.getId());
                bundle.putString("pizzaname", drinkmodel.getDrink());
                bundle.putString("pizzaprice", drinkmodel.getPrice());
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
