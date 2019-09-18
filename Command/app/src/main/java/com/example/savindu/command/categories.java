package com.example.savindu.command;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;

import java.security.Security;

public class categories extends AppCompatActivity {

    FrameLayout misc, security, network, storage;
    ImageView home, account, back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);

        misc = findViewById(R.id.misc);
        security = findViewById(R.id.security);
        network = findViewById(R.id.network);
        storage = findViewById(R.id.storage);
        home = findViewById(R.id.home);
        account = findViewById(R.id.account);
        back = findViewById(R.id.back);

        misc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMisc();
            }
        });

        network.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNetwork();
            }
        });

        storage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openStorage();
            }
        });

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

        security.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSecurity();
            }
        });
    }

    public void openMisc() {
        Intent intent = new Intent(this, learnMisk.class);
        startActivity(intent);
    }

    public void openSecurity() {
        Intent intent = new Intent(this, com.example.savindu.command.Security.class);
        startActivity(intent);
    }

    public void openNetwork() {
        Intent intent = new Intent(this, activity_network_main.class);
        startActivity(intent);
    }

    public void openStorage() {
        Intent intent = new Intent(this, StorageActivity.class);
        startActivity(intent);
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
        Intent intent = new Intent(this, dashboard.class);
        startActivity(intent);
    }
}
