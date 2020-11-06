package com.example.wanandroidproject;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Project界面的Fragment适配器
 * FragmentPagerAdapter是Fragment特有的适配器
 */
public class TabFragmentAdapter extends FragmentPagerAdapter {

    private List<Fragment> tabFragmentList;
    private List<String> TabTitle;

    public TabFragmentAdapter(@NonNull FragmentManager fm, List<Fragment> tabFragmentList, List<String> TabTitle) {
        super(fm);
        this.tabFragmentList = tabFragmentList;
        this.TabTitle = TabTitle;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return tabFragmentList.get(position);
    }

    @Override
    public int getCount() {
        return tabFragmentList.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return TabTitle.get(position);
    }
}
