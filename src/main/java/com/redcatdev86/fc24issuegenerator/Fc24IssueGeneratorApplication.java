package com.redcatdev86.fc24issuegenerator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan({"com.redcatdev86"})
@SpringBootApplication
public class Fc24IssueGeneratorApplication {

    public static void main(String[] args) {
        SpringApplication.run(Fc24IssueGeneratorApplication.class, args);
    }

}
