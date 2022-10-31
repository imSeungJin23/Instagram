package com.example.middletest;

import static com.example.middletest.chatIn.list;

import android.annotation.SuppressLint;

import android.content.Context;

import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.middletest.databinding.ChatinItemBinding;

import java.util.ArrayList;

public class ChatAdapter extends RecyclerView.Adapter<ChatAdapter.ViewHolder> {

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View v = inflater.inflate(R.layout.chatin_item, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder h, @SuppressLint("RecyclerView") int i) {


        h.chat_pro.setImageResource( list.get(i).getChat_pro());
        h.chat_fav.setImageResource(list.get(i).getChat_fav());
        h.chat_id.setText(list.get(i).getChat_id());
        h.chat_time.setText(list.get(i).getChat_time());
        h.chat_text.setText(list.get(i).getChat_text());


        h.chat_fav.setOnClickListener(new View.OnClickListener() {
            int favInt = 0;
            @Override
            public void onClick(View v) {
                if(favInt == 0){
                    h.chat_fav.setImageResource(R.drawable.ic_baseline_favoritefull_24);
                    favInt++;
                }else if(favInt == 1){
                    h.chat_fav.setImageResource(R.drawable.ic_baseline_favorite_border_24black);
                    favInt--;
                };
            }
        });

    }
    @Override
    public int getItemCount() {
      return 5;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView chat_pro,chat_fav;
        TextView chat_id, chat_time, chat_text;
        EditText  chat_edit;

        public ViewHolder(@NonNull View v) {
            super(v);
            chat_pro = v.findViewById(R.id.chat_pro);
            chat_fav = v.findViewById(R.id.chat_fav);
            chat_id = v.findViewById(R.id.chat_id);
            chat_time = v.findViewById(R.id.chat_time);
            chat_text = v.findViewById(R.id.chat_text);
            chat_edit = v.findViewById(R.id.chat_edit);


        }
    }


}
