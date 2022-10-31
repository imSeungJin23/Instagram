package com.example.middletest;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;


public class LilFragment3 extends Fragment {

    ImageView lil3, heart;
    Button btn_lil3;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_lil3, container, false);

        lil3 = v.findViewById(R.id.lil3);
        btn_lil3 = v.findViewById(R.id.btn_lil3);
        heart = v.findViewById(R.id.heart);

        Glide.with(LilFragment3.this).load("https://art.pixilart.com/72be363d75f02a8.gif").into(lil3);

        btn_lil3.setOnClickListener(new View.OnClickListener() {
            int i = 0;
            @Override
            public void onClick(View v) {
                if (i == 0) {
                    btn_lil3.setText("팔로잉");
                    i++;
                } else if (i == 1) {
                    btn_lil3.setText("팔로우");
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