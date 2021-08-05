package com.example.demo.config;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class DebeziumConfiguration {

    @PostConstruct
    private void start() {
//        BinaryLogClient client =
//                new BinaryLogClient("localhost", 3306, "root", "root");
//        client.setKeepAliveInterval(10000);
//        client.registerLifecycleListener(new BinaryLogClient.AbstractLifecycleListener() {
//        });
//
//        client.registerEventListener(event -> {
//            System.out.println(event);
//        });
//
//        try {
//            client.connect();
//        } catch (IOException e) {
//        }
    }

}
