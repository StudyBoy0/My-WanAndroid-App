package com.example.wanandroidproject;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

/**
 * 启动界面
 */
public class StartActivity extends AppCompatActivity {

    private Handler handler;
    private TimeRunnable timeRunnable;
    private ActionBar actionBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        //隐藏虚拟器按键，并且全屏显示
        hideUIMenu();
        ////设置一个定时器，延时启动主界面
        handler = new Handler();
        handler.postDelayed(new TimeRunnable(),2000);
    }
    //隐藏虚拟按键，并且全屏显示
    private void hideUIMenu(){
        if(Build.VERSION.SDK_INT > 11 && Build.VERSION.SDK_INT < 19){
            View view1 = this.getWindow().getDecorView();
            view1.setSystemUiVisibility(View.GONE);
        }else if(Build.VERSION.SDK_INT >=19){
            View view2 = getWindow().getDecorView();
            int uiOptions = View.SYSTEM_UI_FLAG_HIDE_NAVIGATION |
                    View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY | View.SYSTEM_UI_FLAG_FULLSCREEN;
            view2.setSystemUiVisibility(uiOptions);
        }
    }

    //设置一个定时器，延时启动主界面
    private class TimeRunnable implements Runnable{

        @Override
        public void run() {
            Intent intent = new Intent(StartActivity.this,MainActivity.class);
            startActivity(intent);
            finish();
        }
    }
}