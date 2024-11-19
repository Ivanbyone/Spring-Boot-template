package com.forms_example.Spring_Forms_rest_example.application.common.dto.input;

public class FeedbackFormRequest {
    private final String category;
    private final String surname;
    private final String name;
    private final Integer age;
    private final String city;
    private final String email;
    private final String phoneNumber;
    private final Integer salary;
    private final String gitHubUrl;

    public FeedbackFormRequest(String category, String surname, String name, Integer age, String city,
                               String email, String phoneNumber, Integer salary, String gitHubUrl) {
        this.category = category;
        this.surname = surname;
        this.name = name;
        this.age = age;
        this.city = city;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.gitHubUrl = gitHubUrl;
    }

    public String getCategory() {
        return category;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getGitHubUrl() {
        return gitHubUrl;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getCity() {
        return city;
    }

    public Integer getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public Integer getSalary() {
        return salary;
    }
}
