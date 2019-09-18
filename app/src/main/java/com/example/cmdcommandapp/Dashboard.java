package com.example.cmdcommandapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Dashboard extends AppCompatActivity {

    Button learn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        learn = findViewById(R.id.learn);

        learn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCategory();
            }
        });
    }

    public void openCategory(){
        Intent intent = new Intent(this, Category.class);
        startActivity(intent);
    }
}
