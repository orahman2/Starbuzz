package com.example.android.uitestproject;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener(){
            public void onItemClick(AdapterView<?> listView,
                                    View itemView,
                                    int position,
                                    long id) {
                switch (position){
                    case 0:{
                        Intent intent = new Intent(MainActivity.this, DrinkCategoryActivity.class);
                        startActivity(intent);
                    }
                    break;
                    case 1:{
                        Intent intent = new Intent(MainActivity.this, FoodCategoryActivity.class);
                        startActivity(intent);
                    }
                    break;
                }
            }
        };
        ListView listView = (ListView) findViewById(R.id.list_options);
        listView.setOnItemClickListener(itemClickListener);
    }
}