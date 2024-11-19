package com.forms_example.Spring_Forms_rest_example.application.interactors;

import com.forms_example.Spring_Forms_rest_example.application.boundaries.IFormFeedbackBoundary;
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


    public FormInteractor(IFormFactory factory, IFeedbackFormGateway gateway,
                          IUrlFormatterService urlService) {
        this.factory = factory;
        this.gateway = gateway;
        this.urlService = urlService;
    }

    public FeedbackFormResponse postForm(FeedbackFormRequest form) {
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
            return null;
        }

        String formId = gateway.addForm(rawForm);
        String formUrl = urlService.createUrl(formId);
        return new FeedbackFormResponse(formUrl);
    }

    public FormWithStatusResponse getForm(String id) {
        IFeedbackForm form = this.gateway.getForm(id);
        if ( form == null ) {
            return null;
        }
        System.out.println(form);
        return new FormWithStatusResponse(form);
    }
}
