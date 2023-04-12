package com.example.kauppalista;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class GroceryList {

    private static GroceryList singleton = null;

    ArrayList<Grocery> groceries = new ArrayList<>();

    private GroceryList() {
    }

    public static GroceryList getInstance() {
        if(singleton == null) {
            singleton = new GroceryList();
        }
        return singleton;
    }

    public void addGrocery(Grocery grocery) {
        groceries.add(grocery);
    }

    public void removeGroceryFromList(int position) {
        groceries.remove(position);
    }

    public void editGroceryFromList(int position, String name) {
        groceries.get(position).setName(name);
    }

    public ArrayList<Grocery> getGroceries() {
        return groceries;
    }


    public void setGroceries(ArrayList<Grocery> groceries) {
        this.groceries = groceries;
    }
}
