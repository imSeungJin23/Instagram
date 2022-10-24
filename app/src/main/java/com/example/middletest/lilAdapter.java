package com.example.middletest;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class lilAdapter extends RecyclerView.Adapter<lilAdapter.ViewHolder>{

    LayoutInflater inflater;
    Context context;
    ArrayList<LilDTO> list;

    public lilAdapter(LayoutInflater inflater, Context context,ArrayList<LilDTO> list) {
        this.inflater = inflater;
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public lilAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = inflater.inflate(R.layout.lil_item, parent, false);
        return new lilAdapter.ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder h, int i) {
        Glide.with(context).load(list.get(i).getLil()).
                into(h.lil);
        h.lil_proimg.setImageResource(list.get(i).getLil_proimg());
        h.lil_id.setText(list.get(i).getLil_id());
        h.text_heart.setText(list.get(i).getText_heart());
        h.chat_num.setText(list.get(i).getChat_num());

    }


    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView lil,lil_proimg;
        TextView lil_id,text_heart,chat_num;
        public ViewHolder(@NonNull View v) {
            super(v);
        lil = v.findViewById(R.id.lil);
        lil_id = v.findViewById(R.id.lil_id);
        lil_proimg = v.findViewById(R.id.lil_proimg);
            text_heart = v.findViewById(R.id.text_heart);
            chat_num = v.findViewById(R.id.chat_num);



        }
    }


}
