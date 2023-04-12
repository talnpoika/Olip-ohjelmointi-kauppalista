package com.example.kauppalista;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class GroceryListAdapter extends RecyclerView.Adapter<GroceryViewHolder> {

    private Context context;
    private ArrayList<Grocery> groceries = new ArrayList<>();

    private int switchList = 0;

    public GroceryListAdapter(Context context, ArrayList<Grocery> groceries) {
        this.context = context;
        this.groceries = groceries;
    }

    @NonNull
    @Override
    public GroceryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new GroceryViewHolder(LayoutInflater.from(context).inflate(R.layout.grocery_view, parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull GroceryViewHolder holder, int position) {

        holder.txtGroceryName.setText(groceries.get(position).getName());
        holder.editText.setText(groceries.get(position).getName());
        holder.removeImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int pos = holder.getAdapterPosition();
                GroceryList.getInstance().removeGroceryFromList(pos);
                notifyItemRemoved(pos);
            }
        });

        holder.editImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int pos = holder.getAdapterPosition();
                if(holder.editText.getVisibility() == View.VISIBLE) {
                    Grocery grocery = GroceryList.getInstance().groceries.get(pos);
                    grocery.setName(holder.editText.getText().toString());
                    holder.editText.setVisibility(View.GONE);
                    notifyDataSetChanged();
                } else {
                    holder.editText.setVisibility(View.VISIBLE);
                }
            }
        });


    }

    public void switchList(ArrayList<Grocery> newSort) {
        groceries = new ArrayList<>();
        groceries = newSort;
    }

    @Override
    public int getItemCount() {
        return groceries.size();
    }
}
