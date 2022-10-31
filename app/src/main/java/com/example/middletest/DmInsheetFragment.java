package com.example.middletest;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.bottomsheet.BottomSheetDialogFragment;


public class DmInsheetFragment extends BottomSheetDialogFragment {
    Button dm_in_btn;
    EditText dm_in_msg;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_dm_insheet, container, false);


        dm_in_btn = v.findViewById(R.id.dm_in_btn);
        dm_in_msg = v.findViewById(R.id.dm_in_msg);

        dm_in_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(dm_in_msg.getHint() != null){
                     Toast.makeText(getContext(),"메세지 전송 되었습니다",Toast.LENGTH_SHORT).show();
                     dm_in_msg.setText("");
                }else{
                    Toast.makeText(getContext(),"메세지를 입력해주세요",Toast.LENGTH_SHORT).show();
                }

            }
        });


        return v;
    }
}