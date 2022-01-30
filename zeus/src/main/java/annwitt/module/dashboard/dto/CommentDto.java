package annwitt.module.dashboard.dto;

public class CommentDto {
    private  String text;
    private  String autor;

    public CommentDto(String text, String autor) {
        this.text = text;
        this.autor = autor;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "CommentDto{" +
                "text='" + text + '\'' +
                ", autor='" + autor + '\'' +
                '}';
    }
}
