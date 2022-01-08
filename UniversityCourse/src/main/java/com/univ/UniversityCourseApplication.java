package com.univ;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class UniversityCourseApplication {

	public static void main(String[] args) {
		SpringApplication.run(UniversityCourseApplication.class, args);
	}

}
