package com.example.savindu.command;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class activity_relative_progress4 extends AppCompatActivity {

    ImageView chart1, chart2, chart3, chart4;
    ImageView home, account, back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative_progress4);
        chart1 = findViewById(R.id.bar_chart_i);
        chart2 = findViewById(R.id.pie_chart_i);
        chart3 = findViewById(R.id.line_chart_i);
        chart4 = findViewById(R.id.dounuht_chart_i);

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


        chart1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMisc1();
            }
        });

        chart2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMisc2();
            }
        });

        chart3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMisc3();
            }
        });

        chart4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMisc4();
            }
        });
    }

    public void openMisc1() {
        Intent intent = new Intent(this, activity_relative_progress1.class);
        startActivity(intent);
    }

    public void openMisc2() {
        Intent intent = new Intent(this, activity_relative_progress2.class);
        startActivity(intent);
    }

    public void openMisc3() {
        Intent intent = new Intent(this, activity_relative_progress3.class);
        startActivity(intent);
    }

    public void openMisc4() {
        Intent intent = new Intent(this, activity_relative_progress4.class);
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
        Intent intent = new Intent(this, Progress.class);
        startActivity(intent);
    }
}
