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

public class TabFragment4 extends Fragment implements View.OnClickListener {

    private ImageView imageView1,imageView2,imageView3,imageView4,imageView5,imageView6;
    private List<String> UriPath;
    private CardView cardView1,cardView2,cardView3,cardView4,cardView5,cardView6;
    private Intent intent;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.project_fragment04,null);
        imageView1 = view.findViewById(R.id.imageview19);
        imageView2 = view.findViewById(R.id.imageview20);
        imageView3 = view.findViewById(R.id.imageview21);
        imageView4 = view.findViewById(R.id.imageview22);
        imageView5 = view.findViewById(R.id.imageview23);
        imageView6 = view.findViewById(R.id.imageview24);
        cardView1 = view.findViewById(R.id.project_cardView19);
        cardView2 = view.findViewById(R.id.project_cardView20);
        cardView3 = view.findViewById(R.id.project_cardView21);
        cardView4 = view.findViewById(R.id.project_cardView22);
        cardView5 = view.findViewById(R.id.project_cardView23);
        cardView6 = view.findViewById(R.id.project_cardView24);
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
        UriPath.add("https://wanandroid.com/blogimgs/55e1bc67-084d-49dd-8c2c-0b88492f478b.png");
        UriPath.add("https://www.wanandroid.com/blogimgs/355aed02-2076-41b6-aee1-5b8b0153e713.png");
        UriPath.add("https://www.wanandroid.com/blogimgs/edd47f18-d19f-4dad-a3be-73e8453e5746.png");
        UriPath.add("https://www.wanandroid.com/blogimgs/4f370f12-bed2-42e8-b557-c8b14fac50e0.png");
        UriPath.add("https://wanandroid.com/blogimgs/d064a584-6090-4588-bb40-fca1ae904b6d.png");
        UriPath.add("https://wanandroid.com/blogimgs/b9a57f25-fff5-46dc-8dd8-f822f17abd5b.png");
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
            case R.id.project_cardView19:
                intent.putExtra("uri","https://www.wanandroid.com/blog/show/2702");
                startActivity(intent);
                break;
            case R.id.project_cardView20:
                intent.putExtra("uri","https://www.wanandroid.com/blog/show/2687");
                startActivity(intent);
                break;
            case R.id.project_cardView21:
                intent.putExtra("uri","https://www.wanandroid.com/blog/show/2662");
                startActivity(intent);
                break;
            case R.id.project_cardView22:
                intent.putExtra("uri","https://www.wanandroid.com/blog/show/2655");
                startActivity(intent);
                break;
            case R.id.project_cardView23:
                intent.putExtra("uri","https://www.wanandroid.com/blog/show/2651");
                startActivity(intent);
                break;
            case R.id.project_cardView24:
                intent.putExtra("uri","https://www.wanandroid.com/blog/show/2621");
                startActivity(intent);
                break;
        }
    }
}
