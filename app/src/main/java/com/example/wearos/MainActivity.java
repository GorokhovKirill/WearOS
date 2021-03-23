package com.example.wearos;

import android.content.Intent;
import android.os.Bundle;
import android.support.wearable.activity.WearableActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends WearableActivity {

    Button btnLogin;
    EditText edUsername , edPassword;
    TextView noAccount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLogin = findViewById(R.id.SignIn);
        edUsername = findViewById(R.id.email);
        edPassword = findViewById(R.id.pass);
        noAccount = findViewById(R.id.tvCreateAccount);

        noAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, SignUp.class));
            }
        });
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, MainActivity.class));
            }
        });
    }

    public void onClick(View view) {
        EditText log=(EditText) findViewById(R.id.email);
        EditText pas=(EditText) findViewById(R.id.pass);
    }
    public void onClickSignUp(View view) {
        Intent o = new Intent(MainActivity.this, SignUp.class);
        startActivity(o);
        finish();
    }
    public void onClickSignIn(View view) {
        Intent o = new Intent(MainActivity.this, MainActivity.class);
        startActivity(o);
        finish();
    }
}