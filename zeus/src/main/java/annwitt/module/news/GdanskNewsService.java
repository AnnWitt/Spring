package annwitt.module.news;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GdanskNewsService implements NewsService{
    @Override
    public List<String> getLastNews() {
        return List.of(
                "news 1 Gdansk",
                "news 2 Gdansk",
                "news 3 Gdansk"
        );
    };
}
