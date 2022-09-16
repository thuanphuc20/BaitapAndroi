package com.example.btactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {
    private EditText edtEmail;
    private EditText edtUse;
    private Button btnsent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        getSupportActionBar().setTitle("activity_main2");
        edtEmail = findViewById(R.id.edt_email);
        edtUse = findViewById(R.id.edt_user);
        btnsent = findViewById(R.id.btn_sent);
        if (getIntent().getExtras() != null) {
            UserEmai use = (UserEmai) getIntent().getExtras().get("name");
            edtEmail.setText(use.getEmail());
            edtUse.setText(use.getUse());
        }

        btnsent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                backActivity();
            }


        });
    }
    private void backActivity() {
        String strEmail = edtEmail.getText().toString().trim();
        String struser = edtUse.getText().toString().trim();

        UserEmai use = new UserEmai(strEmail,struser);
        Bundle bundle = new Bundle();
        bundle.putSerializable("name", use);
        Intent reInten = new Intent();
        reInten.putExtras(bundle);
        setResult(Activity.RESULT_OK, reInten);
        finish();
    }
}