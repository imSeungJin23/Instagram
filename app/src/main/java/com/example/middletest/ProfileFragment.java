package com.example.middletest;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.google.android.material.tabs.TabLayout;

public class ProfileFragment extends Fragment {
    TabLayout tabs;
    FragmentActivity activity;
    ImageView camera , meAl, more;
    TextView camerat, meAlt, meAltt;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
         View v = inflater.inflate(R.layout.fragment_profile, container, false);


         more = v.findViewById(R.id.more);
         tabs = v.findViewById(R.id.tabs);
         tabs.addTab(tabs.newTab().setIcon(R.drawable.ic_outline_grid_view_24));
         tabs.addTab(tabs.newTab().setIcon(R.drawable.ic_outline_assignment_ind_24));



        activity = ProfileFragment.super.getActivity();

        more = v.findViewById(R.id.more);

        more.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BottomsheetFragment bottomsheet = new BottomsheetFragment();

                bottomsheet.show(getActivity().getSupportFragmentManager(),bottomsheet.getTag());
            }
        });




        tabs.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
             @Override
             public void onTabSelected(TabLayout.Tab tab) {
                if(tab.getPosition()== 0){
                    changeView(0);
                }else if(tab.getPosition()==1 ){
                    changeView(1);
                }
             }

             @Override
             public void onTabUnselected(TabLayout.Tab tab) {

             }

             @Override
             public void onTabReselected(TabLayout.Tab tab) {

             }

         });

        return v;
    }
    private void changeView(int index) {
        camera = getActivity().findViewById(R.id.camera);
        camerat = getActivity().findViewById(R.id.camerat);
        meAl = getActivity().findViewById(R.id.meAl);
        meAlt = getActivity().findViewById(R.id.meAlt);
        meAltt =getActivity().findViewById(R.id.meAltt);

        switch (index) {
            case 0:
                camera.setVisibility(View.VISIBLE);
                camerat.setVisibility(View.VISIBLE);
                meAl.setVisibility(View.INVISIBLE);
                meAlt.setVisibility(View.INVISIBLE);
                meAltt.setVisibility(View.INVISIBLE);
                break;
            case 1:
                camera.setVisibility(View.INVISIBLE);
                camerat.setVisibility(View.INVISIBLE);
                meAl.setVisibility(View.VISIBLE);
                meAlt.setVisibility(View.VISIBLE);
                meAltt.setVisibility(View.VISIBLE);
                break;
        }
    }




}

