package annwitt.module.dashboard;
//dto - package by layer


import annwitt.module.dashboard.dto.ArticleDto;
import annwitt.module.dashboard.dto.CommentDto;
import annwitt.module.dashboard.dto.MenuDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class DashboardController {


    @GetMapping("/dashboard")
    public String getDashboard(Model model){

        List<MenuDto> menu = List.of(
                new MenuDto("Home", "/"),
                new MenuDto("Dashboard", "/dashboard"),
                new MenuDto("About Us", "/about-us")
        );

        List<CommentDto> comments = List.of(
                new CommentDto("admin", "lorem 1"),
                new CommentDto("michal", "lorem 2"),
                new CommentDto("marta", "lorem 3")
        );

        ArticleDto article = new ArticleDto()
                .setTitle("First")
                .setText("lorem ipsum")
                .setComments(comments);



        model.addAttribute("menu",menu);
        model.addAttribute("article",article);

        return "dashboard/index.html";
    }




}
