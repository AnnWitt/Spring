package com.wittmann.module.blog;

public class PostForm { //bez id bo nddamy
    private String title;
    private String text;
//będzie robiony przez automapping dlatego nie ma konstruktora

    public String getTitle() {
        return title;
    }
    public String getText() {
        return text;
    }

    public PostForm setTitle(String title) {
        this.title = title;
        return this;
    }
    public PostForm setText(String text) {
        this.text = text;
        return this;
    }
}
