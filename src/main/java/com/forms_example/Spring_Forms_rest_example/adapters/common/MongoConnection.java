package com.forms_example.Spring_Forms_rest_example.adapters.common;

import com.mongodb.client.MongoDatabase;
import io.github.cdimascio.dotenv.Dotenv;

import java.util.Objects;
import java.util.Optional;
import com.mongodb.MongoClient;

public abstract class MongoConnection {
    protected final MongoDatabase database;

    public MongoConnection() {
        Dotenv dotenv = Dotenv.load();
        String host = dotenv.get("MONGO_HOST");
        int defaultPort = 27017;
        MongoClient client = new MongoClient(host, defaultPort);
        database = client.getDatabase("form_service");
    }
}
