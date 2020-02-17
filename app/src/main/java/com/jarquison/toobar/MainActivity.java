package com.jarquison.toobar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Toolbar  toolbar;
    ListView listView;
    ArrayAdapter arrayAdapter;
    public String[] mApps = {
            "Instagram",
            "Pinterest",
            "Pocket",
            "Twitter",
            "Instagram",
            "Pinterest",
            "Pocket",
            "Twitter",
            "Instagram",
            "Pinterest",
            "Pocket",
            "Twitter",
            "Instagram",
            "Pinterest",
            "Pocket",
            "Twitter"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.my_toolbar);
        setSupportActionBar(toolbar);
        arrayAdapter =  new ArrayAdapter(this, android.R.layout.simple_list_item_1, mApps );


        listView = findViewById(R.id.rv_listas);
        listView.setAdapter(arrayAdapter);




    }


}

