package com.michalszalkowski.tyche.module.media;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FileUploadController {

    @GetMapping({"/media","/media.html"})
    public String getMediaPage() {
        return "media/index.html";
    }

}