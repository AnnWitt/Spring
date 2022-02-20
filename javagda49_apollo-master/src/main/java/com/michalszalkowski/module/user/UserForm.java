package com.michalszalkowski.module.user;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class UserForm {

    @NotBlank(message = "Name is required")
    private String name;

    @CompanyConstraint //wlasne napisane
    private String company;

    @NotNull(message = "Surname is required")
    private String surname;

    @NotEmpty(message = "Email is required")
    @Email(message = "Email is not valid")
    private String email;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }


    public String getCompany() {
        return company;
    }
}