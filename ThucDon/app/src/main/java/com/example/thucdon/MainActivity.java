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
    }
    ListView listView;
    ArrayList<Monan> arraylist;
    AdapterMonan adapter;

   arraylist = new ArrayList<>();
   arraylist.add(new Monan ("Ga quay",))


}