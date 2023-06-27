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
import com.example.food_ordering_app.Model.nonvegmodel;
import com.example.food_ordering_app.R;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class nonveglistAdapter extends RecyclerView.Adapter<nonveglistAdapter.ViewHolder> {
    ArrayList<nonvegmodel> items;
    Context context;

    public nonveglistAdapter(ArrayList<nonvegmodel> items, Context context) {
        this.items = items;
        this.context = context;
    }

    @NonNull
    @Override
    public nonveglistAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_nonveg, parent, false);
        context = parent.getContext();
        return new ViewHolder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull nonveglistAdapter.ViewHolder holder, int position) {
        nonvegmodel nonvegmodel = items.get(position);
        holder.image.setImageResource(nonvegmodel.getId());
        holder.name.setText(nonvegmodel.getPizza());
        holder.price.setText(nonvegmodel.getPrice());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, pizza.class);
                Bundle bundle = new Bundle();
                bundle.putInt("pizza", nonvegmodel.getId());
                bundle.putString("pizzaname", nonvegmodel.getPizza());
                bundle.putString("pizzaprice", nonvegmodel.getPrice());
                intent.putExtras(bundle);
                context.startActivity(intent, bundle);
            }
        });
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
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
