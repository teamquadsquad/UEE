package com.example.savindu.command;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;

public class questions extends AppCompatActivity {

    FrameLayout beginner, intermediate, advanced;
    ImageView home, account, back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions);

        beginner = findViewById(R.id.beginner_level);
        intermediate = findViewById(R.id.intermediate_level);
        advanced = findViewById(R.id.advanced_level);

        home = findViewById(R.id.home);
        account = findViewById(R.id.account);
        back = findViewById(R.id.back);

        beginner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBeginnerQuestions();
            }
        });

        intermediate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openIntermediateQuestions();
            }
        });

        advanced.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAdvancedQuestions();
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

    public void openBeginnerQuestions() {
        Intent intent = new Intent(this, b_question1.class);
        startActivity(intent);
    }

    public void openIntermediateQuestions() {
        Intent intent = new Intent(this, i_question1.class);
        startActivity(intent);
    }

    public void openAdvancedQuestions() {
        Intent intent = new Intent(this, a_question1.class);
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
