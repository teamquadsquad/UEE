package com.example.savindu.command;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;

public class StorageActivity extends AppCompatActivity {

    FrameLayout misk1, misk2, misk3, misk4;
    ImageView home, account, back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_storage);

        misk1 = findViewById(R.id.misc1);
        misk2 = findViewById(R.id.misc2);
        misk3 = findViewById(R.id.misc3);
        misk4 = findViewById(R.id.misc4);

        home = findViewById(R.id.home);
        account = findViewById(R.id.account);
        back = findViewById(R.id.back);

        misk1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMisc1();
            }
        });

        misk2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMisc2();
            }
        });

        misk3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMisc3();
            }
        });

        misk4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMisc4();
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

    public void openMisc1() {
        Intent intent = new Intent(this, StorageContent_01_Activity.class);
        startActivity(intent);
    }

    public void openMisc2() {
        Intent intent = new Intent(this, StorageContent_02_Activity.class);
        startActivity(intent);
    }

    public void openMisc3() {
        Intent intent = new Intent(this, StorageContent_03_Activity.class);
        startActivity(intent);
    }

    public void openMisc4() {
        Intent intent = new Intent(this, StorageContent_04_Activity.class);
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
        Intent intent = new Intent(this, categories.class);
        startActivity(intent);
    }
}
