package com.example.middletest;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    ActionBar actionBar;
    ImageView img;
    BottomNavigationView btm_nav;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        actionBar = getSupportActionBar();
        getSupportFragmentManager().beginTransaction().replace(R.id.container,new instaFragment()).commit();

        btm_nav = findViewById(R.id.btm_nav);
        btm_nav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if(item.getItemId() == R.id.menu1){
                    actionBar.setTitle("홈");
                    getSupportFragmentManager().beginTransaction().replace(R.id.container,new instaFragment()).commit();
                }else if(item.getItemId() == R.id.menu2){
                    actionBar.setTitle("검색");
                    getSupportFragmentManager().beginTransaction().replace(R.id.container,new SearchFragment()).commit();
                }else if(item.getItemId() == R.id.menu3){
                    actionBar.setTitle("릴스");
                    Intent intent = new Intent(MainActivity.this, LilActivity.class);
                    startActivity(intent);
                }else if(item.getItemId() == R.id.menu4){
                    actionBar.setTitle("Shop");
                    getSupportFragmentManager().beginTransaction().replace(R.id.container,new ShopFragment()).commit();
                }else if(item.getItemId() == R.id.menu5){
                    actionBar.setTitle("내 프로필");
                    getSupportFragmentManager().beginTransaction().replace(R.id.container,new ProfileFragment()).commit();
                }
                return true;
            }
        });







    }


}