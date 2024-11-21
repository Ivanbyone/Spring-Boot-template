package com.forms_example.Spring_Forms_rest_example.presentation.presenters.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.INTERNAL_SERVER_ERROR, reason = "Internal Server Error")
public class InternalServerError extends Exception {
    public InternalServerError(String message) {
        super(message);
    }
}
