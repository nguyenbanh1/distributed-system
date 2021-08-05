package com.example.demo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.File;
import java.io.IOException;

@Configuration
public class DebeziumConnectorConfig {

    /**
     * Database details.
     */
    @Value("${customer.datasource.host}")
    private String customerDbHost;

    @Value("${customer.datasource.database}")
    private String customerDbName;

    @Value("${customer.datasource.port}")
    private String customerDbPort;

    @Value("${customer.datasource.username}")
    private String customerDbUsername;

    @Value("${customer.datasource.password}")
    private String customerDbPassword;

    /**
     * Customer Database Connector Configuration
     */
    @Bean
    public io.debezium.config.Configuration customerConnector() throws IOException {
        ClassLoader classLoader = getClass().getClassLoader();
        File offsetStorageTempFile = new File(classLoader.getResource("offsets.dat").getFile());
        File dbHistoryTempFile = new File(classLoader.getResource("dbhistory.dat").getFile());
//        File offsetStorageTempFile = File.createTempFile("offsets_", ".dat");
//        File dbHistoryTempFile = File.createTempFile("dbhistory_", ".dat");
        return io.debezium.config.Configuration.create()
                .with("connector.class", "io.debezium.connector.postgresql.PostgresConnector")
                .with("offset.storage",  "org.apache.kafka.connect.storage.FileOffsetBackingStore")
                .with("offset.storage.file.filename", offsetStorageTempFile)
                .with("offset.flush.interval.ms", 600000)
                .with("name", "postgres-connector")
                .with("database.server.name", customerDbHost+"1231233" + customerDbPort)
                .with("database.hostname", customerDbHost)
                .with("database.port", customerDbPort)
                .with("database.user", customerDbUsername)
                .with("database.password", customerDbPassword)
                .with("database.dbname", customerDbName)
                .build();
    }
}
