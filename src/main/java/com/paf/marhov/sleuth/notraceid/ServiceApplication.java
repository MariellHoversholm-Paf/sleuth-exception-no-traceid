package com.paf.marhov.sleuth.notraceid;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class ServiceApplication {
  public static void main(final String[] args) {
    SpringApplication.run(ServiceApplication.class, args);
  }
}
