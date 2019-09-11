package com.example.cmdcommandapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Security2 extends AppCompatActivity {

    Button nextArticle, back, home, account;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_security2);

        nextArticle = findViewById(R.id.security3);
        back = findViewById(R.id.back);
        home = findViewById(R.id.home);
        account = findViewById(R.id.menu);

        nextArticle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSecurity3();
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

    public void openSecurity3() {
        Intent intent = new Intent(this, Security.class);
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
