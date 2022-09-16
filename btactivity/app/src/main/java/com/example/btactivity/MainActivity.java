package com.example.btactivity;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private static final int MY_REQUEST_CODE = 10;
    private EditText edtEmail;
    private EditText edtUse;
    private Button btnsent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtEmail = findViewById(R.id.edt_email);
        edtUse = findViewById(R.id.edt_user);
        btnsent = findViewById(R.id.btn_sent);

        btnsent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nextActivity();
            }

        });

    }
        private void nextActivity() {
            String strEmail = edtEmail.getText().toString().trim();
            String strUse = edtUse.getText().toString().trim();

            UserEmai use = new UserEmai(strEmail,strUse);
            Intent intent = new Intent(MainActivity.this, MainActivity2.class);
            Bundle bundle = new Bundle();
            bundle.putSerializable("name", use);

            intent.putExtras(bundle);

            startActivityForResult(intent, MY_REQUEST_CODE);


        }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(MY_REQUEST_CODE ==requestCode && requestCode == Activity.RESULT_OK){
            UserEmai use = (UserEmai) data.getExtras().get("name");
            edtEmail.setText(use.getEmail());
            edtUse.setText(use.getUse());

        }
    }
}