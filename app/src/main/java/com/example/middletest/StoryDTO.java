package com.example.middletest;

public class StoryDTO {
    private String story_id;
    private int story_img;

    public StoryDTO(String story_id, int story_img) {
        this.story_id = story_id;
        this.story_img = story_img;
    }

    public String getStory_id() {
        return story_id;
    }

    public void setStory_id(String story_id) {
        this.story_id = story_id;
    }

    public int getStory_img() {
        return story_img;
    }

    public void setStory_img(int story_img) {
        this.story_img = story_img;
    }
}
