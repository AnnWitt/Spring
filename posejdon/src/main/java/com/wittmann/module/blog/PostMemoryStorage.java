package com.wittmann.module.blog;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostMemoryStorage {
    private static List<PostDto> STORAGE = new ArrayList<>();

    static {
        STORAGE.add(new PostDto("super title","desc"));
        STORAGE.add(new PostDto("super dddd","desc"));
        STORAGE.add(new PostDto("super ssss","desc"));
    }

    public List<PostDto> list() {
        return STORAGE;
    }

    public PostDto one(String uuid) {
        return STORAGE.stream()
                .filter(x -> x.getUuid().equals(uuid))
                .findFirst()
                .get();
    }

    public PostDto create(PostDto post) {
        STORAGE.add(post);
        return post;
    }

    public PostDto create(String title,String text) {
        PostDto post=new PostDto("tytul", "jakistam dtext");
        STORAGE.add(post);
        return post;
    }

    public PostDto create(PostForm form) {
        PostDto post=new PostDto(form.getTitle(), form.getText());
        STORAGE.add(post);
        return post;
    }

}
