package com.michalszalkowski.module.config;

import com.michalszalkowski.module.core.ApplicationConfig;
import com.michalszalkowski.module.core.ApplicationConfigDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigRestController {

    @Autowired
    private ApplicationConfig applicationConfig;

    @GetMapping("/api/config") //po przecinku mozna drugi url np "/api/config2
    public ApplicationConfigDto getConfig(){
        return applicationConfig.asDto();
    }
}
