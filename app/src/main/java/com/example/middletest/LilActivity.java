package com.example.middletest;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

public class LilActivity extends AppCompatActivity {
    private static final int NUM_PAGES=3;  //페이지 수
    private ViewPager2 pager;
    private FragmentStateAdapter pagerAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lil);


        pager = findViewById(R.id.pager);
        pagerAdapter = new ScreeSlidePagerAdapter(this);
        pager.setAdapter(pagerAdapter);

    }

    private class ScreeSlidePagerAdapter extends FragmentStateAdapter{
        public ScreeSlidePagerAdapter(FragmentActivity fa){
            super (fa);
        }

        @NonNull
        @Override
        public Fragment createFragment(int position) {//포지션마다 있을 fragment설정
            if(position==0) return new LilFragment1();
            else if(position==1) return new LilFragment2();
            else return new LilFragment3();
        }

        @Override
        public int getItemCount() {
            return NUM_PAGES;  //페이지 수 지정.
        }
    }
}