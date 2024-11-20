package com.forms_example.Spring_Forms_rest_example.presentation.controllers;

import com.forms_example.Spring_Forms_rest_example.application.boundaries.IFormFeedbackBoundary;
import com.forms_example.Spring_Forms_rest_example.application.common.dto.input.FeedbackFormRequest;
import com.forms_example.Spring_Forms_rest_example.application.common.dto.output.FeedbackFormResponse;
import com.forms_example.Spring_Forms_rest_example.application.common.dto.output.FormWithStatusResponse;
import com.forms_example.Spring_Forms_rest_example.presentation.presenters.exceptions.FormNotFound;
import com.forms_example.Spring_Forms_rest_example.presentation.presenters.exceptions.InternalServerError;
import com.forms_example.Spring_Forms_rest_example.presentation.presenters.exceptions.InvalidEntityException;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/v1/feedback-form")
@ApiResponses(@ApiResponse(responseCode = "200", useReturnTypeSchema = true))
public class FeedbackFormController {
    IFormFeedbackBoundary formFeedbackBoundary;

    public FeedbackFormController(IFormFeedbackBoundary formFeedbackBoundary) {
        this.formFeedbackBoundary = formFeedbackBoundary;
    }

    @PostMapping(value = "/create")
    @ApiResponse(responseCode = "422", content = @Content(
            schema = @Schema(implementation = InvalidEntityException.class)))
    @ApiResponse(responseCode = "500", content = @Content(
            schema = @Schema(implementation = InternalServerError.class)))
    public FeedbackFormResponse PostFeedbackForm(@RequestBody FeedbackFormRequest form) throws Exception {
        return this.formFeedbackBoundary.postForm(form);
    }

    @GetMapping(value = "/{id}")
    @ApiResponse(responseCode = "404", content = @Content(
            schema = @Schema(implementation = FormNotFound.class)))
    public FormWithStatusResponse GetFeedbackForm(@PathVariable String id) throws Exception {
        return this.formFeedbackBoundary.getForm(id);
    }
}
