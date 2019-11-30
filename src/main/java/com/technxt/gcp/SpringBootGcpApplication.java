package com.technxt.gcp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/demo-gcp")
@SpringBootApplication
public class SpringBootGcpApplication {

    @GetMapping
    public String demo() {
        return "Spring Boot Run in GCP cloud!!!";
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootGcpApplication.class, args);
    }

}
