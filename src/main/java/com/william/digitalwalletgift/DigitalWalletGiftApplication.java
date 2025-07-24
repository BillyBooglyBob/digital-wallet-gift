package com.william.digitalwalletgift;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DigitalWalletGiftApplication {

    public static void main(String[] args) {
        SpringApplication.run(DigitalWalletGiftApplication.class, args);
    }

    @GetMapping
    public String getHello() {
        return "Hello World!";
    }

}
