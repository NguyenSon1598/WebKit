package com.example.webkit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WebView webview = (WebView)findViewById(R.id.webid);
        webview.loadUrl("https://maps.google.com/");
        webview.getSettings().setJavaScriptEnabled(true);
    }
}
