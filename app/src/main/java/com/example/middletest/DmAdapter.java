package com.example.middletest;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class DmAdapter extends RecyclerView.Adapter<DmAdapter.ViewHolder> {
    LayoutInflater inflater;
    Context context;
    MainActivity activity;


    public DmAdapter(LayoutInflater inflater, Context context,MainActivity activity) {
        this.inflater = inflater;
        this.context = context;
        this.activity = (MainActivity) activity;

    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = inflater.inflate(R.layout.dm_item, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder h, @SuppressLint("RecyclerView") int i) {

    h.dm_check.setOnClickListener(new View.OnClickListener() {
        int dmInt = 0;
        @Override
        public void onClick(View v) {
            if(dmInt == 0){
                h.dm_check.setImageResource(R.drawable.ic_baseline_check_circle_24);
                DmInsheetFragment fragment = new DmInsheetFragment();
                fragment.show(activity.getSupportFragmentManager(),fragment.getTag());
                dmInt++;
            }else if(dmInt == 1){
                h.dm_check.setImageResource(R.drawable.ic_outline_brightness_1_24);
                dmInt--;
            }

        }
    });
    

    }

    @Override
    public int getItemCount() {
        return 5;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        ImageView dm_check;
        EditText dm_in_msg;

        public ViewHolder(@NonNull View v) {
            super(v);

            dm_check = v.findViewById(R.id.dm_check);
            dm_in_msg = v.findViewById(R.id.dm_in_msg);


        }
    }


}
