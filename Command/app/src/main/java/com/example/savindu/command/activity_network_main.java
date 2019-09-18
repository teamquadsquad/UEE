package com.example.savindu.command;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.view.View;
import android.widget.ImageView;

public class activity_network_main extends AppCompatActivity {

    FrameLayout net1, net2, net3, net4;
    ImageView home, account, back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_network_main);

        net1 = findViewById(R.id.network1);
        net2 = findViewById(R.id.network2);
        net3 = findViewById(R.id.network3);
        net4 = findViewById(R.id.network4);

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

        net1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMisc1();
            }
        });

        net2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMisc2();
            }
        });

        net3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMisc3();
            }
        });

        net4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMisc4();
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
        Intent intent = new Intent(this, categories.class);
        startActivity(intent);
    }
    public void openMisc1() {
        Intent intent = new Intent(this, activity_network1.class);
        startActivity(intent);
    }

    public void openMisc2() {
        Intent intent = new Intent(this, activity_network2.class);
        startActivity(intent);
    }

    public void openMisc3() {
        Intent intent = new Intent(this, activity_network3.class);
        startActivity(intent);
    }

    public void openMisc4() {
        Intent intent = new Intent(this, activity_network4.class);
        startActivity(intent);
    }
}
