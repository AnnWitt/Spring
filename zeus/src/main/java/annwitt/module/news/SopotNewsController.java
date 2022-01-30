package annwitt.module.news;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SopotNewsController {

    @GetMapping("/news/sopot")
    public String getPost(){
        return "news.html";
    }
}
