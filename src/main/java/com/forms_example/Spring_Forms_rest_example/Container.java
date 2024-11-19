package com.forms_example.Spring_Forms_rest_example;

import com.forms_example.Spring_Forms_rest_example.adapters.gateways.FeedbackFormGateway;
import com.forms_example.Spring_Forms_rest_example.adapters.services.UrlFormatterService;
import com.forms_example.Spring_Forms_rest_example.application.boundaries.IFormFeedbackBoundary;
import com.forms_example.Spring_Forms_rest_example.application.boundaries.IUrlFormatterService;
import com.forms_example.Spring_Forms_rest_example.application.gateways.IFeedbackFormGateway;
import com.forms_example.Spring_Forms_rest_example.application.interactors.FormInteractor;
import com.forms_example.Spring_Forms_rest_example.domain.factory.FormFactory;
import com.forms_example.Spring_Forms_rest_example.domain.factory.IFormFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Container {

    @Bean
    public IFormFactory formFactory() {
        return new FormFactory();
    }

    @Bean
    public IFeedbackFormGateway formGateway() {
        return new FeedbackFormGateway();
    }

    @Bean
    public IUrlFormatterService formatterService() {
        return new UrlFormatterService();
    }

    @Bean
    public IFormFeedbackBoundary formInteractor(IFormFactory formFactory, IFeedbackFormGateway formGateway,
                                                IUrlFormatterService formatterService) {
        return new FormInteractor(formFactory, formGateway, formatterService);
    }

}
