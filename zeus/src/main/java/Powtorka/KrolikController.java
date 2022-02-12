package Powtorka;

import Powtorka.dto.KrolikDto;
import Powtorka.dto.KrolikPlec;
import Powtorka.service.KrolikService;
import annwitt.module.home.PersonDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class KrolikController {

    @Autowired
    public KrolikService krolikService;

    @GetMapping
    public String getKrolik(Model modelkrolik) {

        modelkrolik.addAttribute("imie", krolikService.getKrolik());
        modelkrolik.addAttribute("kolor", krolikService.getKrolik());
        modelkrolik.addAttribute("wiek", krolikService.getKrolik());
        modelkrolik.addAttribute("plec", krolikService.getKrolik());


  /*      modelkrolik.addAttribute("imie", "Imie Krolika z controllera");
        modelkrolik.addAttribute("kolor", "Kolor królika controllera");
        modelkrolik.addAttribute("wiek", 2);
        modelkrolik.addAttribute("plec", KrolikPlec.female);
        pojedynczy
*/

    /*    List<KrolikDto> krolikilista = List.of(
                (new KrolikDto("krolik1", "bialy", 3, KrolikPlec.female)),
                (new KrolikDto("krolik2", "czarny", 4, KrolikPlec.male)),
                (new KrolikDto("krolik3", "zielony", 1, KrolikPlec.male)));*/

        //modelkrolik.addAttribute("krolikilista",);
        return "krolik/krolikstrona.html";
    }

}
