package com.forms_example.Spring_Forms_rest_example.presentation.presenters.exceptions;

public class InternalServerError extends RuntimeException {
    public InternalServerError(String message) {
        super(message);
    }
}
