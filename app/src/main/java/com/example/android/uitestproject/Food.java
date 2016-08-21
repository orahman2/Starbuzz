package com.example.android.uitestproject;

/**
 * Created by Omar on 8/21/2016.
 */
public class Food {

    private String name;
    private String description;
    private int imageResourceID;

    public static final Food[] FOODS = {
            new Food("Burger","Freshly ground Wagyu beef patty complete with salad, sauces, and a brioche bun",R.drawable.burger),
            new Food("Sandwich","Classic BLT served toasted with/without cheese",R.drawable.sub),
            new Food("Pizza","Authentic Italian pizza topped with fresh rocket and mozzarella",R.drawable.pizza),
            new Food("Pasta","Fettuccine pasta smothered in cheese drizzled with truffle oil",R.drawable.fettuccine)
    };

    public Food(String name, String description, int imageResourceID) {
        this.name = name;
        this.description = description;
        this.imageResourceID = imageResourceID;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getImageResourceID() {
        return imageResourceID;
    }

    public String toString() {
        return this.name;
    }
}