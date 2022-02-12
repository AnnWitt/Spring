package Powtorka.service;

import Powtorka.dto.KrolikDto;
import Powtorka.dto.KrolikPlec;
import annwitt.module.dashboard.dto.CommentDto;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.List;

@Service
public class KrolikService {
    public List<KrolikDto> getKrolik() {
        return List.of(
                (new KrolikDto("krolik1", "bialy", 3, KrolikPlec.female)),
                (new KrolikDto("krolik2", "czarny", 4, KrolikPlec.male)),
                (new KrolikDto("krolik3", "zielony", 1, KrolikPlec.male))
        );
    };
}
