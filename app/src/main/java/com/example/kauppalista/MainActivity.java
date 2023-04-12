package com.example.kauppalista;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private GroceryList groceryList;
    private RecyclerView rv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        groceryList = GroceryList.getInstance();
        rv = findViewById(R.id.rvGroceries);

        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setAdapter(new GroceryListAdapter(getApplicationContext(), groceryList.getGroceries()));

    }

    public void switchToAddGrocery(View view) {
        Intent intent = new Intent(this, AddGroceriesActivity.class);
        startActivity(intent);
    }








}
