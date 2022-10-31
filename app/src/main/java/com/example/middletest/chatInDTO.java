package com.example.middletest;

public class chatInDTO {

    private  int chat_pro,chat_fav;
    private String chat_id, chat_time, chat_text;


    public chatInDTO(int chat_pro, int chat_fav, String chat_id, String chat_time, String chat_text) {
        this.chat_pro = chat_pro;
        this.chat_fav = chat_fav;
        this.chat_id = chat_id;
        this.chat_time = chat_time;
        this.chat_text = chat_text;
    }

    public int getChat_pro() {
        return chat_pro;
    }

    public void setChat_pro(int chat_pro) {
        this.chat_pro = chat_pro;
    }

    public int getChat_fav() {
        return chat_fav;
    }

    public void setChat_fav(int chat_fav) {
        this.chat_fav = chat_fav;
    }

    public String getChat_id() {
        return chat_id;
    }

    public void setChat_id(String chat_id) {
        this.chat_id = chat_id;
    }

    public String getChat_time() {
        return chat_time;
    }

    public void setChat_time(String chat_time) {
        this.chat_time = chat_time;
    }

    public String getChat_text() {
        return chat_text;
    }

    public void setChat_text(String chat_text) {
        this.chat_text = chat_text;
    }
}
