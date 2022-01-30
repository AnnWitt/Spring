package annwitt.module.home;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

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

      return "home/index.html";
    };

//-----------------------------------------------------------------------------------------------
}
