package annwitt.module.dashboard.dto;

import java.util.ArrayList;
import java.util.List;

public class ArticleDto {
    private String title;
    private String text;
    private List<CommentDto> comments =new ArrayList<>();

    public ArticleDto() {
        this.title = title;
        this.text = text;
        this.comments = comments;
    }

    public String getTitle() {
        return title;
    }

    //settery builered, ladniej mozna budowac
    public ArticleDto setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getText() {
        return text;
    }

    public ArticleDto setText(String text) {
        this.text = text;
        return this;
    }

    public List<CommentDto> getComments() {
        return comments;
    }

    public ArticleDto setComments(List<CommentDto> comments) {
        this.comments = comments;
        return this;
    }

    @Override
    public String toString() {
        return "ArticleDto{" +
                "title='" + title + '\'' +
                ", text='" + text + '\'' +
                ", comments=" + comments +
                '}';
    }
}
