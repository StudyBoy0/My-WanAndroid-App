package com.example.wanandroidproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

/**
 * 项目--->跨平台应用
 */
public class TabFragment2 extends Fragment implements View.OnClickListener {
    private ImageView imageView1,imageView2,imageView3,imageView4,imageView5,imageView6;
    private List<String> UriPath;
    private CardView cardView1,cardView2,cardView3,cardView4,cardView5,cardView6;
    private Intent intent;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.project_fragment02,null);
        imageView1 = view.findViewById(R.id.imageview07);
        imageView2 = view.findViewById(R.id.imageview08);
        imageView3 = view.findViewById(R.id.imageview09);
        imageView4 = view.findViewById(R.id.imageview10);
        imageView5 = view.findViewById(R.id.imageview11);
        imageView6 = view.findViewById(R.id.imageview12);
        cardView1 = view.findViewById(R.id.project_cardView7);
        cardView2 = view.findViewById(R.id.project_cardView8);
        cardView3 = view.findViewById(R.id.project_cardView9);
        cardView4 = view.findViewById(R.id.project_cardView10);
        cardView5 = view.findViewById(R.id.project_cardView11);
        cardView6 = view.findViewById(R.id.project_cardView12);
        cardView1.setOnClickListener(this);
        cardView2.setOnClickListener(this);
        cardView3.setOnClickListener(this);
        cardView4.setOnClickListener(this);
        cardView5.setOnClickListener(this);
        cardView6.setOnClickListener(this);
        //用Glide为项目界面内容加载网络图片
        initPicture();
        return view;
    }
    //用Glide为项目界面内容加载网络图片
    private void initPicture(){
        UriPath = new ArrayList<>();
        UriPath.add("https://wanandroid.com/blogimgs/15cf6db2-ac1d-4fa2-8370-25861138c0a5.png");
        UriPath.add("https://wanandroid.com/blogimgs/1739af14-d772-41aa-a0f0-bc1fa3a27d08.png");
        UriPath.add("https://wanandroid.com/blogimgs/2490513e-299c-45e2-9fe8-15cfc48a72a8.png");
        UriPath.add("https://www.wanandroid.com/blogimgs/28cc42a3-3b5a-47ea-b4f4-5cd935432a7d.png");
        UriPath.add("https://wanandroid.com/blogimgs/e4109fbf-47d9-461a-a87a-16f20cba974c.png");
        UriPath.add("https://www.wanandroid.com/blogimgs/3b1ee979-bc7d-43d7-8cd9-af089936a001.png");
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
            case R.id.project_cardView7:
                //将网址数据传到WebViewActivity
                intent.putExtra("uri","https://www.wanandroid.com/blog/show/2783");
                startActivity(intent);
                break;
            case R.id.project_cardView8:
                intent.putExtra("uri","https://www.wanandroid.com/blog/show/2785");
                startActivity(intent);
                break;
            case R.id.project_cardView9:
                intent.putExtra("uri","https://www.wanandroid.com/blog/show/2753");
                startActivity(intent);
                break;
            case R.id.project_cardView10:
                intent.putExtra("uri","https://www.wanandroid.com/blog/show/2750");
                startActivity(intent);
                break;
            case R.id.project_cardView11:
                intent.putExtra("uri","https://www.wanandroid.com/blog/show/2746");
                startActivity(intent);
                break;
            case R.id.project_cardView12:
                intent.putExtra("uri","https://www.wanandroid.com/blog/show/2723");
                startActivity(intent);
                break;
        }
    }
}
