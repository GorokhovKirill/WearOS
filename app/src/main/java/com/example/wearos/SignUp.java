package com.example.wearos;

import android.content.Intent;
import android.os.Bundle;
import android.support.wearable.activity.WearableActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class SignUp extends WearableActivity {
    Button btnSignUp;
    EditText edUserName,edPassword, edName, edFirstName;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup_two);
        btnSignUp = findViewById(R.id.btnSignUp);
        edUserName = findViewById(R.id.edUserName);
        edPassword = findViewById(R.id.edPassword);
        edName = findViewById(R.id.edName);
        edFirstName = findViewById(R.id.edFirstName);
    }
    public void onClickSignUp(View view) {
        Intent o = new Intent(SignUp.this, MainActivity.class);
        startActivity(o);
        finish();
    }
}
