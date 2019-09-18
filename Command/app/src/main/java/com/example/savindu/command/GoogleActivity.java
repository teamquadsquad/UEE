package com.example.savindu.command;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class GoogleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_google);

        WebView webView = findViewById(R.id.googleWebView);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://www.google.com/search?q=cmd+commands&rlz=1C1CHBF_enLK775LK775&oq=cmd+commands&aqs=chrome..69i57.7630j0j7&sourceid=chrome&ie=UTF-8");
    }
}
