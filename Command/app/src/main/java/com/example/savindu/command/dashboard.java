package com.example.savindu.command;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;

public class dashboard extends AppCompatActivity {

    FrameLayout learn, questions, progress, account;
    ImageView home, accounti, back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        learn = findViewById(R.id.dashboard_learn);
        questions = findViewById(R.id.dashboard_questions);
        progress = findViewById(R.id.dashboard_progress);
        account = findViewById(R.id.dashboard_account);
        home = findViewById(R.id.home);
        accounti = findViewById(R.id.accounti);
        back = findViewById(R.id.back);

        learn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCategories();
            }
        });

        questions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openQuestions();
            }
        });

        progress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openProgress();
            }
        });

        account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAccount();
            }
        });

        accounti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAccount();
            }
        });
    }

    public void openCategories() {
        Intent intent = new Intent(this, categories.class);
        startActivity(intent);
    }

    public void openQuestions() {
        Intent intent = new Intent(this, questions.class);
        startActivity(intent);
    }

    public void openProgress() {
        Intent intent = new Intent(this, Progress.class);
        startActivity(intent);
    }

    public void openAccount() {
        Intent intent = new Intent(this, AccountActivity.class);
        startActivity(intent);
    }


}
