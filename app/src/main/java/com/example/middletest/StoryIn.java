package com.example.middletest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class StoryIn extends AppCompatActivity {
        ImageView storyIn_exit, storyIn_fav;
        EditText storyIn_msg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story_in);

        storyIn_exit = findViewById(R.id.storyIn_exit);
        storyIn_fav = findViewById(R.id.storyIn_fav);
        storyIn_msg = findViewById(R.id.storyIn_msg);
        storyIn_exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }

        });
        storyIn_fav.setOnClickListener(new View.OnClickListener() {
            int favInt = 0;

            @Override
            public void onClick(View v) {

                if (favInt == 0) {
                    storyIn_fav.setImageResource(R.drawable.ic_baseline_favoritefull_24);
                    favInt++;
                } else if (favInt == 1) {
                    storyIn_fav.setImageResource(R.drawable.ic_baseline_favorite_border_24white);
                    favInt--;
                }


            }
        });
        storyIn_msg.setOnEditorActionListener(new TextView.OnEditorActionListener()
        {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event)
            {
                if(actionId == EditorInfo.IME_ACTION_DONE)
                {
                    Toast.makeText(StoryIn.this,"메세지 전송 되었습니다",Toast.LENGTH_SHORT).show();
                    storyIn_msg.setText("");
                    return true;
                }
                return false;
            }
        });
    }
}