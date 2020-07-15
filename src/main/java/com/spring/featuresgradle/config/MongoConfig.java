package com.spring.featuresgradle.config;

import com.mongodb.MongoClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;
import java.io.IOException;

@Configuration
public class MongoConfig {
    private static final String MONGO_DB_URL = "127.0.0.1";
    private static final int MONGO_DB_PORT = 27017;
    private static final String MONGO_DB_NAME = "embedded_db";

    @Bean
    public MongoTemplate mongoTemplate() throws IOException {
        MongoClient mongoClient = new MongoClient(MONGO_DB_URL, MONGO_DB_PORT);
        return new MongoTemplate(mongoClient, MONGO_DB_NAME);
    }
}
