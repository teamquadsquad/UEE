package com.example.savindu.command;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class activity_network3 extends AppCompatActivity {

    ImageView home, account, back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_network3);

        home = findViewById(R.id.home);
        account = findViewById(R.id.account);
        back = findViewById(R.id.back);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDashboard();
            }
        });

        account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAccount();
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBack();
            }
        });

    }

    public void openDashboard() {
            Intent intent = new Intent(this, dashboard.class);
           startActivity(intent);
    }

    public void openAccount() {
        Intent intent = new Intent(this, AccountActivity.class);
        startActivity(intent);
    }

    public void openBack() {
        Intent intent = new Intent(this, activity_network_main.class);
        startActivity(intent);
    }

}
