package com.forms_example.Spring_Forms_rest_example.adapters.mappers;

import com.forms_example.Spring_Forms_rest_example.domain.common.FeedbackForm;
import com.forms_example.Spring_Forms_rest_example.domain.common.IFeedbackForm;
import com.forms_example.Spring_Forms_rest_example.domain.factory.IFormFactory;
import org.bson.Document;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class FormMapper {

    public static Document create(IFeedbackForm form) {
        Document doc = new Document();
        doc.put("formId", form.getFormId());
        doc.put("category", form.getCategory());
        doc.put("surname", form.getSurname());
        doc.put("name", form.getName());
        doc.put("age", form.getAge());
        doc.put("city", form.getCity());
        doc.put("email", form.getEmail());
        doc.put("phoneNumber", form.getPhoneNumber());
        doc.put("salary", form.getSalary());
        doc.put("GitHubUrl", form.getGitHubUrl());
        doc.put("createdDate", form.getCreatedDate());
        doc.put("status", form.getStatus().toString());
        return doc;
    }

    public static LocalDateTime formatDateTime(String date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEE MMM dd HH:mm:ss zzz yyyy",
                Locale.ENGLISH);

        ZonedDateTime rawDate = ZonedDateTime.parse(date, formatter);
        return rawDate.toLocalDateTime();
    }

    public static IFeedbackForm get(Document doc) {
        return new FeedbackForm(
                doc.get("formId").toString(),
                doc.get("category").toString(),
                doc.get("surname").toString(),
                doc.get("name").toString(),
                doc.get("age").toString(),
                doc.get("city").toString(),
                doc.get("email").toString(),
                doc.get("phoneNumber").toString(),
                doc.get("salary").toString(),
                doc.get("GitHubUrl").toString(),
                formatDateTime(doc.get("createdDate").toString()),
                doc.get("status").toString()
        );
    }
}
