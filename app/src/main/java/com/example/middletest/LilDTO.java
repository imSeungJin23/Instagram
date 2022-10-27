package com.example.middletest;

import android.graphics.drawable.Drawable;

import com.bumptech.glide.RequestBuilder;

public class LilDTO {


    private int lil_proimg ;
    private String lil_id, text_heart ,chat_num, lil, lil_music,Lil_content;

    public LilDTO(int lil_proimg, String lil_id, String text_heart, String chat_num, String lil, String lil_music, String lil_content) {
        this.lil_proimg = lil_proimg;
        this.lil_id = lil_id;
        this.text_heart = text_heart;
        this.chat_num = chat_num;
        this.lil = lil;
        this.lil_music = lil_music;
        Lil_content = lil_content;
    }

    public int getLil_proimg() {
        return lil_proimg;
    }

    public void setLil_proimg(int lil_proimg) {
        this.lil_proimg = lil_proimg;
    }

    public String getLil_id() {
        return lil_id;
    }

    public void setLil_id(String lil_id) {
        this.lil_id = lil_id;
    }

    public String getText_heart() {
        return text_heart;
    }

    public void setText_heart(String text_heart) {
        this.text_heart = text_heart;
    }

    public String getChat_num() {
        return chat_num;
    }

    public void setChat_num(String chat_num) {
        this.chat_num = chat_num;
    }

    public String getLil() {
        return lil;
    }

    public void setLil(String lil) {
        this.lil = lil;
    }

    public String getLil_music() {
        return lil_music;
    }

    public void setLil_music(String lil_music) {
        this.lil_music = lil_music;
    }

    public String getLil_content() {
        return Lil_content;
    }

    public void setLil_content(String lil_content) {
        Lil_content = lil_content;
    }
}
