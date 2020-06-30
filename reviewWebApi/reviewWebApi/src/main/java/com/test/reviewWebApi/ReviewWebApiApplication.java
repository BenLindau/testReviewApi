package com.test.reviewWebApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.*")
public class ReviewWebApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReviewWebApiApplication.class, args);
	}

}
