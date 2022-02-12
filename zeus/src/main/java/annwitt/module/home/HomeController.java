package annwitt.module.home;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller //kontroler zwykly, to zwracane bedzie szukal q folderze twmplate
public class HomeController {

    @GetMapping //aby obsluzyl request przegladarki
    //@GetMapping ({"/" , "/home", "/dashboard-> na jakie sciezki ma reagowac}), brak wplywu na strukture pliku
   //na taloe wuystawione ze świata np jak sie wpisze url/dashboard i wtedy bedzie szukal pliku html
    public String getHome(Model model ){

        //strings
        model.addAttribute("name","model imię");
        model.addAttribute("surname","model nazwisko");
        //atribute name to klucz, pod nim wrzuca sie value
     // return "home.html";

        //object
        model.addAttribute("person",new PersonDto("obiektImie", "obiekt nazwisko", 36));

        /*list*/
        List<Object> persons=new ArrayList<>();
        persons.add(new PersonDto("Imie1","nazwisko1", 43));
        persons.add(new PersonDto("Imie2","nazwisko2", 23));
        persons.add(new PersonDto("Imie3","nazwisko3", 40));
        model.addAttribute("persons",persons);

      return "home/index.html";
     // return "home.html";
    };

//-----------------------------------------------------------------------------------------------
}
