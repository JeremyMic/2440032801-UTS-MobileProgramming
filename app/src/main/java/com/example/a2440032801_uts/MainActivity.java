package com.example.a2440032801_uts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button loginBtn;
    EditText usernameInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usernameInput = findViewById(R.id.usernameEditText);
        loginBtn = findViewById(R.id.loginBtn);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent moveToSecondPage = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(moveToSecondPage);

                Toast.makeText(MainActivity.this, "Login Success! Welcome " + usernameInput.getText(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}

