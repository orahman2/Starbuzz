package com.example.android.uitestproject;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DrinkActivity extends Activity {

    public static final String EXTRA_DRINKNO = "drinkNo";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink);
        int drinkNo = (Integer)getIntent().getExtras().get(EXTRA_DRINKNO);
        Drink drink = Drink.DRINKS[drinkNo];
        ((TextView) findViewById(R.id.name)).setText(drink.getName());
        ((TextView) findViewById(R.id.description)).setText(drink.getDescription());
        ((ImageView) findViewById(R.id.photo)).setImageResource(drink.getImageResourceId());
    }
}
