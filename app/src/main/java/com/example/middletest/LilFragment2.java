package com.example.middletest;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;


public class LilFragment2 extends Fragment {

    Button btn_lil2;
    ImageView lil2 ,heart;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View v = inflater.inflate(R.layout.fragment_lil2, container, false);

        lil2 = v.findViewById(R.id.lil2);
        btn_lil2 = v.findViewById(R.id.btn_lil2);
        heart = v.findViewById(R.id.heart);


        Glide.with(LilFragment2.this).load("https://art.pixilart.com/d50ebe1ab7a372f.gif").into(lil2);

        btn_lil2.setOnClickListener(new View.OnClickListener() {
            int i = 0;
            @Override
            public void onClick(View v) {
                if (i == 0) {
                    btn_lil2.setText("팔로잉");
                    i++;
                } else if (i == 1) {
                    btn_lil2.setText("팔로우");
                    i--;
                }
            }
        });
        heart.setOnClickListener(new View.OnClickListener() {
            int i = 0;
            @Override
            public void onClick(View v) {
                if (i == 0) {
                    heart.setImageResource(R.drawable.ic_baseline_favoritefull_24);
                    i++;
                } else if (i == 1) {
                    heart.setImageResource(R.drawable.fav);
                    i--;
                }
            }
        });

        return v;
    }
}