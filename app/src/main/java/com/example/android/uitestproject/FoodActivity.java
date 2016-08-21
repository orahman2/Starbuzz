package com.example.android.uitestproject;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class FoodActivity extends Activity {

    public static final String EXTRA_FOODNO = "foodno";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);
        int id = getIntent().getExtras().getInt(EXTRA_FOODNO);
        Food food = Food.FOODS[id];
        ((TextView)findViewById(R.id.name)).setText(food.getName());
        ((TextView)findViewById(R.id.description)).setText(food.getDescription());
        ((ImageView)findViewById(R.id.photo)).setImageResource(food.getImageResourceID());
    }
}
