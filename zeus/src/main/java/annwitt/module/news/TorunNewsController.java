package annwitt.module.news;

import org.springframework.web.bind.annotation.GetMapping;

public class TorunNewsController {

    @GetMapping("/news/torun")
    public String getPost(){
        return "news.html";
    }


}
