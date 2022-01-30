package annwitt.module.dashboard.service;

import annwitt.module.dashboard.dto.ArticleDto;
import annwitt.module.dashboard.dto.CommentDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ArticleService {

    @Autowired
    private CommentService commentService;

    public ArticleDto getArticle() {
        List<CommentDto> comments = commentService.getComments();
        return new ArticleDto()
                .setTitle("Lorem ipsum")
                .setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Duis pellentesque gravida dui, a faucibus risus hendrerit sit amet. Donec vel ex ac quam iaculis consequat vel nec nisl. Pellentesque non massa commodo, imperdiet turpis et, vestibulum neque. Nullam sollicitudin, nisl id euismod consectetur, urna erat volutpat neque, nec faucibus nisi arcu eu tellus. Duis rhoncus vestibulum ultrices. Morbi eget bibendum massa, in imperdiet augue. Quisque dapibus nunc a purus porta, sed fermentum massa volutpat. Cras placerat molestie nibh ut tincidunt. In ac nibh ac tortor suscipit sollicitudin. ")
                .setComments(comments);
    }

}

