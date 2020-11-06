package com.example.wanandroidproject;
import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.ashokvarma.bottomnavigation.BottomNavigationBar;
import com.ashokvarma.bottomnavigation.BottomNavigationItem;

public class MainActivity extends AppCompatActivity implements BottomNavigationBar.OnTabSelectedListener {


    private BottomNavigationBar bottomNavigationBar;
    private Fragment currentFragment;
    private Fragment mFragment;
    private Fragment home_Fragment,project_Fragment,navigate_Fragment,me_Fragment;
    private FragmentTransaction transaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //底部导航栏
        bottomNavigationBar  = (BottomNavigationBar)findViewById(R.id.bottom_navigation_bar);
        initBottomNavigationBar();

    }

    //底部导航栏
    private void initBottomNavigationBar(){
        //设置底部导航栏
        bottomNavigationBar.setMode(BottomNavigationBar.MODE_FIXED);
        bottomNavigationBar.setBackgroundStyle(BottomNavigationBar.BACKGROUND_STYLE_STATIC);
        bottomNavigationBar.setBarBackgroundColor(R.color.background_gray_color);
        bottomNavigationBar
                .addItem(new BottomNavigationItem(R.mipmap.ic_main_home1,"首页").setActiveColorResource(R.color.btn_chose).setInactiveIconResource(R.mipmap.ic_main_home2).setInActiveColorResource(R.color.btn_unchose))
                .addItem(new BottomNavigationItem(R.mipmap.ic_main_project1,"项目").setActiveColorResource(R.color.btn_chose).setInactiveIconResource(R.mipmap.ic_main_project2).setActiveColorResource(R.color.btn_unchose))
                .addItem(new BottomNavigationItem(R.mipmap.ic_main_navigate1,"导航").setActiveColorResource(R.color.btn_chose).setInactiveIconResource(R.mipmap.ic_main_navigate2).setInActiveColorResource(R.color.btn_unchose))
                .addItem(new BottomNavigationItem(R.mipmap.ic_main_me1,"我的").setActiveColorResource(R.color.btn_chose).setInactiveIconResource(R.mipmap.ic_main_me2).setInActiveColorResource(R.color.btn_unchose))
                .initialise();
        
        home_Fragment = new Home_Fragment();
        project_Fragment = new Project_Fragment();
        navigate_Fragment = new Navigate_Fragment();
        me_Fragment = new Me_Fragment();
        transaction = getSupportFragmentManager().beginTransaction();
        transaction.add(R.id.fragment1, home_Fragment)
                .commit();
        mFragment = home_Fragment;

        //添加监听器
        bottomNavigationBar.setTabSelectedListener(this);

    }


    //导航栏监听事件（因为用replace的方式切换Fragment，会把Fragment的完整生命周期走一遍，如果每次都重走Fragment生命周期，会浪费资源消耗流量的。）
    @Override
    public void onTabSelected(int position) {
        switch (position) {
            case 0:
                switchFragment(home_Fragment);
                break;
            case 1:
                switchFragment(project_Fragment);
                break;
            case 2:
                switchFragment(navigate_Fragment);
                break;
            case 3:
                switchFragment(me_Fragment);
                break;
            default:
                break;
        }
    }

    private void switchFragment(Fragment fragment){
        //判断当前显示的Fragment是不是切换的Fragment
        if(mFragment != fragment){
            //判断切换的Fragment是否已经添加过
            if(!fragment.isAdded()){
                //如果没有，则把当前的Fragment隐藏，把切换的Fragment添加上
                getSupportFragmentManager().beginTransaction().hide(mFragment).add(R.id.fragment1,fragment).commit();
            }else {
                //如果已经添加过，则把当前的Fragment隐藏，把切换的Fragment显示出来
                getSupportFragmentManager().beginTransaction().hide(mFragment).show(fragment).commit();
            }
            mFragment = fragment;
        }
    }


    @Override
    public void onTabUnselected(int position) {

    }

    @Override
    public void onTabReselected(int position) {

    }

}