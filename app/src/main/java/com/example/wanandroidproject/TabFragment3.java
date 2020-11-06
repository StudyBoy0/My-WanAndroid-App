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
 * 项目--->资源聚合类
 */
public class TabFragment3 extends Fragment implements View.OnClickListener {
    private ImageView imageView1,imageView2,imageView3,imageView4,imageView5,imageView6;
    private List<String> UriPath;
    private CardView cardView1,cardView2,cardView3,cardView4,cardView5,cardView6;
    private Intent intent;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.project_fragment03,null);
        imageView1 = view.findViewById(R.id.imageview13);
        imageView2 = view.findViewById(R.id.imageview14);
        imageView3 = view.findViewById(R.id.imageview15);
        imageView4 = view.findViewById(R.id.imageview16);
        imageView5 = view.findViewById(R.id.imageview17);
        imageView6 = view.findViewById(R.id.imageview18);
        cardView1 = view.findViewById(R.id.project_cardView13);
        cardView2 = view.findViewById(R.id.project_cardView14);
        cardView3 = view.findViewById(R.id.project_cardView15);
        cardView4 = view.findViewById(R.id.project_cardView16);
        cardView5 = view.findViewById(R.id.project_cardView17);
        cardView6 = view.findViewById(R.id.project_cardView18);
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
        UriPath.add("https://www.wanandroid.com/resources/image/pc/default_project_img.jpg");
        UriPath.add("https://wanandroid.com/resources/image/pc/default_project_img.jpg");
        UriPath.add("https://wanandroid.com/resources/image/pc/default_project_img.jpg");
        UriPath.add("https://wanandroid.com/resources/image/pc/default_project_img.jpg");
        UriPath.add("https://wanandroid.com/blogimgs/a9c53e27-c9c2-4afc-b32f-d5f6d4e8d4da.png");
        UriPath.add("https://www.wanandroid.com/resources/image/pc/default_project_img.jpg");
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
            case R.id.project_cardView13://将网址数据传到WebViewActivity
                intent.putExtra("uri","https://www.wanandroid.com/blog/show/2722");
                startActivity(intent);
                break;
            case R.id.project_cardView14://将网址数据传到WebViewActivity
                intent.putExtra("uri","https://www.wanandroid.com/blog/show/2652");
                startActivity(intent);
                break;
            case R.id.project_cardView15://将网址数据传到WebViewActivity
                intent.putExtra("uri","https://www.wanandroid.com/blog/show/2626");
                startActivity(intent);
                break;
            case R.id.project_cardView16://将网址数据传到WebViewActivity
                intent.putExtra("uri","https://www.wanandroid.com/blog/show/2623");
                startActivity(intent);
                break;
            case R.id.project_cardView17://将网址数据传到WebViewActivity
                intent.putExtra("uri","https://www.wanandroid.com/blog/show/2581");
                startActivity(intent);
                break;
            case R.id.project_cardView18://将网址数据传到WebViewActivity
                intent.putExtra("uri","https://www.wanandroid.com/blog/show/2530");
                startActivity(intent);
                break;
        }
    }
}
