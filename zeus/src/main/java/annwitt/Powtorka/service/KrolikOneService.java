package annwitt.Powtorka.service;

import annwitt.Powtorka.KrolikEnum;
import annwitt.Powtorka.dto.KrolikOneDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KrolikOneService {

public List<KrolikOneDTO> getKrolik() {
    return List.of(
        new KrolikOneDTO("imieservis","kolorserv",3, KrolikEnum.male)
    );

    }
}
