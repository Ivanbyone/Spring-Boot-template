package com.forms_example.Spring_Forms_rest_example.application.boundaries;

import com.forms_example.Spring_Forms_rest_example.application.common.dto.input.FeedbackFormRequest;
import com.forms_example.Spring_Forms_rest_example.application.common.dto.output.FeedbackFormResponse;
import com.forms_example.Spring_Forms_rest_example.application.common.dto.output.FormWithStatusResponse;

public interface IFormFeedbackBoundary {
    FeedbackFormResponse postForm(FeedbackFormRequest form);
    FormWithStatusResponse getForm(String id);
}
