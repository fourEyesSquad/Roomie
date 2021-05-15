package com.example.roomie;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.regex.Pattern;

public class SignupActivity extends AppCompatActivity {

    public static final String TAG = "SignupActivity";
    //EditText boxes
    private EditText etEmail;
    private EditText etUsername;
    private EditText etPassword;
    private EditText etPasswordConfirm;
    //Buttons
    private Button btnSignup;
    private Button btnLogin;

    public final Pattern EMAIL_ADDRESS_PATTERN = Pattern.compile(
            "[a-zA-Z0-9+._%-+]{1,256}" +
                    "@" +
                    "[a-zA-Z0-9][a-zA-Z0-9-]{0,64}" +
                    "(" +
                    "." +
                    "[a-zA-Z0-9][a-zA-Z0-9-]{0,25}" +
                    ")+"
    );

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        etEmail = findViewById(R.id.etEmail);
        etUsername = findViewById(R.id.etUsername);
        etPassword = findViewById(R.id.etPassword);
        etPasswordConfirm = findViewById(R.id.etPasswordConfirm);

        btnSignup = findViewById(R.id.btnSignup);
        btnLogin = findViewById(R.id.btnLogin);

        btnSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, "onClick signup button");

                if (validate()) {
                    //TODO: Create user profile if validated
                }
            }
            //email and password validation
            private boolean validate() {
                String email = etEmail.getText().toString();
                String username = etUsername.getText().toString();
                String password = etPassword.getText().toString();
                String password_confirm = etPasswordConfirm.getText().toString();

                boolean temp = true;
                if (!EMAIL_ADDRESS_PATTERN.matcher(email).matches()) {
                    Toast.makeText(SignupActivity.this, "Invalid Email Address", Toast.LENGTH_SHORT).show();
                    temp = false;
                } else if (!password.equals(password_confirm)) {
                    Toast.makeText(SignupActivity.this, "Password Not Matching", Toast.LENGTH_SHORT).show();
                    temp = false;
                }
                return temp;
            }

        });

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, "onClick login button");
                //TODO: Go to Login Page
                Intent myIntent = new Intent(v.getContext(), LoginActivity.class);
                startActivity(myIntent);
            }
        });

    }
}