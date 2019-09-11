package com.example.cmdcommandapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Category extends AppCompatActivity {

    Button security;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        security = findViewById(R.id.security);

        security.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSecurity();
            }
        });
    }

    public void openSecurity(){
        Intent intent = new Intent(this, Security.class);
        startActivity(intent);
    }
}
