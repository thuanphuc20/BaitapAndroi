package com.example.sheredpreferece;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;


public class Trangchu extends AppCompatActivity {


    BottomNavigationView bottomNavigationView;
    ProfileFragment profileFragment = new ProfileFragment();
    ListFragment listFragment = new ListFragment();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trangchu);

        bottomNavigationView = findViewById(R.id.main_btnav);


        getSupportFragmentManager().beginTransaction().replace(R.id.main_con, listFragment).commit();

        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.profile:
                        getSupportFragmentManager().beginTransaction().replace(R.id.main_con, profileFragment).commit();
                        return true;
                    case R.id.list:
                        getSupportFragmentManager().beginTransaction().replace(R.id.main_con, listFragment).commit();
                        return true;
                }
                return false;
            }
        });



    }
}