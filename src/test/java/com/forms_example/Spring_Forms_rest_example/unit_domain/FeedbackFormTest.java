package com.forms_example.Spring_Forms_rest_example.unit_domain;

import com.forms_example.Spring_Forms_rest_example.domain.common.FeedbackForm;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class FeedbackFormTest {

    @Test
    public void testEmailValid() {
        String email = "ivan1346@mail.ru";
        boolean result = FeedbackForm.isEmailValid(email);
        assertTrue(result);
    }

    @Test
    public void testEmailInvalid() {
        String email = "ivan2334mail.ru";
        boolean result = FeedbackForm.isEmailValid(email);
        assertFalse(result);
    }

    @Test
    public void testEmailInvalidTwice() {
        String email = "ivan2335@mailru";
        boolean result = FeedbackForm.isEmailValid(email);
        assertFalse(result);
    }

    @Test
    public void testEmptyEmail() {
        String email = "";
        boolean result = FeedbackForm.isEmailValid(email);
        assertFalse(result);
    }

    @Test
    public void testEmptyGitUrl() {
        String url = "";
        boolean result = FeedbackForm.isGitUrlValid(url);
        assertFalse(result);
    }

    @Test
    public void testValidUrl() {
        String url = "https://github.com/Ivanbyone";
        boolean result = FeedbackForm.isGitUrlValid(url);
        assertTrue(result);
    }

    @Test
    public void testInValidUrl() {
        String url = "https://github.com/";
        boolean result = FeedbackForm.isGitUrlValid(url);
        assertFalse(result);
    }

    @Test
    public void testNotGitHubUrl() {
        String url = "https://example.com/";
        boolean result = FeedbackForm.isGitUrlValid(url);
        assertFalse(result);
    }
}
