package com.example.wanandroidproject;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import com.bumptech.glide.Glide;
import com.example.wanandroidproject.R;
import com.example.wanandroidproject.WebViewActivity;
import com.youth.banner.Banner;
import com.youth.banner.BannerConfig;
import com.youth.banner.Transformer;
import com.youth.banner.listener.OnBannerListener;
import com.youth.banner.loader.ImageLoader;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * 主界面
 */
public class Home_Fragment extends Fragment implements OnBannerListener, View.OnClickListener {

    private Banner banner;
    private ArrayList<String> list_path;
    private ArrayList<String> list_title;
    private CardView cardView1,cardView2,cardView3,cardView4,cardView5,cardView6,cardView7,cardView8,cardView9;
    private Intent intent;


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home,null);
        banner = view.findViewById(R.id.banner);
        cardView1 = view.findViewById(R.id.cardView1);
        cardView2 = view.findViewById(R.id.cardView2);
        cardView3 = view.findViewById(R.id.cardView3);
        cardView4 = view.findViewById(R.id.cardView4);
        cardView5 = view.findViewById(R.id.cardView5);
        cardView6 = view.findViewById(R.id.cardView6);
        cardView7 = view.findViewById(R.id.cardView7);
        cardView8 = view.findViewById(R.id.cardView8);
        cardView9 = view.findViewById(R.id.cardView9);
        cardView1.setOnClickListener(this);
        cardView2.setOnClickListener(this);
        cardView3.setOnClickListener(this);
        cardView4.setOnClickListener(this);
        cardView5.setOnClickListener(this);
        cardView6.setOnClickListener(this);
        cardView7.setOnClickListener(this);
        cardView8.setOnClickListener(this);
        cardView9.setOnClickListener(this);
        //首页的轮播图
        initView();

        return view;
    }

    //首页的轮播图
    private void initView(){
        list_path = new ArrayList<>();  //图片集合
        list_title = new ArrayList<>(); //标题集合

        //添加图片地址
        list_path.add("https://wanandroid.com/blogimgs/affe33fb-a160-4c63-bcc5-2ba83965a7bc.png");
        list_path.add("https://www.wanandroid.com/blogimgs/90c6cc12-742e-4c9f-b318-b912f163b8d0.png");
        list_path.add("https://www.wanandroid.com/blogimgs/62c1bd68-b5f3-4a3c-a649-7ca8c7dfabe6.png");
        list_path.add("https://www.wanandroid.com/blogimgs/50c115c2-cf6c-4802-aa7b-a4334de444cd.png");

        //添加标题
        list_title.add("现在的Android程序员，要具备什么能力才能保持竞争");
        list_title.add("flutter 中文社区");
        list_title.add("一起来做个App吧");
        list_title.add("我们新增了一个常用导航Tab~");

        //设置内置样式
        banner.setBannerStyle(BannerConfig.CIRCLE_INDICATOR_TITLE_INSIDE);
        //设置图片加载器
        banner.setImageLoader(new MyGlide());
        //设置图片路径集合
        banner.setImages(list_path);
        //设置轮播的动画效果
        banner.setBannerAnimation(Transformer.Default);
        //设置轮播图的标题集合
        banner.setBannerTitles(list_title);
        //设置轮播间隔时间
        banner.setDelayTime(2000);
        //设置是否为自动轮播，默认为“是”
        banner.isAutoPlay(true);
        //设置指示器的位置，小点点，左中右
        banner.setIndicatorGravity(BannerConfig.CENTER);
        //设置轮播图监听
        banner.setOnBannerListener(this);
        //启动轮播图
        banner.start();
    }

    //为轮播的图片设置监听器
    @Override
    public void OnBannerClick(int position) {
        intent = new Intent(getContext(), WebViewActivity.class);
        switch (position){
            case 0:
                //将网址数据传到WebViewActivity
                intent.putExtra("uri","https://www.bilibili.com/video/BV1gp4y1k7mw");
                startActivity(intent);
                break;
            case 1:
                intent.putExtra("uri","https://flutter.cn/");
                startActivity(intent);
                break;
            case 2:
                intent.putExtra("uri","https://www.wanandroid.com/navi");
                startActivity(intent);
                break;
            case 3:
                intent.putExtra("uri","https://www.wanandroid.com/blog/show/2");
                startActivity(intent);
                break;
        }
    }

    //为CardView添加监听器
    @Override
    public void onClick(View view) {
        intent = new Intent(getContext(),WebViewActivity.class);
        switch (view.getId()){
            case R.id.cardView1:
                //将网址数据传到WebViewActivity
                intent.putExtra("uri","https://www.bilibili.com/video/BV1CA41177Se");
                startActivity(intent);
                break;
            case R.id.cardView2:
                intent.putExtra("uri","https://blog.csdn.net/lzllzllhl/article/details/109380951");
                startActivity(intent);
                break;
            case R.id.cardView3:
                //将网址数据传到WebViewActivity
                intent.putExtra("uri","https://www.wanandroid.com/wenda/show/15797");
                startActivity(intent);
                break;
            case R.id.cardView4:
                //将网址数据传到WebViewActivity
                intent.putExtra("uri","https://juejin.im/post/6889029050753531917/");
                startActivity(intent);
                break;
            case R.id.cardView5:
                //将网址数据传到WebViewActivity
                intent.putExtra("uri","https://www.jianshu.com/p/0d065ab24dec");
                startActivity(intent);
                break;
            case R.id.cardView6:
                //将网址数据传到WebViewActivity
                intent.putExtra("uri","https://juejin.im/post/6888887439922987022");
                startActivity(intent);
                break;
            case R.id.cardView7:
                //将网址数据传到WebViewActivity
                intent.putExtra("uri","https://mp.weixin.qq.com/s/1mC7_FLgW9yh0rf6O0Vemg");
                startActivity(intent);
                break;
            case R.id.cardView8:
                //将网址数据传到WebViewActivity
                intent.putExtra("uri","https://mp.weixin.qq.com/s/CaUdE4345QHd9pnXOQoXWw");
                startActivity(intent);
                break;
            case R.id.cardView9:
                //将网址数据传到WebViewActivity
                intent.putExtra("uri","https://mp.weixin.qq.com/s/4rBp15WP0pHa4dELpGyv_g");
                startActivity(intent);
                break;
        }
    }

    //使用Glide作为图片加载器
    private class MyGlide extends ImageLoader{

        @Override
        public void displayImage(Context context, Object path, ImageView imageView) {
            Glide.with(context).load((String)path).into(imageView);
        }
    }
}
