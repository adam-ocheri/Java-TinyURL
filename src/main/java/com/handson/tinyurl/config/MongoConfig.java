// Mongo Config - unused because there is a configuration for mongoDB in the `application.properties` file.
// If we used this MongoConfig class, it would overwrite the `application.properties`.
// The default behaviour of the `AbstractMongoClientConfiguration` class is to connect to the DB from localhost.
/*
    Since we want to deploy to production, using localhost isn't good for us - so we have to configure the
    class or the app.properties to connect to a remote host instead of local.
    We simply did it in the app.properties for reasons of simplicity
*/
//package com.handson.tinyurl.config;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;
//
//@Configuration
//public class MongoConfig extends AbstractMongoClientConfiguration {
//
//    @Override
//    protected String getDatabaseName() {
//        return "tinydb";
//    }
//
//    @Override
//    public boolean autoIndexCreation() {
//        return true;
//    }
//
//}
