package com.forms_example.Spring_Forms_rest_example.application.common.dto.output;

import com.forms_example.Spring_Forms_rest_example.domain.common.IFeedbackForm;

public class FormWithStatusResponse {
    private IFeedbackForm form;

    public FormWithStatusResponse(IFeedbackForm form) {
        this.form = form;
    }

    public IFeedbackForm getForm() {
        return form;
    }

    public void setForm(IFeedbackForm form) {
        this.form = form;
    }
}
