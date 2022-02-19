package com.annwitt.demeter.module.blog.menu;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuServise {

    public List<MenuDto> getMenu() {
        return List.of(
                new MenuDto("dynamic home"),
                new MenuDto("dynamic world"),
                new MenuDto("dynamic technology"),
                new MenuDto("dynamic Science"),
                new MenuDto("dynamic design"),
                new MenuDto("dynamic contact")
        );
    }

}
