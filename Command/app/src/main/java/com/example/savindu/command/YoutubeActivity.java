package com.example.savindu.command;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class YoutubeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_youtube);

        WebView webView = findViewById(R.id.youTubeWebView);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://m.youtube.com/channel/UCTWSlDjAFvOyWkYS70CdZXw");
    }
}
