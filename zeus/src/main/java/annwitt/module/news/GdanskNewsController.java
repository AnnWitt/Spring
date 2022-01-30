package annwitt.module.news;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GdanskNewsController {

    @Autowired
    @Qualifier("gdanskNewsService")
private NewsService newsService;

    @GetMapping("/news/gdansk")//polaczenie urli z odpowiednimi servisami
    public String getPost(Model model){
        model.addAttribute("news", newsService.getLastNews());
        return "news.html";
    }
}
