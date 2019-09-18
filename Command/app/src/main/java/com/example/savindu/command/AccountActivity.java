package com.example.savindu.command;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class AccountActivity extends AppCompatActivity {

    ImageView home, account, back;
    Button progress, logout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.account_activity);

        ImageView avatar = findViewById(R.id.imageViewAvatar);
        Button extras = findViewById(R.id.buttonExtras);

        home = findViewById(R.id.home);
        back = findViewById(R.id.back);
        progress = findViewById(R.id.buttonProgress);
        logout = findViewById(R.id.buttonLogOut);

        avatar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openChangeAvatar();
            }
        });

        extras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openExtras();
            }
        });

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDashboard();
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBack();
            }
        });

        progress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openProgress();
            }
        });

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLogin();
            }
        });
    }

    public void openChangeAvatar() {
        Intent intent = new Intent(this, ChangeAvatarActivity.class);
        startActivity(intent);
    }

    public void openExtras() {
        Intent intent = new Intent(this, ExtrasActivity.class);
        startActivity(intent);
    }

    public void openDashboard() {
        Intent intent = new Intent(this, dashboard.class);
        startActivity(intent);
    }

    public void openBack() {
        Intent intent = new Intent(this, dashboard.class);
        startActivity(intent);
    }

    public void openProgress() {
        Intent intent = new Intent(this, Progress.class);
        startActivity(intent);
    }

    public void openLogin() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}