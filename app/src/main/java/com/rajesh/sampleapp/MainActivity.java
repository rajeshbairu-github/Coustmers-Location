package com.rajesh.sampleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int loginStatus=SharedPreferences_UserDate.getUserLoginStatus(getApplicationContext());

        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                /* Create an Intent that will start the Menu-Activity. */

                if(loginStatus==1)
                {
                    Intent intent=new Intent(getApplicationContext(),Home.class);
                    startActivity(intent);
                }else
                {
                    Intent intent=new Intent(getApplicationContext(),Login.class);
                    startActivity(intent);
                }
            }
        }, 3000);





    }
}