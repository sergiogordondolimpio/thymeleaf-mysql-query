package com.gordon.thymeleafmysqlquery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EntityScan(basePackages = { "com.gordon.thymeleafmysqlquery" })
@ComponentScan(basePackages= {"com.gordon.thymeleafmysqlquery"})
public class ThymeleafmysqlqueryApplication {

    public static void main(String[] args) {
        SpringApplication.run(ThymeleafmysqlqueryApplication.class, args);
    }

}
