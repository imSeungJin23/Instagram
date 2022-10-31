package com.example.middletest;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;


public class LilFragment1 extends Fragment {

    ImageView lil1,heart,lil_dm,bookMark,lil_chat;
    Button btn_lil;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_lil1, container, false);


        lil1 = v.findViewById(R.id.lil1);
        btn_lil = v.findViewById(R.id.btn_lil);
        heart = v.findViewById(R.id.heart);
        lil_dm = v.findViewById(R.id.lil_dm);
        bookMark = v.findViewById(R.id.bookMark);
        lil_chat = v.findViewById(R.id.lil_chat);

        Glide.with(LilFragment1.this).load("https://4.bp.blogspot.com/-Sx8ddQNvKcM/Xf_-npbd8XI/AAAAAAA2D6Q/0Mh_DHUEJsoTRe9wsY7vbMIq6OiIkUDEgCLcBGAsYHQ/s1600/AW4112162_14.gif").into(lil1);

        btn_lil.setOnClickListener(new View.OnClickListener() {
            int i = 0;
            @Override
            public void onClick(View v) {
                if (i == 0) {
                    btn_lil.setText("팔로잉");
                    i++;
                } else if (i == 1) {
                    btn_lil.setText("팔로우");
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

        lil_dm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DmInsheetFragment fragment = new DmInsheetFragment();
                fragment.show(getActivity().getSupportFragmentManager(),fragment.getTag());
            }
        });
        bookMark.setOnClickListener(new View.OnClickListener() {
            int i = 0;
            @Override
            public void onClick(View v) {
                if (i == 0) {
                    bookMark.setImageResource(R.drawable.bookmarkfull);
                    i++;
                } else if (i == 1) {
                    bookMark.setImageResource(R.drawable.bookmark);
                    i--;
                }
            }
        });

        lil_chat.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(),chatIn.class);
                getContext().startActivity(intent);

            }
        });

        return v;


    }
}