package com.example.thucdon;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView;
        ArrayList<Monan> arraylist;
        AdapterMonan adapter;

        listView = findViewById(R.id.listV_monan);
        arraylist = new ArrayList<>();
        arraylist.add(new Monan("ga quay","20$",R.drawable.gaquay));
        arraylist.add(new Monan("chao vit","20$",R.drawable.gaquay));

        adapter = new AdapterMonan(MainActivity.this, R.layout.layout_monan, arraylist);
        listView.setAdapter(adapter);
    }






}