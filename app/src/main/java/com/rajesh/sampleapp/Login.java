package com.rajesh.sampleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        EditText et_username,et_password;

        et_username=findViewById(R.id.username);
        et_password=findViewById(R.id.password);

        Button bt_login=findViewById(R.id.login);

        bt_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = et_username.getText().toString();
                String password = et_password.getText().toString();

                if (username.length() == 0 || password.length() == 0) {
                    Toast.makeText(getApplicationContext(), "Fields Missing", Toast.LENGTH_SHORT).show();
                } else if (username.equals("123") && password.equals("123")) {

                    SharedPreferences_UserDate.setUserDetails(getApplicationContext(),1);

                    Intent intent=new Intent(getApplicationContext(),Home.class);
                    startActivity(intent);

                    Toast.makeText(getApplicationContext(), "Login Sucessfull", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(getApplicationContext(),"Wrong Credentials",Toast.LENGTH_SHORT).show();
                }

            }

        });



    }
}