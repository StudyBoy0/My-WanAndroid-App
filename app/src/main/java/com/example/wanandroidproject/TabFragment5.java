package com.example.wanandroidproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

public class TabFragment5 extends Fragment implements View.OnClickListener {

    private ImageView imageView1,imageView2,imageView3,imageView4,imageView5,imageView6;
    private List<String> UriPath;
    private CardView cardView1,cardView2,cardView3,cardView4,cardView5,cardView6;
    private Intent intent;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.project_fragment05,null);
        imageView1 = view.findViewById(R.id.imageview25);
        imageView2 = view.findViewById(R.id.imageview26);
        imageView3 = view.findViewById(R.id.imageview27);
        imageView4 = view.findViewById(R.id.imageview28);
        imageView5 = view.findViewById(R.id.imageview29);
        imageView6 = view.findViewById(R.id.imageview30);
        cardView1 = view.findViewById(R.id.project_cardView25);
        cardView2 = view.findViewById(R.id.project_cardView26);
        cardView3 = view.findViewById(R.id.project_cardView27);
        cardView4 = view.findViewById(R.id.project_cardView28);
        cardView5 = view.findViewById(R.id.project_cardView29);
        cardView6 = view.findViewById(R.id.project_cardView30);
        cardView1.setOnClickListener(this);
        cardView2.setOnClickListener(this);
        cardView3.setOnClickListener(this);
        cardView4.setOnClickListener(this);
        cardView5.setOnClickListener(this);
        cardView6.setOnClickListener(this);
        initPicture();
        return view;
    }
    //用Glide为项目界面内容加载网络图片
    private void initPicture(){
        UriPath = new ArrayList<>();
        UriPath.add("https://www.wanandroid.com/blogimgs/ae1422fd-0227-42a9-9c3c-4e2de5e93c74.png");
        UriPath.add("https://wanandroid.com/blogimgs/e8fbd828-33c3-4af6-876f-c898408ee7e9.png");
        UriPath.add("https://wanandroid.com/blogimgs/e286419c-d291-4956-87d8-236e06151142.png");
        UriPath.add("https://www.wanandroid.com/blogimgs/7b1dce16-6095-4539-a504-8ec6f3ab32b6.png");
        UriPath.add("https://wanandroid.com/blogimgs/2eeeb4a6-b69a-41d2-8299-0907f948cbb4.png");
        UriPath.add("https://www.wanandroid.com/blogimgs/d558e93b-ac6c-4ae4-ae12-3b35326cef18.png");
        Glide.with(getContext()).load(UriPath.get(0)).into(imageView1);
        Glide.with(getContext()).load(UriPath.get(1)).into(imageView2);
        Glide.with(getContext()).load(UriPath.get(2)).into(imageView3);
        Glide.with(getContext()).load(UriPath.get(3)).into(imageView4);
        Glide.with(getContext()).load(UriPath.get(4)).into(imageView5);
        Glide.with(getContext()).load(UriPath.get(5)).into(imageView6);
    }

    @Override
    public void onClick(View view) {
        intent = new Intent(getContext(),WebViewActivity.class);
        switch (view.getId()){
            case R.id.project_cardView25:
                intent.putExtra("uri","https://www.wanandroid.com/blog/show/2758");
                startActivity(intent);
                break;
            case R.id.project_cardView26:
                intent.putExtra("uri","https://www.wanandroid.com/blog/show/2649");
                startActivity(intent);
                break;
            case R.id.project_cardView27:
                intent.putExtra("uri","https://www.wanandroid.com/blog/show/2614");
                startActivity(intent);
                break;
            case R.id.project_cardView28:
                intent.putExtra("uri","https://www.wanandroid.com/blog/show/2600");
                startActivity(intent);
                break;
            case R.id.project_cardView29:
                intent.putExtra("uri","https://www.wanandroid.com/blog/show/2582");
                startActivity(intent);
                break;
            case R.id.project_cardView30:
                intent.putExtra("uri","https://www.wanandroid.com/blog/show/2564");
                startActivity(intent);
                break;
        }
    }
}
