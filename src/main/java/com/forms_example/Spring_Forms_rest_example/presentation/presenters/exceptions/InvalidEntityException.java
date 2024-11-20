package com.forms_example.Spring_Forms_rest_example.presentation.presenters.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.UNPROCESSABLE_ENTITY, reason = "Invalid email, phone number or GitHub url")
public class InvalidEntityException extends Exception {

}
