package com.example.kauppalista;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class GroceryViewHolder extends RecyclerView.ViewHolder {

    TextView txtGroceryName;
    EditText editText;
    ImageView removeImage, editImage;


    public GroceryViewHolder(@NonNull View itemView) {
        super(itemView);
        txtGroceryName = itemView.findViewById(R.id.twGroceryName);
        removeImage = itemView.findViewById(R.id.imgDelete);
        editImage = itemView.findViewById(R.id.imgEdit);
        editText = itemView.findViewById(R.id.etEditName);
    }
}
