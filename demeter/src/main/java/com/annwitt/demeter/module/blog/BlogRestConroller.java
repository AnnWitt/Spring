package com.annwitt.demeter.module.blog;

import com.annwitt.demeter.module.blog.menu.MenuDto;
import com.annwitt.demeter.module.blog.menu.MenuServise;
import com.annwitt.demeter.module.blog.post.PostDto;
import com.annwitt.demeter.module.blog.post.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BlogRestConroller {
    @Autowired
    private MenuServise menuServise;
    @Autowired
    private PostService postService;

    @GetMapping("/api/blog/menu")
    public List<MenuDto> getMenu(){
        return  menuServise.getMenu();
    }

    @GetMapping("/api/blog/posts")
    public List<PostDto> getPosts(){
        return  postService.getPosts();
    }


}

/*

dla urzadzen mobilnych
BlogRestControler
        :white_check_mark:
        3

        3:50
        TEST - localhost:8080/api/blog/menu
        :white_check_mark:
        4

        3:50
        TEST localhost:8080/api/blog/posts*/
