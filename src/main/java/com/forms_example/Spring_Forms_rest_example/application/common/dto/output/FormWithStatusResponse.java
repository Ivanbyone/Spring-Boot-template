package com.forms_example.Spring_Forms_rest_example.application.common.dto.output;

import com.forms_example.Spring_Forms_rest_example.domain.common.IFeedbackForm;

import java.time.LocalDateTime;

public class FormWithStatusResponse {
    private final String formId;
    private final String category;
    private final String surname;
    private final String name;
    private final Integer age;
    private final String city;
    private final String email;
    private final String phoneNumber;
    private final Integer salary;
    private final String GitHubUrl;
    private final LocalDateTime createdDate;
    private final String status;

    public FormWithStatusResponse(IFeedbackForm form) {
        this.formId = form.getFormId();
        this.category = form.getCategory();
        this.surname = form.getSurname();
        this.name = form.getName();
        this.age = form.getAge();
        this.city = form.getCity();
        this.email = form.getEmail();
        this.phoneNumber = form.getPhoneNumber();
        this.salary = form.getSalary();
        this.GitHubUrl = form.getGitHubUrl();
        this.createdDate = form.getCreatedDate();
        this.status = form.getStatus().toString();
    }

    public Integer getSalary() {
        return salary;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getGitHubUrl() {
        return GitHubUrl;
    }

    public String getSurname() {
        return surname;
    }

    public String getCategory() {
        return category;
    }

    public String getEmail() {
        return email;
    }

    public String getFormId() {
        return formId;
    }

    public Integer getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }

    public String getName() {
        return name;
    }

    public String getStatus() {
        return status;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }
}
