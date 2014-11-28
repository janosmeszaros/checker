package com.vialent.warranty.model;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;
import org.springframework.format.annotation.NumberFormat;

public class InputParameters {

    private static final String NOT_BLANK_MESSAGE = "{notBlank.message}";
    private static final String EMAIL_MESSAGE = "{email.message}";

    @NotBlank(message = InputParameters.NOT_BLANK_MESSAGE)
    @Email(message = InputParameters.EMAIL_MESSAGE)
    private String email;

    @NotBlank(message = InputParameters.NOT_BLANK_MESSAGE)
    private String serial;

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
