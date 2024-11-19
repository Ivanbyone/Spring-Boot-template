package com.forms_example.Spring_Forms_rest_example.domain.factory;

import com.forms_example.Spring_Forms_rest_example.domain.common.FeedbackForm;
import com.forms_example.Spring_Forms_rest_example.domain.common.IFeedbackForm;

public class FormFactory implements IFormFactory {

    @Override
    public IFeedbackForm create(String category, String surname, String name, Integer age, String city,
                                String email, String phoneNumber, Integer salary, String gitHubUrl) {
        if (FeedbackForm.isEmailValid(email) && FeedbackForm.isGitUrlValid(gitHubUrl) &&
                FeedbackForm.isPhoneValid(phoneNumber)) {
            return new FeedbackForm(category, surname, name, age, city, email, phoneNumber, salary,
                    gitHubUrl);
        } else {
            return null;
        }
    }
}
