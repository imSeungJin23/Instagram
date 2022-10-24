package com.example.middletest;

public class InstaDTO {
    private int pro_img , content_img ,repl_my_img ;
    private String nick_name,nickname2, location,content_text;

    public InstaDTO(int pro_img, int content_img, int repl_my_img, String nick_name, String nickname2, String location, String content_text) {
        this.pro_img = pro_img;
        this.content_img = content_img;
        this.repl_my_img = repl_my_img;
        this.nick_name = nick_name;
        this.nickname2 = nickname2;
        this.location = location;
        this.content_text = content_text;
    }

    public int getPro_img() {
        return pro_img;
    }

    public void setPro_img(int pro_img) {
        this.pro_img = pro_img;
    }

    public int getContent_img() {
        return content_img;
    }

    public void setContent_img(int content_img) {
        this.content_img = content_img;
    }

    public int getRepl_my_img() {
        return repl_my_img;
    }

    public void setRepl_my_img(int repl_my_img) {
        this.repl_my_img = repl_my_img;
    }

    public String getNick_name() {
        return nick_name;
    }

    public void setNick_name(String nick_name) {
        this.nick_name = nick_name;
    }

    public String getNickname2() {
        return nickname2;
    }

    public void setNickname2(String nickname2) {
        this.nickname2 = nickname2;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getContent_text() {
        return content_text;
    }

    public void setContent_text(String content_text) {
        this.content_text = content_text;
    }
}
