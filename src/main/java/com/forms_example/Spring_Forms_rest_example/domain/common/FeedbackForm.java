package com.forms_example.Spring_Forms_rest_example.domain.common;

import java.time.LocalDateTime;
import java.util.UUID;
import java.util.regex.Pattern;

public class FeedbackForm implements IFeedbackForm {
    private final String category;
    private final String formId;
    private final String surname;
    private final String name;
    private final Integer age;
    private final String city;
    private final String email;
    private final String phoneNumber;
    private final Integer salary;
    private final String gitHubUrl;
    private final LocalDateTime createdDate;
    private FormStatus status;

    public FeedbackForm(String category, String surname, String name, Integer age, String city,
                        String email, String phoneNumber, Integer salary, String gitHubUrl) {
        this.category = category;
        this.formId = UUID.randomUUID().toString();
        this.surname = surname;
        this.name = name;
        this.age = age;
        this.city = city;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.gitHubUrl = gitHubUrl;
        this.createdDate = LocalDateTime.now();
        this.status = FormStatus.NEW;
    }

    public FeedbackForm(String formId, String category, String surname, String name, String age,
                        String city, String email, String phoneNumber, String salary, String gitHubUrl,
                        LocalDateTime createdDate, String status) {
        this.formId = formId;
        this.category = category;
        this.surname = surname;
        this.name = name;
        this.age = Integer.parseInt(age);
        this.city = city;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = Integer.parseInt(salary);
        this.gitHubUrl = gitHubUrl;
        this.createdDate = createdDate;
        this.status = FormStatus.valueOf(status);
    }

    public static boolean isEmailValid(String email) {
        if (email == null || email.isEmpty()) {
            return false;
        }

        String emailPattern = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        Pattern emailValidation = Pattern.compile(emailPattern);

        return emailValidation.matcher(email).matches();
    }

    public static boolean isPhoneValid(String phoneNumber) {
        if (phoneNumber == null || phoneNumber.isEmpty()) {
            return false;
        }

        String phonePattern = "^\\+7\\d{10}$";
        Pattern phoneValidation = Pattern.compile(phonePattern);

        return phoneValidation.matcher(phoneNumber).matches();
    }

    public static boolean isGitUrlValid(String url) {
        if (url == null || url.isEmpty()) {
            return false;
        }

        String urlPattern = "https://github+\\.com/+[a-zA-Z0-9._]+";
        Pattern urlValidation = Pattern.compile(urlPattern);

        return urlValidation.matcher(url).matches();
    }

    @Override
    public String getCategory() {
        return category;
    }

    @Override
    public Integer getSalary() {
        return salary;
    }

    @Override
    public String getFormId() {
        return formId;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String getGitHubUrl() {
        return gitHubUrl;
    }

    @Override
    public Integer getAge() {
        return age;
    }

    @Override
    public String getCity() {
        return city;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getSurname() {
        return surname;
    }

    @Override
    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    @Override
    public FormStatus getStatus() {
        return status;
    }

    @Override
    public void setStatus(FormStatus status) {
        this.status = status;
    }
}
