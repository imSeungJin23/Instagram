package com.example.middletest;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class storyAdapter extends RecyclerView.Adapter<storyAdapter.ViewHolder> {

    LayoutInflater inflater;
    Context context;
    ArrayList<StoryDTO> list;

    public storyAdapter(LayoutInflater inflater, Context context, ArrayList<StoryDTO> list) {
        this.inflater = inflater;
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = inflater.inflate(R.layout.story_item, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder v, int i) {
        v.story_img.setImageResource(list.get(i).getStory_img());
        v.story_id.setText(list.get(i).getStory_id());


        v.story_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent intent = new Intent(context,StoryIn.class);
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView story_img ,storyIn_exit;
        TextView story_id;


        public ViewHolder(@NonNull View v) {
            super(v);
            story_img = v.findViewById(R.id.story_img);
            story_id = v.findViewById(R.id.story_id);
            storyIn_exit = v.findViewById(R.id.storyIn_exit);
        }
    }


}
