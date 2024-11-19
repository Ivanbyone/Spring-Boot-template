package com.forms_example.Spring_Forms_rest_example.adapters.services;

import com.forms_example.Spring_Forms_rest_example.application.boundaries.IUrlFormatterService;
import io.github.cdimascio.dotenv.Dotenv;

public class UrlFormatterService implements IUrlFormatterService {

    public String createUrl(String item) {
        Dotenv dotenv = Dotenv.load();
        String baseUrl = dotenv.get("BASE_URL");
        return baseUrl + item;
    }
}
