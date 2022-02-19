package com.annwitt.demeter.module.cms;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CmsController {

    @GetMapping("/cms/page") //to w przegladarce,
    public String getFragmentsExample() {
        return "cms/page.html"; //plik z resources, template
    }

    @GetMapping("/cms/sub-page")
    public String getFragmentsExampleAboutMe() {
        return "cms/sub-page.html";
    }
}
