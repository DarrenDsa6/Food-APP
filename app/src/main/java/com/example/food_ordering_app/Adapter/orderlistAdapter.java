package com.example.food_ordering_app.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.food_ordering_app.Model.ordermodel;
import com.example.food_ordering_app.R;

import java.util.ArrayList;

public class orderlistAdapter extends RecyclerView.Adapter<orderlistAdapter.ViewHolder> {
    ArrayList<ordermodel> items;
    Context context;

    public orderlistAdapter(ArrayList<ordermodel> items, Context context) {
        this.items = items;
        this.context = context;
    }

    @NonNull
    @Override
    public orderlistAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.orderspec, parent, false);
        context = parent.getContext();
        return new ViewHolder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull orderlistAdapter.ViewHolder holder, int position) {
        ordermodel ordermodel = items.get(position);
        holder.image.setImageResource(ordermodel.getImage());
        holder.pizzaname.setText(ordermodel.getName());
        holder.pizzaprice.setText(ordermodel.getPrice());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView image;
        TextView pizzaname, pizzaprice;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.imageView);
            pizzaname = itemView.findViewById(R.id.textView13);
            pizzaprice = itemView.findViewById(R.id.textView21);
        }
    }
}
