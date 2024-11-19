package com.forms_example.Spring_Forms_rest_example.domain.common;

import java.time.LocalDateTime;

public interface IFeedbackForm {
    String getCategory();
    Integer getSalary();
    String getFormId();
    String getEmail();
    String getPhoneNumber();
    String getGitHubUrl();
    Integer getAge();
    String getCity();
    String getName();
    String getSurname();
    LocalDateTime getCreatedDate();
    FormStatus getStatus();
    void setStatus(FormStatus status);
}
