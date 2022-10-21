package com.example.sheredpreferece;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class danhsach extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_danhsach);
        ListView listView;
        ArrayList<Thucdon> arraylist;
        AdapterThucdon adapter;

        listView = findViewById(R.id.listV_monan);
        arraylist = new ArrayList<>();
        arraylist.add(new Thucdon("ga quay","20$",R.drawable.gaquay));
        arraylist.add(new Thucdon("chao vit","20$",R.drawable.gaquay));

//        adapter = new AdapterThucdon(danhsach.this, R.layout.activity_danhsach, arraylist);
//        listView.setAdapter(adapter);
    }
}