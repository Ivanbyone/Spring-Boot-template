package com.forms_example.Spring_Forms_rest_example.presentation.presenters;

import com.forms_example.Spring_Forms_rest_example.application.boundaries.IFormPresenter;
import com.forms_example.Spring_Forms_rest_example.application.common.dto.output.FeedbackFormResponse;
import com.forms_example.Spring_Forms_rest_example.application.common.dto.output.FormWithStatusResponse;
import com.forms_example.Spring_Forms_rest_example.domain.common.IFeedbackForm;
import com.forms_example.Spring_Forms_rest_example.presentation.presenters.exceptions.FormNotFound;
import com.forms_example.Spring_Forms_rest_example.presentation.presenters.exceptions.InternalServerError;
import com.forms_example.Spring_Forms_rest_example.presentation.presenters.exceptions.InvalidEntityException;

public class FormPresenter implements IFormPresenter {

    @Override
    public FeedbackFormResponse registerSuccessResponse(String url) {
        return new FeedbackFormResponse(url);
    }

    @Override
    public FormWithStatusResponse registerSuccessView(IFeedbackForm form) {
        return new FormWithStatusResponse(form);
    }

    @Override
    public void registerEntityErrorView() throws InvalidEntityException {
        throw new InvalidEntityException();
    }

    @Override
    public void registerInternalServerError() throws InternalServerError {
        throw new InternalServerError("Runtime exception");
    }

    @Override
    public void registerFormNotFoundError() throws FormNotFound {
        throw new FormNotFound("The form has not been created");
    }
}
