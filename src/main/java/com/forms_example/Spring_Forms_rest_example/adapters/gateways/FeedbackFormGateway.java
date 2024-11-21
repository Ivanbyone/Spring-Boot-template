package com.forms_example.Spring_Forms_rest_example.adapters.gateways;

import com.forms_example.Spring_Forms_rest_example.adapters.common.MongoConnection;
import com.forms_example.Spring_Forms_rest_example.adapters.mappers.FormMapper;
import com.forms_example.Spring_Forms_rest_example.application.gateways.IFeedbackFormGateway;
import com.forms_example.Spring_Forms_rest_example.domain.common.IFeedbackForm;
import com.mongodb.client.MongoCollection;
import org.bson.Document;

import static com.mongodb.client.model.Filters.eq;

public class FeedbackFormGateway extends MongoConnection implements IFeedbackFormGateway {
    private final MongoCollection<Document> collection;

    public FeedbackFormGateway() {
        super();
        this.collection = database.getCollection("forms");
    }

    @Override
    public String addForm(IFeedbackForm form) {
        Document mapper = FormMapper.create(form);
        collection.insertOne(mapper);
        return mapper.get("formId").toString();
    }

    @Override
    public IFeedbackForm getForm(String id) {
        Document mapper = collection.find(eq("formId", id)).first();
        if (mapper == null) {
            return null;
        }
        return FormMapper.get(mapper);
    }
}
