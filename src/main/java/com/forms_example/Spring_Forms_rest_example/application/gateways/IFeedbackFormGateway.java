package com.forms_example.Spring_Forms_rest_example.application.gateways;

import com.forms_example.Spring_Forms_rest_example.domain.common.IFeedbackForm;

public interface IFeedbackFormGateway {
    String addForm(IFeedbackForm form);
    IFeedbackForm getForm(String id);
}
