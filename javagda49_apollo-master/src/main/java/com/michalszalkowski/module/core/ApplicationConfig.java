package com.michalszalkowski.module.core;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;

@Configuration
public class ApplicationConfig {

    //moga sie zaczytać wartosci
    @Value("${domain}") private String domain; //@value odniesienie do properties
    @Value("${email}")private String email;
    @Value("${user}")private String user;
    @Value("${theme}")private String theme;

    public ApplicationConfigDto asDto() {
        return new ApplicationConfigDto()
                .setDomain(domain)
                .setEmail(email)
                .setUser(user)
                .setTheme(theme);
    }
}
