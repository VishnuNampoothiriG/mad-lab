package com.example.myapplication_vishnu;
import static android.widget.Toast.LENGTH_SHORT;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private static final String valid_username="user";
    private static final String valid_password="password";
private EditText usernameEditText;
private EditText passwordEditText;
private Button loginButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        usernameEditText=findViewById(R.id.usernameEditText);
        passwordEditText=findViewById(R.id.passwordEditText);
        loginButton=findViewById(R.id.loginButton);
        loginButton.setOnClickListener(view -> {
            String enteredusername=usernameEditText.getText().toString();
            String enteredpassword=passwordEditText.getText().toString();
            if(isValidCredentials(enteredusername,enteredpassword))
            {
                ShowToast("login success");
            }
            else
            {
                ShowToast("invalid credentials");
            }

        });
    }

    private boolean isValidCredentials(String enteredusername, String enteredpassword)
    {
        return valid_username.equals(enteredusername)&&valid_password.equals(enteredpassword);
    }
    private void ShowToast(String Message)
    {
        Toast.makeText(this,Message, LENGTH_SHORT).show();
    }
}