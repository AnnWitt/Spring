package annwitt.Powtorka;

import annwitt.Powtorka.dto.KrolikOneDTO;
import annwitt.Powtorka.service.KrolikOneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class KrolikControler {

    @Autowired
    public KrolikOneService krolikOneService;
/*
    @Autowired
    public KrolikTwo krolikTwo;
    @Autowired
    public KrolikThree krolikThree;
*/

    @GetMapping("/krolik")
    //@RequestMapping("/krolik")
    public String getKrolikOne(Model model){
        KrolikOneDTO krolik1=new KrolikOneDTO("Krolik1","bialy",3,KrolikEnum.female);
        model.addAttribute("Ktory krolik",krolik1);
        return "krolik/krolik.html";
    }

/*    @RequestMapping
    public String getKrolikTwo(Model model){
        model.addAttribute("imie","Krolik pierwszy");
        model.addAttribute("kolor","biały");
        return "krolik two";
    }*/

/*    @RequestMapping
    public String getKrolikThree(){
        return "krolik three";
    }*/

}
