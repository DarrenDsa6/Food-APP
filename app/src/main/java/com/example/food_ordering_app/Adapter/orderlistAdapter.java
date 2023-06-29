package com.example.food_ordering_app.Adapter;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.DragEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.food_ordering_app.Activity.orders;
import com.example.food_ordering_app.Model.ordersmodel;
import com.example.food_ordering_app.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.logging.Handler;

public class orderlistAdapter extends RecyclerView.Adapter<orderlistAdapter.ViewHolder> {
    ArrayList<ordersmodel> items;
    DatabaseReference reference;
    Context context;

    public orderlistAdapter(ArrayList<ordersmodel> items, Context context) {
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
        ordersmodel ordersmodel = items.get(position);

        holder.pizzaname.setText(ordersmodel.getPizzaname());
        holder.pizzaprice.setText(ordersmodel.getPizzaprice());
        holder.itemView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                reference = FirebaseDatabase.getInstance().getReference("Pizza orders");
                reference.child(ordersmodel.getPizzaname()).removeValue().addOnCompleteListener(new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        if(task.isSuccessful()){
                            Toast.makeText(context, "Pizza deleted from cart", Toast.LENGTH_LONG).show();
                        }
                        else Toast.makeText(context, "Task failed", Toast.LENGTH_LONG).show();
                    }
                });
                ((Activity) context).recreate();
                return false;
            }
        });
    }



    @Override
    public int getItemCount() {
        return items.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView  pizzaprice;
        TextView pizzaname;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            pizzaprice = itemView.findViewById(R.id.textView20);
            pizzaname = itemView.findViewById(R.id.textView19);

        }
    }
}
