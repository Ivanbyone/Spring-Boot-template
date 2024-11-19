package com.forms_example.Spring_Forms_rest_example.presentation.controllers;

import com.forms_example.Spring_Forms_rest_example.application.boundaries.IFormFeedbackBoundary;
import com.forms_example.Spring_Forms_rest_example.application.common.dto.input.FeedbackFormRequest;
import com.forms_example.Spring_Forms_rest_example.application.common.dto.output.FeedbackFormResponse;
import com.forms_example.Spring_Forms_rest_example.application.common.dto.output.FormWithStatusResponse;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/v1/feedback-form")
public class FeedbackFormController {
    IFormFeedbackBoundary formFeedbackBoundary;

    public FeedbackFormController(IFormFeedbackBoundary formFeedbackBoundary) {
        this.formFeedbackBoundary = formFeedbackBoundary;
    }

    @PostMapping(value = "/create")
    public FeedbackFormResponse PostFeedbackForm(@RequestBody FeedbackFormRequest form) {
        return this.formFeedbackBoundary.postForm(form);
    }

    @GetMapping(value = "/{id}")
    public FormWithStatusResponse GetFeedbackForm(@PathVariable String id) {
        return this.formFeedbackBoundary.getForm(id);
    }
}
