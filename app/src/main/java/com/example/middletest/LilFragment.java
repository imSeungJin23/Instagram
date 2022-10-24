package com.example.middletest;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;


public class LilFragment extends Fragment {
    RecyclerView lil_view;
    ImageView img1;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_lil, container, false);
        img1 = v.findViewById(R.id.lil);

        ArrayList<LilDTO> list = new ArrayList<>();
        list.add(new LilDTO(R.drawable.pro,"2002potato","2.3만","1000개",
                "https://blog.kakaocdn.net/dn/c6pAkf/btrn4rgw5la/7m06GPUMq1155ou7EEYo21/img.gif"));
        list.add(new LilDTO(R.drawable.search10,"seunjiin_","1.3만","200개",
                "https://cdn.vox-cdn.com/thumbor/He_VVk5IhW5UI0w8RciuhRgIfjc=/0x15:500x348/1400x1400/filters:focal(0x15:500x348):format(gif)/cdn.vox-cdn.com/uploads/chorus_image/image/36992002/tumblr_lmwsamrrxT1qagx30.0.0.gif"));
        list.add(new LilDTO(R.drawable.search2,"izky","3.3만","1300개",
                "https://thumbs.gfycat.com/ExcitableDigitalHoverfly-size_restricted.gif"));
        list.add(new LilDTO(R.drawable.shop2,"kiteman","4.3만","51000개",
                "https://learn.g2.com/hs-fs/hubfs/plan%20gif%20marketing%20strategy.gif?width=500&name=plan%20gif%20marketing%20strategy.gif"));



        Context context = getContext();

        lil_view = v.findViewById(R.id.lil_view);
        lilAdapter adapter = new lilAdapter(inflater,context, list);
        lil_view.setAdapter(adapter);


        RecyclerView.LayoutManager manager = new LinearLayoutManager(getContext(), RecyclerView.VERTICAL, false);
        lil_view.setLayoutManager(manager);




        return v;
    }
}