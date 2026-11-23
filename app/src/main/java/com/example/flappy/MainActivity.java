package com.example.flappy;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        WebView w = new WebView(this);
        w.getSettings().setJavaScriptEnabled(true);
        w.getSettings().setDomStorageEnabled(true);
        w.setOverScrollMode(WebView.OVER_SCROLL_NEVER);
        setContentView(w);
        w.loadUrl("file:///android_asset/index.html");
    }
}
