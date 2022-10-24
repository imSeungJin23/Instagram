package com.example.middletest;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.nio.file.Files;
import java.util.ArrayList;


public class instaFragment extends Fragment {

    RecyclerView rec_view,story_view;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View v = inflater.inflate(R.layout.fragment_insta, container, false);
        ArrayList<StoryDTO> list = new ArrayList<>();
        list.add(new StoryDTO("내 스토리",R.drawable.pro));
        list.add(new StoryDTO("izky",R.drawable.search2));
        list.add(new StoryDTO("seungjiin_",R.drawable.search1));
        list.add(new StoryDTO("2002potato",R.drawable.search3));
        list.add(new StoryDTO("111",R.drawable.search5));
        list.add(new StoryDTO("222",R.drawable.search9));
        list.add(new StoryDTO("333",R.drawable.search10));
        list.add(new StoryDTO("444",R.drawable.search11));
        list.add(new StoryDTO("555",R.drawable.search8));
        list.add(new StoryDTO("226662",R.drawable.search7));


        Context context = getContext();
        storyAdapter sadapter = new storyAdapter(inflater,context,list);

        story_view = v.findViewById(R.id.story_view);
        story_view.setAdapter(sadapter);


        RecyclerView.LayoutManager smanager = new LinearLayoutManager(getContext(), RecyclerView.HORIZONTAL, false);
        story_view.setLayoutManager(smanager);

        ArrayList<InstaDTO> list2 = new ArrayList<>();
        list2.add(new InstaDTO(R.drawable.potato,R.drawable.potato,R.drawable.pro,"2002potato",
                "2002potato","강원도","감자좋아"));

        list2.add(new InstaDTO(R.drawable.search9,R.drawable.search2,R.drawable.pro,"Seungjiin_",
                "Seungjiin_","광주","몰라 ㅗ"));



        instaAdapter iadapter = new instaAdapter(inflater,context,list2);

        rec_view = v.findViewById(R.id.rec_view);

        rec_view.setAdapter(iadapter);


        RecyclerView.LayoutManager imanager = new LinearLayoutManager(getContext(), RecyclerView.VERTICAL, false);
        rec_view.setLayoutManager(imanager);




        return v;
    }
}