package com.michalszalkowski.module.user;

import com.michalszalkowski.module.user.UserForm;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class UserRestController {

    @PostMapping("/api/user")
    public UserForm validate(
            @Valid @RequestBody UserForm form) {
        return form;
    }

}