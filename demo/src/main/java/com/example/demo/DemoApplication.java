package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.net.InetAddress;

@SpringBootApplication
@RestController
public class DemoApplication {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @GetMapping("/test")
    public String hello(@RequestParam(value = "username", defaultValue = "Max") String name) throws IOException {
        String hostName = InetAddress.getLocalHost().getHostName().toString();
        logger.info("My name is " + name + ", my host name is " + hostName);
        return String.format("My name is %s, my host name is %s", name, hostName);
    }

}
