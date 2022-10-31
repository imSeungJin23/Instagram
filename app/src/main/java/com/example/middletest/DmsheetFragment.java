package com.example.middletest;

import android.app.FragmentManager;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.google.android.material.bottomsheet.BottomSheetDialogFragment;


public class DmsheetFragment extends BottomSheetDialogFragment {

    RecyclerView dm_view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_dmsheet, container, false);

        dm_view = v.findViewById(R.id.dm_view);

        dm_view.setAdapter(new DmAdapter(inflater,getContext(), (MainActivity) getActivity()));
        RecyclerView.LayoutManager manager = new LinearLayoutManager(getContext(),RecyclerView.VERTICAL,false);
        dm_view.setLayoutManager(manager);




        return v;
    }


}