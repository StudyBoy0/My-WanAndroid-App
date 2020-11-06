package com.example.wanandroidproject;

import androidx.fragment.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

/**
 * 项目界面
 */
public class Project_Fragment extends Fragment {

    private TabLayout tabLayout;
    private ViewPager viewPager;
    private String[] TabTitle = {"完整项目","跨平台应用","资源聚合类","动画","RV列表动效"};
    private Fragment[] fragments = {new TabFragment1(),new TabFragment2(),new TabFragment3(),new TabFragment4(),new TabFragment5()};
    private List<Fragment> TabFragmentList;
    private List<String> TabTitleList;
    private TabFragmentAdapter tabFragmentAdapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_project,null);
        tabLayout = view.findViewById(R.id.TopNav);
        viewPager = view.findViewById(R.id.frag_content);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        TabFragmentList = new ArrayList<>();
        TabTitleList = new ArrayList<>();
        for(int i =0;i<TabTitle.length;i++){
            TabTitleList.add(TabTitle[i]);
            TabFragmentList.add(fragments[i]);
        }
        tabFragmentAdapter = new TabFragmentAdapter(getActivity().getSupportFragmentManager(),TabFragmentList,TabTitleList);
        viewPager.setAdapter(tabFragmentAdapter);
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.setTabsFromPagerAdapter(tabFragmentAdapter);
    }
}
