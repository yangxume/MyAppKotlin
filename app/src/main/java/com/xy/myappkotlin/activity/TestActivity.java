package com.xy.myappkotlin.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import com.okay.t_x5webview.X5WebView;
import com.xy.myappkotlin.R;

public class TestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_test);

        X5WebView x5webview = findViewById(R.id.x5webview);
        x5webview.loadUrl("https://www.baidu.com/");

    }
}
