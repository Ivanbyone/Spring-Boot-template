package com.forms_example.Spring_Forms_rest_example;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI Config() {
        return new OpenAPI().info(
                new Info().title(
                        "Spring Online forms service"
                ).version(
                        "0.1.0"
                ).contact(
                        new Contact().email("ivanbyone@gmail.com").name("Ivan Boyko")
                )
        );
    }
}
