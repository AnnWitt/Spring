package annwitt.module.dashboard;
//dto - package by layer


import annwitt.module.dashboard.service.ArticleService;
import annwitt.module.dashboard.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DashboardController {

@Autowired
public MenuService menuService;

    @Autowired
    private ArticleService articleService;

    @GetMapping("/dashboard")
    public String getDashboard(Model model){

        model.addAttribute("menu",menuService.getMenu());
        model.addAttribute("article",articleService.getArticle());

        return "dashboard/index.html";
    }




}
