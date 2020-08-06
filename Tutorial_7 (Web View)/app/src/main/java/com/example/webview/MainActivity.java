package com.example.webview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
    WebView ourBrowser;
    // add this to the manifest     <uses-permission android:name="android.permission.INTERNET"/>
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ourBrowser = (WebView) findViewById(R.id.webView);
        ourBrowser.loadUrl("https://www.google.com/");
        ourBrowser.setWebViewClient(new MyBrowser());
        ourBrowser.getSettings().setJavaScriptEnabled(true);
    }

    private class MyBrowser extends WebViewClient{
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }
}