package com.example.loginpage;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText userEditText;
    private EditText passwordEditText;
    private Button loginButton;
    private Button clearButton;

    private static final String VALID_USERNAME = "admin";
    private static final String VALID_PASSWORD = "password";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize UI components
        userEditText = findViewById(R.id.txt1);
        passwordEditText = findViewById(R.id.txt2);
        loginButton = findViewById(R.id.button_login);  // Ensure this ID matches your XML
        clearButton = findViewById(R.id.button_reset);  // Ensure this ID matches your XML

        // Set OnClickListener for Login button
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = userEditText.getText().toString().trim();
                String password = passwordEditText.getText().toString().trim();

                if (username.isEmpty() || password.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Please enter both username and password", Toast.LENGTH_SHORT).show();
                } else if (username.equals(VALID_USERNAME) && password.equals(VALID_PASSWORD)) {
                    // Login successful, move to the second page
                    Toast.makeText(MainActivity.this, "Login successful", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                    startActivity(intent);
                } else {
                    // Login failed, show a toast message
                    Toast.makeText(MainActivity.this, "Invalid username or password", Toast.LENGTH_SHORT).show();
                }
            }
        });

        // Set OnClickListener for Clear button
        clearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                userEditText.setText("");
                passwordEditText.setText("");
            }
        });
    }
}
