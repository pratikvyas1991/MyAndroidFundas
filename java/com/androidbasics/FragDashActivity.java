package com.androidbasics;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class FragDashActivity extends AppCompatActivity {
    TextView tvText;
    ViewPager viewPager;
    TabLayout tabLayout;
    Button btnPush;
    int position=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.frag_dash);
        Bundle bundle=getIntent().getExtras();
        if(bundle!=null){
            position=bundle.getInt("positions");
        }
        tvText=(TextView)findViewById(R.id.tvText);
        viewPager=(ViewPager)findViewById(R.id.viewPager);
        tabLayout=(TabLayout)findViewById(R.id.tabLayout);
        btnPush=(Button)findViewById(R.id.btnPush);
        setUpViewPager(viewPager);
        tabLayout.setupWithViewPager(viewPager);


        btnPush.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 changePosition(0);
//                Bundle bundle=new Bundle();
//                bundle.putString("message","Hello From MainActivity");
//                StudentFragment studentFragment=new StudentFragment();
//                studentFragment.setArguments(bundle);
//                FragmentManager manager=getSupportFragmentManager();
//                FragmentTransaction transaction=manager.beginTransaction();
//                transaction.replace(R.id.viewPager,studentFragment);
//                transaction.commit();
//                getSupportFragmentManager().beginTransaction().replace(R.id.viewPager,studentFragment);

            }
        });
    }

 public class ViewPagerAdapter extends FragmentPagerAdapter{
     private final List<Fragment> mFragmentList=new ArrayList<>();
     private final List<String>mFragmentTitleList=new ArrayList<>();
     public ViewPagerAdapter(FragmentManager fm) {
         super(fm);
     }
     @Override
     public Fragment getItem(int position) {
         return mFragmentList.get(position);
     }
     @Override
     public int getCount() {
         return mFragmentList.size();
     }
     @Override
     public CharSequence getPageTitle(int position) {
         return mFragmentTitleList.get(position);
     }
     public void addFragmemnt(Fragment fragment,String title){
         mFragmentList.add(fragment);
         mFragmentTitleList.add(title);
     }
 }
 public void setUpViewPager(ViewPager pager){
     ViewPagerAdapter pagerAdapter=new ViewPagerAdapter(getSupportFragmentManager());
     pagerAdapter.addFragmemnt(new UserFragment(),"Users");
     pagerAdapter.addFragmemnt(new StudentFragment(),"Students");
     pager.setAdapter(pagerAdapter);
     viewPager.setCurrentItem(position);
 }

 public void changePosition(int position){
     viewPager=(ViewPager)findViewById(R.id.viewPager);
     ViewPagerAdapter pagerAdapter=new ViewPagerAdapter(getSupportFragmentManager());
     pagerAdapter.addFragmemnt(new UserFragment(),"Users");
     pagerAdapter.addFragmemnt(new StudentFragment(),"Students");
     viewPager.setAdapter(pagerAdapter);
     viewPager.setCurrentItem(position);
 }



}
