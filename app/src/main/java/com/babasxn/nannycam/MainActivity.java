package com.babasxn.nannycam;

import android.os.Bundle;
import android.view.View;

import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        webView= (WebView) findViewById(R.id.webView);

        LoadWeb();
        
    }

    private void LoadWeb() {

        String url ="http://176.58.126.191:8000/admin/streams";

        webView = (WebView) findViewById(R.id.webView);
        webView.getSettings().setDomStorageEnabled(true);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {

                view.loadUrl(url);
                return true;
            }
        });
        webView.getSettings().setAppCacheEnabled(true);
        webView.loadUrl(url);
    }
}