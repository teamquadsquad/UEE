package com.example.savindu.command;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class FacebookActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facebook);

        WebView webView = findViewById(R.id.facebookWebView);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://m.facebook.com/cmdwonder/");

    }
}
