package com.example.money;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SpringMain {
    private static final AnnotationConfigApplicationContext CONTEXT
            =new AnnotationConfigApplicationContext(SpringConfig.class);

    public static void main(String[] args) {
        Wallet wallet =CONTEXT.getBean(Wallet.class);
        wallet.showBalance();
        CONTEXT.close();
    }



}
