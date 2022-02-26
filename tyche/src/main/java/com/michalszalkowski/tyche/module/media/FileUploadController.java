package com.michalszalkowski.tyche.module.media;

import com.michalszalkowski.tyche.module.media.storage.FileSystemStorage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.support.MultipartFilter;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class FileUploadController {

    @Autowired
    public FileSystemStorage storage;

    @GetMapping({"/media", "/media.html"})
    public String getMediaPage(Model model) {
        model.addAttribute("files",storage.list());
        return "media/index.html";
    }

    @PostMapping({"/media", "/media.html"})
    public String save(@RequestParam("file") MultipartFile file,
                       RedirectAttributes redirectAttributes) {
//jeszczd walidacja powinna tu byc

        storage.store(file);

        redirectAttributes.addFlashAttribute(
                "message",
                "You successfully uploaded " + file.getOriginalFilename()
        );
        return "redirect:/media"; //ważny dwukropek
    }

}