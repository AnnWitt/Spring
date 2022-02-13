package com.wittmann.module.blog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BlogPostController {

    @Autowired
    private PostMemoryStorage postMemoryStorage;

    @RequestMapping(path = "/blog/posts", method = RequestMethod.GET)
    public String getPostList(Model model) {

        model.addAttribute("postForm", new PostForm());
        model.addAttribute("posts", postMemoryStorage.list());

        return "blog/posts.html";
    }

    //---------------- bedzie przyjmowal postForma
    @RequestMapping(path = "/blog/posts", method = RequestMethod.POST)
    public String createPost(PostForm form) {
        /*PostDto newPost=postMemoryStorage.create(
                new PostDto(form.getTitle(), form.getText())*/
        PostDto newPost=postMemoryStorage.create(form);

      //  return "redirect:/blog/posts" + "0-1-2-3";
        return "redirect:/blog/posts/" + newPost.getUuid();
    }

    @RequestMapping(path = "blog/posts/{uuid}", method = RequestMethod.GET)
    public String getPost(@PathVariable("uuid") String uuid, Model model) {
       // model.addAttribute("post", uuid);
        model.addAttribute("post", postMemoryStorage.one(uuid));
        //
        return "blog/post.html";
    }


}
