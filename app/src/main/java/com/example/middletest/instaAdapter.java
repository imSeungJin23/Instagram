package com.example.middletest;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class instaAdapter extends RecyclerView.Adapter<instaAdapter.ViewHolder> {
    Button btn_rpl;
    LayoutInflater inflater;
    Context context;
    TextView insertText;
    EditText edit_Text;
    ArrayList<InstaDTO> list2;


    public instaAdapter(LayoutInflater inflater, Context context, ArrayList<InstaDTO> list2) {
        this.inflater = inflater;
        this.context = context;
        this.list2 = list2;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = inflater.inflate(R.layout.activity_insta_item, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder h, int i) {
        h.content_img.setImageResource(list2.get(i).getContent_img());
        h.pro_img.setImageResource(list2.get(i).getPro_img());
        h.repl_my_img.setImageResource(list2.get(i).getRepl_my_img());
        h.content_text.setText(list2.get(i).getContent_text());
        h.location.setText(list2.get(i).getLocation());
        h.nick_name.setText(list2.get(i).getNick_name());
        h.nick_name2.setText(list2.get(i).getNickname2());
        h.btn_rpl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                h.insertText.setText(h.edit_Text.getText());
                h.repl_id.setText("seungjiin_");
            }
        });
    }

    @Override
    public int getItemCount() {
        return list2.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView pro_img, content_img , repl_my_img;
        TextView content_text, location, nick_name, nick_name2, insertText,edit_Text,repl_id ;
        Button btn_rpl;

        public ViewHolder(@NonNull View v) {
            super(v);

            btn_rpl =  v.findViewById(R.id.btn_rpl);
            repl_id =  v.findViewById(R.id.repl_id);
            insertText = v.findViewById(R.id.insertText);
            edit_Text = v.findViewById(R.id.edit_Text);
            pro_img = v.findViewById(R.id.pro_img);
            content_img = v.findViewById(R.id.content_img);
            repl_my_img = v.findViewById(R.id.repl_my_img);
            content_text = v.findViewById(R.id.content_text);
            location = v.findViewById(R.id.location);
            nick_name = v.findViewById(R.id.nick_name);
            nick_name2 = v.findViewById(R.id.nick_name2);





        }
    }


}
