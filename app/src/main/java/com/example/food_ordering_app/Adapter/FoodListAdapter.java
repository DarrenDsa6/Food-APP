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
import com.example.food_ordering_app.Model.pizzamodel;
import com.example.food_ordering_app.R;

import java.util.ArrayList;
import java.util.List;

public class FoodListAdapter extends RecyclerView.Adapter<FoodListAdapter.ViewHolder> {
    private ArrayList<pizzamodel> items;
    private Context context;

    public FoodListAdapter(Context context, ArrayList<pizzamodel> items) {
        this.items = items;
        this.context = context;
    }
    public void setFilteredList(ArrayList<pizzamodel> filteredList, Context context){
        this.items = (ArrayList<pizzamodel>) filteredList;
        notifyDataSetChanged();
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.margarita,parent,false);
        context = parent.getContext();
        return new ViewHolder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        pizzamodel pizzamodel = items.get(position);
        holder.pizza.setImageResource(pizzamodel.getId());
        holder.pizzaname.setText(pizzamodel.getPizza());
        holder.price.setText(pizzamodel.getPrice());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(context, pizza.class);
                Bundle bundle = new Bundle();
                bundle.putInt("pizza", pizzamodel.getId());
                bundle.putString("pizzaname", pizzamodel.getPizza());
                bundle.putString("pizzaprice", pizzamodel.getPrice());
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
        ImageView pizza;
        TextView pizzaname;
        TextView price;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            pizza = itemView.findViewById(R.id.imageView);
            pizzaname = itemView.findViewById(R.id.textView13);
            price = itemView.findViewById(R.id.textView14);
        }
    }
}
