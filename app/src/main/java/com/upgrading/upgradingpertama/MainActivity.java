package com.upgrading.upgradingpertama;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText txt_username, txt_password;
    Button btn_login;
    String username, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt_username = findViewById(R.id.txt_username_main);
        txt_password = findViewById(R.id.txt_password_main);
        btn_login = findViewById(R.id.btn_login_main);

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                username = txt_username.getText().toString();
                password = txt_password.getText().toString();

                if (username.equals("admin") && password.equals("qwerty")) {
                    Toast.makeText(MainActivity.this, "Hai, Admin!", Toast.LENGTH_SHORT).show();
                } else if (username.equals("user") && password.equals("password")) {
                    Toast.makeText(MainActivity.this, "Hai, User!", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Login gagal", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}