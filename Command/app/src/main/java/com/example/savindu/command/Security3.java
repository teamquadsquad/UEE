package com.example.savindu.command;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Security3 extends AppCompatActivity {

    Button nextArticle;
    ImageView back, home, account;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_security3);

        nextArticle = findViewById(R.id.security4);
        back = findViewById(R.id.back);
        home = findViewById(R.id.home);
        account = findViewById(R.id.account);

        nextArticle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSecurity4();
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

    public void openSecurity4(){
        Intent intent = new Intent(this, Security.class);
        startActivity(intent);
    }

    public void goBack(){
        Intent intent = new Intent(this, Security.class);
        startActivity(intent);
    }

    public void goHome(){
        Intent intent = new Intent(this, dashboard.class);
        startActivity(intent);
    }

    public void openAccount(){
        Intent intent = new Intent(this, AccountActivity.class);
        startActivity(intent);
    }
}
