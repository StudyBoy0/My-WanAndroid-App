package com.example.wanandroidproject;

import androidx.fragment.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.wanandroidproject.LoginActivity;
import com.example.wanandroidproject.R;

/**
 * 我的界面
 */

public class Me_Fragment extends Fragment  implements View.OnClickListener {

    private LinearLayout collect,about,blog;
    private TextView login;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_me,null);
        collect = view.findViewById(R.id.my_collect);
        about = view.findViewById(R.id.my_about);
        blog = view.findViewById(R.id.my_blog);
        login = view.findViewById(R.id.me_text);
        collect.setOnClickListener(this);
        about.setOnClickListener(this);
        blog.setOnClickListener(this);
        login.setOnClickListener(this);
        return view;
    }

    //添加监听器事件
    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.my_collect:
                Intent intent1 = new Intent(getContext(), LoginActivity.class);
                startActivity(intent1);
                break;
            case R.id.my_about:
                Intent intent2 = new Intent(getContext(),AboutActivity.class);
                startActivity(intent2);
                break;
            case R.id.my_blog:
                Intent intent3 = new Intent(getContext(),LoginActivity.class);
                startActivity(intent3);
                break;
            case R.id.me_text:
                Intent intent4 = new Intent(getContext(),LoginActivity.class);
                startActivity(intent4);
                break;
            default:
                break;
        }
    }
}
