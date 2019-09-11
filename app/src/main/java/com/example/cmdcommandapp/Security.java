package com.example.cmdcommandapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Security extends AppCompatActivity {

    Button security1, security2, security3, security4, security5, security6, back, home, account;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_security);

        security1 = findViewById(R.id.security1);
        security2 = findViewById(R.id.security2);
        security3 = findViewById(R.id.security3);
        security4 = findViewById(R.id.security4);
        security5 = findViewById(R.id.security5);
        security6 = findViewById(R.id.security6);
        back = findViewById(R.id.back);
        home = findViewById(R.id.home);
        account = findViewById(R.id.menu);

        security1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSecurity1();
            }
        });

        security2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSecurity2();
            }
        });

        security3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSecurity3();
            }
        });

        security4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSecurity4();
            }
        });

        security5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSecurity5();
            }
        });

        security6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSecurity6();
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goBack();
            }
        });

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goHome();
            }
        });

        account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAccount();
            }
        });
    }

    public void openSecurity1(){
        Intent intent = new Intent(this, Security1.class);
        startActivity(intent);
    }

    public void openSecurity2(){
        Intent intent = new Intent(this, Security2.class);
        startActivity(intent);
    }

    public void openSecurity3(){
        Intent intent = new Intent(this, Security3.class);
        startActivity(intent);
    }

    public void openSecurity4(){
        Intent intent = new Intent(this, Security4.class);
        startActivity(intent);
    }

    public void openSecurity5(){
        Intent intent = new Intent(this, Security5.class);
        startActivity(intent);
    }

    public void openSecurity6(){
        Intent intent = new Intent(this, Security6.class);
        startActivity(intent);
    }

    public void goBack(){
        Intent intent = new Intent(this, Security.class);
        startActivity(intent);
    }

    public void goHome(){
        Intent intent = new Intent(this, Dashboard.class);
        startActivity(intent);
    }

    public void openAccount(){
        Intent intent = new Intent(this, Account.class);
        startActivity(intent);
    }
}
