package com.example.middletest;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import java.util.ArrayList;

public class gridAdapter extends BaseAdapter {

    LayoutInflater inflater;
    ArrayList<imgDTO> list;

    public gridAdapter(LayoutInflater inflater, ArrayList<imgDTO> list) {
        this.inflater = inflater;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    //getCount  수 만큼 작동함.
    public View getView(int position, View v, ViewGroup parent) {

        v = inflater.inflate(R.layout.search_item,parent, false);
        //나중에 알아서 처리함. 바로 붙이기 x

        ImageView img = v.findViewById(R.id.img1);
        img.setImageResource(list.get(position).getImg1());

        return v;
    }
}

