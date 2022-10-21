package com.example.sheredpreferece;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button dangnhap;
    TextView dangky;
    EditText tendangnhap, matkhau;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dangnhap = (Button) findViewById(R.id.dangnhap);
        dangky =(Button) findViewById(R.id.dangky);
        tendangnhap =(EditText) findViewById(R.id.tendangnhap);
        matkhau = (EditText) findViewById(R.id.matkhau);
        dangnhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Trangchu.class);
                if (tendangnhap.getText().toString().equals("") || matkhau.getText().toString().equals("")) {
                    Toast.makeText(MainActivity.this, "Không được để trống!!", Toast.LENGTH_SHORT).show();
                } else if (tendangnhap.getText().toString().equals("phuc") && matkhau.getText().toString().equals("123")) {
                    Toast.makeText(MainActivity.this, "Đăng nhập thành công!!", Toast.LENGTH_SHORT).show();
                    startActivity(i);
                } else {
                    Toast.makeText(MainActivity.this, "Thông tin đăng nhập sai!!", Toast.LENGTH_SHORT).show();
                }


            }
        });
        dangky.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MainActivity.this,Activity_dangki.class);

                startActivity(in);
            }
        });



    }
}