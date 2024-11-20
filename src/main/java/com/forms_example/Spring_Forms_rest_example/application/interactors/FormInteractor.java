package com.forms_example.Spring_Forms_rest_example.application.interactors;

import com.forms_example.Spring_Forms_rest_example.application.boundaries.IFormFeedbackBoundary;
import com.forms_example.Spring_Forms_rest_example.application.boundaries.IFormPresenter;
import com.forms_example.Spring_Forms_rest_example.application.boundaries.IUrlFormatterService;
import com.forms_example.Spring_Forms_rest_example.application.common.dto.input.FeedbackFormRequest;
import com.forms_example.Spring_Forms_rest_example.application.common.dto.output.FeedbackFormResponse;
import com.forms_example.Spring_Forms_rest_example.application.common.dto.output.FormWithStatusResponse;
import com.forms_example.Spring_Forms_rest_example.application.gateways.IFeedbackFormGateway;
import com.forms_example.Spring_Forms_rest_example.domain.common.IFeedbackForm;
import com.forms_example.Spring_Forms_rest_example.domain.factory.IFormFactory;

public class FormInteractor implements IFormFeedbackBoundary {
    IFormFactory factory;
    IFeedbackFormGateway gateway;
    IUrlFormatterService urlService;
    IFormPresenter presenter;


    public FormInteractor(IFormFactory factory, IFeedbackFormGateway gateway,
                          IUrlFormatterService urlService, IFormPresenter presenter) {
        this.factory = factory;
        this.gateway = gateway;
        this.urlService = urlService;
        this.presenter = presenter;
    }

    public FeedbackFormResponse postForm(FeedbackFormRequest form) throws Exception {
        IFeedbackForm rawForm = factory.create(
                form.getCategory(),
                form.getSurname(),
                form.getName(),
                form.getAge(),
                form.getCity(),
                form.getEmail(),
                form.getPhoneNumber(),
                form.getSalary(),
                form.getGitHubUrl()
        );

        if (rawForm == null) {
            presenter.registerEntityErrorView();
        }

        String formId = null;
        try {
            formId = gateway.addForm(rawForm);
        } catch (Exception e) {
            presenter.registerInternalServerError();
        }

        if (formId != null) {
            String formUrl = urlService.createUrl(formId);
            return presenter.registerSuccessResponse(formUrl);
        } else {
            return null;
        }
    }

    public FormWithStatusResponse getForm(String id) throws Exception {
        IFeedbackForm form = null;
        try {
            form = this.gateway.getForm(id);
        } catch (Exception e) {
            presenter.registerFormNotFoundError();
        }
        return presenter.registerSuccessView(form);
    }
}
