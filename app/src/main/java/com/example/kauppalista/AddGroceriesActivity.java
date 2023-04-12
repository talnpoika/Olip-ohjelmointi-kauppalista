package com.example.kauppalista;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class AddGroceriesActivity extends AppCompatActivity {

    private EditText textInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_groceries);

        textInput = findViewById(R.id.txtGroceryName);

    }

    public void AddGroceryToList(View view) {

        Grocery grocery = new Grocery(textInput.getText().toString());
        GroceryList.getInstance().addGrocery(grocery);
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}