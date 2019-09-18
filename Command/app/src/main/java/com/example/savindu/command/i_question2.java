package com.example.savindu.command;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class i_question2 extends AppCompatActivity {

    Button btn_continue;
    ImageView home, account, back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_i_question2);

        btn_continue = findViewById(R.id.btn_continue);
        home = findViewById(R.id.home);
        account = findViewById(R.id.account);
        back = findViewById(R.id.back);

        btn_continue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNextQuestion();
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

    public void openNextQuestion() {
        Intent intent = new Intent(this, i_question3.class);
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
        Intent intent = new Intent(this, i_question1.class);
        startActivity(intent);
    }
}
