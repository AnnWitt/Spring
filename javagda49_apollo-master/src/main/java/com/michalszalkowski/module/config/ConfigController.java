package com.michalszalkowski.module.config;

import com.michalszalkowski.module.config.location.ApplicationConfigService;
import com.michalszalkowski.module.core.ApplicationConfig;
import com.michalszalkowski.module.core.ApplicationConfigDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ConfigController {

    @Autowired
    public ApplicationConfig applicationConfig;

    @Autowired
    public ApplicationConfigService applicationConfigService;

    @GetMapping("/config")
    public String getConfig(Model model){
        model.addAttribute("config",applicationConfig.asDto());
        model.addAttribute("location",applicationConfigService.getLocation());
        return "config.html";
    };


}
