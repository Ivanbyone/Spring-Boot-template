package com.forms_example.Spring_Forms_rest_example.presentation.presenters.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Object isn't found")
public class FormNotFound extends Exception {
    public FormNotFound(String message) {
        super(message);
    }
}
