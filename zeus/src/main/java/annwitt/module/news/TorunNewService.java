package annwitt.module.news;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TorunNewService implements NewsService{
    @Override
    public List<String> getLastNews() {
        return List.of(
                "news 1 Torun",
                "news 2 Torun",
                "news 3 Torun"
        );
    };
}
