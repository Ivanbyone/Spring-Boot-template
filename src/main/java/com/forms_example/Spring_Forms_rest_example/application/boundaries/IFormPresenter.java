package com.forms_example.Spring_Forms_rest_example.application.boundaries;

import com.forms_example.Spring_Forms_rest_example.application.common.dto.output.FeedbackFormResponse;
import com.forms_example.Spring_Forms_rest_example.application.common.dto.output.FormWithStatusResponse;
import com.forms_example.Spring_Forms_rest_example.domain.common.IFeedbackForm;
import com.forms_example.Spring_Forms_rest_example.presentation.presenters.exceptions.FormNotFound;
import com.forms_example.Spring_Forms_rest_example.presentation.presenters.exceptions.InternalServerError;
import com.forms_example.Spring_Forms_rest_example.presentation.presenters.exceptions.InvalidEntityException;

public interface IFormPresenter {
    FeedbackFormResponse registerSuccessResponse(String url);
    FormWithStatusResponse registerSuccessView(IFeedbackForm form);
    void registerEntityErrorView() throws Exception;
    void registerInternalServerError() throws Exception;
    void registerFormNotFoundError() throws FormNotFound;
}
