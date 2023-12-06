package org.wolflink.sharine.api;

import lombok.Getter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ApplicationContext;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@EnableDiscoveryClient
public class Application {
    @Getter
    private static ApplicationContext applicationContext = null;
    public static void main(String[] args) {
        applicationContext = SpringApplication.run(Application.class, args);
    }
}