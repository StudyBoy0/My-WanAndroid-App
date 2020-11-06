package com.example.wanandroidproject;

import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.donkingliang.labels.LabelsView;
import com.example.wanandroidproject.R;

import java.util.ArrayList;

/**
 * 导航界面
 */
public class Navigate_Fragment extends Fragment{

    private LabelsView labels01,labels02,labels03,labels04,labels05,labels06;
    private ArrayList<TestBean> label01,label02,label03,label04,label05,label06;
    private Intent intent;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_navigate,null);
        labels01 = view.findViewById(R.id.labels01);
        labels02 = view.findViewById(R.id.labels02);
        labels03 = view.findViewById(R.id.labels03);
        labels04 = view.findViewById(R.id.labels04);
        labels05 = view.findViewById(R.id.labels05);
        labels06 = view.findViewById(R.id.labels06);
        //标签项
        initLabelView();
        return view;
    }
    private void initLabelView(){
        label01 = new ArrayList<>();
        label02 = new ArrayList<>();
        label03 = new ArrayList<>();
        label04 = new ArrayList<>();
        label05 = new ArrayList<>();
        label06 = new ArrayList<>();

        label01.add(new TestBean("Android Studio相关",0));
        label01.add(new TestBean("gradle",1));
        label01.add(new TestBean("官方发布",2));
        label01.add(new TestBean("90-120hz",3));

        label02.add(new TestBean("Drawable",0));
        label02.add(new TestBean("deep link",1));
        label02.add(new TestBean("基础概念",2));
        label02.add(new TestBean("adb",3));
        label02.add(new TestBean("字符编码",4));
        label02.add(new TestBean("线程池",5));
        label02.add(new TestBean("Span",6));
        label02.add(new TestBean("多线程与并发",7));
        label02.add(new TestBean("Apk诞生记",8));
        label02.add(new TestBean("序列化",9));

        label03.add(new TestBean("Activity",0));
        label03.add(new TestBean("Service",1));
        label03.add(new TestBean("BroadcastReceiver",2));
        label03.add(new TestBean("ContentProvider",3));
        label03.add(new TestBean("Intent",4));
        label03.add(new TestBean("Context",5));
        label03.add(new TestBean("handler",6));

        label04.add(new TestBean("基础UI控件",0));
        label04.add(new TestBean("ListView&GridView",1));
        label04.add(new TestBean("ViewPager",2));
        label04.add(new TestBean("Fragment",3));
        label04.add(new TestBean("ScrollView",4));

        label05.add(new TestBean("Toast",0));
        label05.add(new TestBean("Dialog",1));
        label05.add(new TestBean("PopupWindow",2));
        label05.add(new TestBean("Notification",3));
        label05.add(new TestBean("震动",4));
        label05.add(new TestBean("截屏",5));
        label05.add(new TestBean("键盘",6));

        label06.add(new TestBean("WebView",0));
        label06.add(new TestBean("网络基础",1));
        label06.add(new TestBean("volley",2));
        label06.add(new TestBean("okhttp",3));
        label06.add(new TestBean("retrofit",4));
        label06.add(new TestBean("数据解析",5));
        label06.add(new TestBean("https",6));
        label06.add(new TestBean("文件下载",7));
        label06.add(new TestBean("cookie",8));
        label06.add(new TestBean("DNS",9));

        //labels01的标签项数据
        labels01.setLabels(label01, new LabelsView.LabelTextProvider<TestBean>() {
            @Override
            public CharSequence getLabelText(TextView label, int position, TestBean data) {
                //label就是标签项，可以对标签项目独立设置一些属性，比如文本样式等
                //根据data和position返回label需要显示的数据
                return data.getName();
            }
        });
        //labels01的标签项监听器
        labels01.setOnLabelClickListener(new LabelsView.OnLabelClickListener() {
            @Override
            public void onLabelClick(TextView label, Object data, int position) {
                //label是被点击的标签，data是标签所对应的数据，position是标签的位置。
                intent = new Intent(getContext(),WebViewActivity.class);
                switch (position){
                    case 0:
                        intent.putExtra("uri","https://www.wanandroid.com/article/list/0?cid=60");
                        startActivity(intent);
                        break;
                    case 1:
                        intent.putExtra("uri","https://www.wanandroid.com/article/list/0?cid=169");
                        startActivity(intent);
                        break;
                    case 2:
                        intent.putExtra("uri","https://www.wanandroid.com/article/list/0?cid=269");
                        startActivity(intent);
                        break;
                    case 3:
                        intent.putExtra("uri","https://www.wanandroid.com/article/list/0?cid=529");
                        startActivity(intent);
                        break;
                }
            }
        });

        //labels02的标签项数据
        labels02.setLabels(label02, new LabelsView.LabelTextProvider<TestBean>() {
            @Override
            public CharSequence getLabelText(TextView label, int position, TestBean data) {
                return data.getName();
            }
        });
        //labels02的标签项监听器
        labels02.setOnLabelClickListener(new LabelsView.OnLabelClickListener() {
            @Override
            public void onLabelClick(TextView label, Object data, int position) {
                intent = new Intent(getContext(),WebViewActivity.class);
                switch (position){
                    case 0:
                        intent.putExtra("uri","https://www.wanandroid.com/article/list/0?cid=168");
                        startActivity(intent);
                        break;
                    case 1:
                        intent.putExtra("uri","https://www.wanandroid.com/article/list/0?cid=172");
                        startActivity(intent);
                        break;
                    case 2:
                        intent.putExtra("uri","https://www.wanandroid.com/article/list/0?cid=198");
                        startActivity(intent);
                        break;
                    case 3:
                        intent.putExtra("uri","https://www.wanandroid.com/article/list/0?cid=224");
                        startActivity(intent);
                        break;
                    case 4:
                        intent.putExtra("uri","https://www.wanandroid.com/article/list/0?cid=240");
                        startActivity(intent);
                        break;
                    case 5:
                        intent.putExtra("uri","https://www.wanandroid.com/article/list/0?cid=241");
                        startActivity(intent);
                        break;
                    case 6:
                        intent.putExtra("uri","https://www.wanandroid.com/article/list/0?cid=257");
                        startActivity(intent);
                        break;
                    case 7:
                        intent.putExtra("uri","https://www.wanandroid.com/article/list/0?cid=306");
                        startActivity(intent);
                        break;
                    case 8:
                        intent.putExtra("uri","https://www.wanandroid.com/article/list/0?cid=307");
                        startActivity(intent);
                        break;
                    case 9:
                        intent.putExtra("uri","https://www.wanandroid.com/article/list/0?cid=403");
                        startActivity(intent);
                        break;
                }
            }
        });

        //labels03的标签数据
        labels03.setLabels(label03, new LabelsView.LabelTextProvider<TestBean>() {
            @Override
            public CharSequence getLabelText(TextView label, int position, TestBean data) {
                return data.getName();
            }
        });

        //labels03的标签项监听器
        labels03.setOnLabelClickListener(new LabelsView.OnLabelClickListener() {
            @Override
            public void onLabelClick(TextView label, Object data, int position) {
                intent = new Intent(getContext(),WebViewActivity.class);
                switch (position){
                    case 0:
                        intent.putExtra("uri","https://www.wanandroid.com/article/list/0?cid=10");
                        startActivity(intent);
                        break;
                    case 1:
                        intent.putExtra("uri","https://www.wanandroid.com/article/list/0?cid=15");
                        startActivity(intent);
                        break;
                    case 2:
                        intent.putExtra("uri","https://www.wanandroid.com/article/list/0?cid=16");
                        startActivity(intent);
                        break;
                    case 3:
                        intent.putExtra("uri","https://www.wanandroid.com/article/list/0?cid=17");
                        startActivity(intent);
                        break;
                    case 4:
                        intent.putExtra("uri","https://www.wanandroid.com/article/list/0?cid=19");
                        startActivity(intent);
                        break;
                    case 5:
                        intent.putExtra("uri","https://www.wanandroid.com/article/list/0?cid=40");
                        startActivity(intent);
                        break;
                    case 6:
                        intent.putExtra("uri","https://www.wanandroid.com/article/list/0?cid=267");
                        startActivity(intent);
                        break;
                }
            }
        });

        //labels04的标签数据
        labels04.setLabels(label04, new LabelsView.LabelTextProvider<TestBean>() {
            @Override
            public CharSequence getLabelText(TextView label, int position, TestBean data) {
                return data.getName();
            }
        });

        //labels04的标签监听器
        labels04.setOnLabelClickListener(new LabelsView.OnLabelClickListener() {
            @Override
            public void onLabelClick(TextView label, Object data, int position) {
                intent = new Intent(getContext(),WebViewActivity.class);
                switch (position){
                    case 0:
                        intent.putExtra("uri","https://www.wanandroid.com/article/list/0?cid=26");
                        startActivity(intent);
                        break;
                    case 1:
                        intent.putExtra("uri","https://www.wanandroid.com/article/list/0?cid=27");
                        startActivity(intent);
                        break;
                    case 2:
                        intent.putExtra("uri","https://www.wanandroid.com/article/list/0?cid=121");
                        startActivity(intent);
                        break;
                    case 3:
                        intent.putExtra("uri","https://www.wanandroid.com/article/list/0?cid=124");
                        startActivity(intent);
                        break;
                    case 4:
                        intent.putExtra("uri","https://www.wanandroid.com/article/list/0?cid=259");
                        startActivity(intent);
                        break;
                }
            }
        });

        //labels05的标签数据
        labels05.setLabels(label05, new LabelsView.LabelTextProvider<TestBean>() {
            @Override
            public CharSequence getLabelText(TextView label, int position, TestBean data) {
                return data.getName();
            }
        });
        //labels05的标签监听器
        labels05.setOnLabelClickListener(new LabelsView.OnLabelClickListener() {
            @Override
            public void onLabelClick(TextView label, Object data, int position) {
                intent = new Intent(getContext(),WebViewActivity.class);
                switch (position){
                    case 0:
                        intent.putExtra("uri","https://www.wanandroid.com/article/list/0?cid=30");
                        startActivity(intent);
                        break;
                    case 1:
                        intent.putExtra("uri","https://www.wanandroid.com/article/list/0?cid=31");
                        startActivity(intent);
                        break;
                    case 2:
                        intent.putExtra("uri","https://www.wanandroid.com/article/list/0?cid=32");
                        startActivity(intent);
                        break;
                    case 3:
                        intent.putExtra("uri","https://www.wanandroid.com/article/list/0?cid=33");
                        startActivity(intent);
                        break;
                    case 4:
                        intent.putExtra("uri","https://www.wanandroid.com/article/list/0?cid=190");
                        startActivity(intent);
                        break;
                    case 5:
                        intent.putExtra("uri","https://www.wanandroid.com/article/list/0?cid=263");
                        startActivity(intent);
                        break;
                    case 6:
                        intent.putExtra("uri","https://www.wanandroid.com/article/list/0?cid=341");
                        startActivity(intent);
                        break;
                }
            }
        });

        //labels06的标签数据
        labels06.setLabels(label06, new LabelsView.LabelTextProvider<TestBean>() {
            @Override
            public CharSequence getLabelText(TextView label, int position, TestBean data) {
                return data.getName();
            }
        });
        //labels06的标签监听器
        labels06.setOnLabelClickListener(new LabelsView.OnLabelClickListener() {
            @Override
            public void onLabelClick(TextView label, Object data, int position) {
                intent = new Intent(getContext(),WebViewActivity.class);
                switch (position){
                    case 0:
                        intent.putExtra("uri","https://www.wanandroid.com/article/list/0?cid=98");
                        startActivity(intent);
                        break;
                    case 1:
                        intent.putExtra("uri","https://www.wanandroid.com/article/list/0?cid=67");
                        startActivity(intent);
                        break;
                    case 2:
                        intent.putExtra("uri","https://www.wanandroid.com/article/list/0?cid=68");
                        startActivity(intent);
                        break;
                    case 3:
                        intent.putExtra("uri","https://www.wanandroid.com/article/list/0?cid=69");
                        startActivity(intent);
                        break;
                    case 4:
                        intent.putExtra("uri","https://www.wanandroid.com/article/list/0?cid=70");
                        startActivity(intent);
                        break;
                    case 5:
                        intent.putExtra("uri","https://www.wanandroid.com/article/list/0?cid=71");
                        startActivity(intent);
                        break;
                    case 6:
                        intent.putExtra("uri","https://www.wanandroid.com/article/list/0?cid=200");
                        startActivity(intent);
                        break;
                    case 7:
                        intent.putExtra("uri","https://www.wanandroid.com/article/list/0?cid=442");
                        startActivity(intent);
                        break;
                    case 8:
                        intent.putExtra("uri","https://www.wanandroid.com/article/list/0?cid=475");
                        startActivity(intent);
                        break;
                    case 9:
                        intent.putExtra("uri","https://www.wanandroid.com/article/list/0?cid=481 ");
                        startActivity(intent);
                        break;
                }
            }
        });
    }
}
