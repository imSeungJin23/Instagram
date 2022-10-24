package com.example.middletest;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import java.util.ArrayList;


public class SearchFragment extends Fragment {
    GridView gridView;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_search,container,false);
        ArrayList<imgDTO> list = new ArrayList<>();
        list.add(new imgDTO(R.drawable.search1));
        list.add(new imgDTO(R.drawable.search2));
        list.add(new imgDTO(R.drawable.search3));
        list.add(new imgDTO(R.drawable.search4));
        list.add(new imgDTO(R.drawable.search5));
        list.add(new imgDTO(R.drawable.search6));
        list.add(new imgDTO(R.drawable.search7));
        list.add(new imgDTO(R.drawable.search9));
        list.add(new imgDTO(R.drawable.search8));
        list.add(new imgDTO(R.drawable.search10));
        list.add(new imgDTO(R.drawable.search3));
        list.add(new imgDTO(R.drawable.search1));
        list.add(new imgDTO(R.drawable.search10));
        list.add(new imgDTO(R.drawable.search7));
        list.add(new imgDTO(R.drawable.search6));
        list.add(new imgDTO(R.drawable.search3));
        list.add(new imgDTO(R.drawable.search4));
        list.add(new imgDTO(R.drawable.pro));
        gridAdapter adapter = new gridAdapter(inflater,list);
        gridView = v.findViewById(R.id.grid_view);

        gridView.setAdapter(adapter);

        return v;
    }
}