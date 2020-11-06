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
 * 项目--->完整项目
 */
public class TabFragment1 extends Fragment implements View.OnClickListener {

    private ImageView imageView1,imageView2,imageView3,imageView4,imageView5,imageView6;
    private CardView cardView1,cardView2,cardView3,cardView4,cardView5,cardView6;
    private List<String> UriPath;
    private Intent intent;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.project_fragment01,null);
        imageView1 = view.findViewById(R.id.imageview01);
        imageView2 = view.findViewById(R.id.imageview02);
        imageView3 = view.findViewById(R.id.imageview03);
        imageView4 = view.findViewById(R.id.imageview04);
        imageView5 = view.findViewById(R.id.imageview05);
        imageView6 = view.findViewById(R.id.imageview06);
        cardView1 = view.findViewById(R.id.project_cardView1);
        cardView2 = view.findViewById(R.id.project_cardView2);
        cardView3 = view.findViewById(R.id.project_cardView3);
        cardView4 = view.findViewById(R.id.project_cardView4);
        cardView5 = view.findViewById(R.id.project_cardView5);
        cardView6 = view.findViewById(R.id.project_cardView6);
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
        List<String> UriPath = new ArrayList<>();
        UriPath.add("https://www.wanandroid.com/blogimgs/1493b21f-34d7-4e0f-b33d-1ebe1b432691.png");
        UriPath.add("https://wanandroid.com/resources/image/pc/default_project_img.jpg");
        UriPath.add("https://wanandroid.com/blogimgs/0d83559f-2ce5-495c-ac71-3c3b254ae68d.png");
        UriPath.add("https://www.wanandroid.com/blogimgs/c90df328-30b0-4fc9-906a-c661ed450cad.png");
        UriPath.add("https://www.wanandroid.com/blogimgs/cbbd174c-2c68-4e67-9342-ba029a985502.png");
        UriPath.add("https://www.wanandroid.com/blogimgs/19ff621c-7c6c-45ae-919e-9b944136094b.png");
        Glide.with(getContext()).load(UriPath.get(0)).into(imageView1);
        Glide.with(getContext()).load(UriPath.get(1)).into(imageView2);
        Glide.with(getContext()).load(UriPath.get(2)).into(imageView3);
        Glide.with(getContext()).load(UriPath.get(3)).into(imageView4);
        Glide.with(getContext()).load(UriPath.get(4)).into(imageView5);
        Glide.with(getContext()).load(UriPath.get(5)).into(imageView6);
    }

    //为项目的各内容添加监听器
    @Override
    public void onClick(View view) {
        intent = new Intent(getContext(),WebViewActivity.class);
        switch (view.getId()){
            case R.id.project_cardView1:
                //将网址数据传到WebViewActivity
                intent.putExtra("uri","https://www.wanandroid.com/blog/show/2786");
                startActivity(intent);
                break;
            case R.id.project_cardView2:
                intent.putExtra("uri","https://www.wanandroid.com/blog/show/2784");
                startActivity(intent);
                break;
            case R.id.project_cardView3:
                intent.putExtra("uri","https://www.wanandroid.com/blog/show/2781");
                startActivity(intent);
                break;
            case R.id.project_cardView4:
                intent.putExtra("uri","https://www.wanandroid.com/blog/show/2774");
                startActivity(intent);
                break;
            case R.id.project_cardView5:
                intent.putExtra("uri","https://www.wanandroid.com/blog/show/2764");
                startActivity(intent);
                break;
            case R.id.project_cardView6:
                intent.putExtra("uri","https://www.wanandroid.com/blog/show/2762");
                startActivity(intent);
                break;
        }
    }
}
