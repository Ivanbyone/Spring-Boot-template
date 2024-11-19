package com.forms_example.Spring_Forms_rest_example.unit_domain;


import com.forms_example.Spring_Forms_rest_example.domain.common.IFeedbackForm;
import com.forms_example.Spring_Forms_rest_example.domain.factory.FormFactory;
import com.forms_example.Spring_Forms_rest_example.domain.factory.IFormFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FormFactoryTest {

    @Test
    public void testValidFormCreation() {
        String category = "Java разработчик";
        String surname = "Boyko";
        String name = "Ivan";
        Integer age = 22;
        String city = "Москва";
        String email = "ivan1234@mail.ru";
        String phoneNumber = "+79112345678";
        Integer salary = 160000;
        String gitHubUrl = "https://github.com/Ivanbyone";

        IFormFactory factory = new FormFactory();
        IFeedbackForm result = factory.create(category, surname, name, age, city, email, phoneNumber, salary,
                gitHubUrl);
        assertNotNull(result);
    }

    @Test
    public void testInValidEmailForm() {
        String category = "Java разработчик";
        String surname = "Boyko";
        String name = "Ivan";
        Integer age = 22;
        String city = "Москва";
        String email = "ivan1234mailru";
        String phoneNumber = "+79112345678";
        Integer salary = 160000;
        String gitHubUrl = "https://github.com/Ivanbyone";

        IFormFactory factory = new FormFactory();
        IFeedbackForm result = factory.create(category, surname, name, age, city, email, phoneNumber, salary,
                gitHubUrl);
        assertNull(result);
    }

    @Test
    public void testInvalidPhoneForm() {
        String category = "Java разработчик";
        String surname = "Boyko";
        String name = "Ivan";
        Integer age = 22;
        String city = "Москва";
        String email = "ivan1234@mail.ru";
        String phoneNumber = "7911";
        Integer salary = 160000;
        String gitHubUrl = "https://github.com/Ivanbyone";

        IFormFactory factory = new FormFactory();
        IFeedbackForm result = factory.create(category, surname, name, age, city, email, phoneNumber, salary,
                gitHubUrl);
        assertNull(result);
    }

    @Test
    public void testInvalidUrlForm() {
        String category = "Java разработчик";
        String surname = "Boyko";
        String name = "Ivan";
        Integer age = 22;
        String city = "Москва";
        String email = "ivan1234@mail.ru";
        String phoneNumber = "+79112345678";
        Integer salary = 160000;
        String gitHubUrl = "https://github.com/";

        IFormFactory factory = new FormFactory();
        IFeedbackForm result = factory.create(category, surname, name, age, city, email, phoneNumber, salary,
                gitHubUrl);
        assertNull(result);
    }
}
