package annwitt.module.dashboard.service;

import annwitt.module.dashboard.dto.CommentDto;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CommentService {

    public List<CommentDto> getComments() {
        return List.of(
                new CommentDto("admin", "lorem 1"),
                new CommentDto("michal", "lorem 2"),
                new CommentDto("marta", "lorem 3"));
    }
}
