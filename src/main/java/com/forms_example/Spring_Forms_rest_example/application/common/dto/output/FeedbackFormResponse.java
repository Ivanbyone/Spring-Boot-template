package com.forms_example.Spring_Forms_rest_example.application.common.dto.output;

import com.forms_example.Spring_Forms_rest_example.domain.common.IFeedbackForm;

public class FeedbackFormResponse {
    private String formUrl;

    public FeedbackFormResponse (String url) {
        this.formUrl = url;
    }

    public String getFormUrl() {
        return formUrl;
    }

    public void setFormUrl(String formUrl) {
        this.formUrl = formUrl;
    }
}
