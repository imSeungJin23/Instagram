package com.example.middletest;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import java.util.ArrayList;


public class ShopFragment extends Fragment {
    GridView shop_view;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_s_hop, container, false);
        ArrayList<ShopDTO> list = new ArrayList<>();

        list.add(new ShopDTO(R.drawable.shop1));
        list.add(new ShopDTO(R.drawable.shop2));
        list.add(new ShopDTO(R.drawable.shop3));
        list.add(new ShopDTO(R.drawable.shop4));
        list.add(new ShopDTO(R.drawable.shop5));
        list.add(new ShopDTO(R.drawable.shop6));
        list.add(new ShopDTO(R.drawable.shop7));
        list.add(new ShopDTO(R.drawable.shop8));
        list.add(new ShopDTO(R.drawable.shop9));
        list.add(new ShopDTO(R.drawable.shop10));
        list.add(new ShopDTO(R.drawable.shop11));


        ShopAdapter adapter = new ShopAdapter(inflater,list);
        shop_view = v.findViewById(R.id.shop_view);

        shop_view.setAdapter(adapter);


        return v;




    }
}