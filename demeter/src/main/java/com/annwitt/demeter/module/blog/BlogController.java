package com.annwitt.demeter.module.blog;

import com.annwitt.demeter.module.blog.menu.MenuServise;
import com.annwitt.demeter.module.blog.post.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BlogController {

    @Autowired
    private MenuServise menuServise;
    @Autowired
    private PostService postService;

    @GetMapping("/blog")
    public String getBlog(Model model){
        model.addAttribute("menuItems",
                menuServise.getMenu());
        model.addAttribute("posts",
                postService.getPosts());
        return "blog/index.html";
    }



 /*   @GetMapping("/blog/parts")*/
    @GetMapping("/blog/fragment")
    public String getBlogHead(){
        //return "blog/parts/";
        return "blog/fragment/";
    }


}
