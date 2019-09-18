package com.example.savindu.command;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ExtrasActivity extends AppCompatActivity {

    ImageView home, account, back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_extras);

        Button google = findViewById(R.id.btn_Google);
        Button facebook = findViewById(R.id.btn_Facebook);
        Button youTube = findViewById(R.id.btn_YouTube);

        home = findViewById(R.id.home);
        account = findViewById(R.id.account);
        back = findViewById(R.id.back);

        google.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGoogle();
            }
        });

        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFacebook();
            }
        });

        youTube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openYouTube();
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
    }

    public void openGoogle() {
        Intent intent = new Intent(this, GoogleActivity.class);
        startActivity(intent);
    }

    public void openFacebook() {
        Intent intent = new Intent(this, FacebookActivity.class);
        startActivity(intent);
    }

    public void openYouTube() {
        Intent intent = new Intent(this, YoutubeActivity.class);
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
        Intent intent = new Intent(this, AccountActivity.class);
        startActivity(intent);
    }

}
