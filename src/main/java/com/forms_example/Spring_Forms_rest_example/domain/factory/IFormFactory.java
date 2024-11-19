package com.forms_example.Spring_Forms_rest_example.domain.factory;

import com.forms_example.Spring_Forms_rest_example.domain.common.IFeedbackForm;

import java.time.LocalDateTime;

public interface IFormFactory {
    IFeedbackForm create(String category, String surname, String name, Integer age, String city,
                         String email, String phoneNumber, Integer salary, String gitHubUrl);
}
