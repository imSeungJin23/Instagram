package com.example.middletest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.media.Image;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.zip.Inflater;

public class chatIn extends AppCompatActivity {

    EditText chat_edit;
    ImageView chat_exit, chat_fav;
    RecyclerView chat_view;
    public static ArrayList<chatInDTO> list = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat_in);

        list.add(new chatInDTO(R.drawable.search1,R.drawable.ic_baseline_favorite_border_24black,"id1","1시간","text1"));
        list.add(new chatInDTO(R.drawable.search1,R.drawable.ic_baseline_favorite_border_24black,"id2","2시간","text2"));
        list.add(new chatInDTO(R.drawable.search1,R.drawable.ic_baseline_favorite_border_24black,"id3","3시간","text3"));
        list.add(new chatInDTO(R.drawable.search1,R.drawable.ic_baseline_favorite_border_24black,"id4","4시간","text4"));
        list.add(new chatInDTO(R.drawable.search1,R.drawable.ic_baseline_favorite_border_24black,"id5","5시간","text5"));

        chat_edit = findViewById(R.id.chat_edit);
        chat_exit = findViewById(R.id.chat_exit);
        chat_fav = findViewById(R.id.chat_fav);

        chat_view = findViewById(R.id.chat_view);
        chat_view.setAdapter(new ChatAdapter());
        RecyclerView.LayoutManager manager = new LinearLayoutManager(this,RecyclerView.VERTICAL,false);
        chat_view.setLayoutManager(manager);
        chat_exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
         chat_edit.setOnEditorActionListener(new TextView.OnEditorActionListener()
        {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event)
            {
                if(actionId == EditorInfo.IME_ACTION_DONE)
                {
                    Toast.makeText(chatIn.this,"댓글 입력 되었습니다",Toast.LENGTH_SHORT).show();
                    chat_edit.setText("");
                    return true;
                }
                return false;
            }
        });




    }



}