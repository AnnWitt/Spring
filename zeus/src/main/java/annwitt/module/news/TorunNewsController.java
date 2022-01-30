package annwitt.module.news;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TorunNewsController {

    @Autowired
    @Qualifier("torunNewService")
    private NewsService newsService;

    @GetMapping("/news/torun")
    public String getPost(Model model){
        model.addAttribute("news", newsService.getLastNews());
        return "news.html";
    }




}
