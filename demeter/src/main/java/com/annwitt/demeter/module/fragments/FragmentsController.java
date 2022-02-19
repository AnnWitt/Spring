package com.annwitt.demeter.module.fragments;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FragmentsController {


    @GetMapping("/fragments") //to w przegladarce
    public String getFragmentsExample() {
        return "fragments/index.html"; //plik z resources
    }

    @GetMapping("/fragments/about-me")
    public String getFragmentsExampleAboutMe() {
        return "fragments/aboutme.html";
    }


}
