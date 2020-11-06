package com.example.wanandroidproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * 使用WebView显示网页
 */
public class WebViewActivity extends AppCompatActivity {

    private WebView webView;
    private Intent intent;
    private String strUri;
    private Bundle bundle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);
        //获取从CardView中传过来的网址数据
        intent = getIntent();
        bundle = intent.getExtras();
        strUri = (String) bundle.get("uri");
        webView = (WebView)findViewById(R.id.my_webView);
        //加载网页
        webView.loadUrl(strUri);
        //在本APP中打开该网页而不是在浏览器
        webView.setWebViewClient(new WebViewClient(){
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
                view.loadUrl(String.valueOf(request.getUrl()));
                return true;
            }
        });
        //将网页的标题显示到标题栏中
        webView.setWebChromeClient(new WebChromeClient(){
            @Override
            public void onReceivedTitle(WebView view, String title) {
                setTitle(title);
            }
        });
    }
}