package com.example.savindu.command;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;

public class Progress extends AppCompatActivity {

    FrameLayout beginner, intermediate, advanced, relative;
    ImageView home, account, back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress);



        beginner = findViewById(R.id.beginner_level);
        intermediate = findViewById(R.id.intermediate_level);
        advanced = findViewById(R.id.advanced_level);
        relative = findViewById(R.id.relative_progress1);

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

        relative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openRelativeProgress();
            }
        });


    }

    public void openRelativeProgress() {
        Intent intent = new Intent(this, activity_relative_progress1.class);
        startActivity(intent);
    }

    public void openBeginnerQuestions() {
        Intent intent = new Intent(this, activity_progressChart.class);
        startActivity(intent);
    }

    public void openIntermediateQuestions() {
        Intent intent = new Intent(this, activity_progress_chatr_inter.class);
        startActivity(intent);
    }

    public void openAdvancedQuestions() {
        Intent intent = new Intent(this, activity_progressChart.class);
        startActivity(intent);
    }
//
//    public void openRelativeProgress() {
//        Intent intent = new Intent(this, activity_relative_progress1.class);
//        startActivity(intent);
//    }

    public void openDashboard() {
        //    Intent intent = new Intent(this, dashboard.class);
        //   startActivity(intent);
    }

    public void openAccount() {
//        Intent intent = new Intent(this, AccountActivity.class);
//        startActivity(intent);
    }

    public void openBack() {
//        Intent intent = new Intent(this, a_question1.class);
//        startActivity(intent);
    }
}
