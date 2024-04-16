package ru.rgordeev.tkinvest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories;

@EnableJdbcRepositories
@SpringBootApplication
public class TkinvestApplication {

	public static void main(String[] args) {
		SpringApplication.run(TkinvestApplication.class, args);
		System.out.println("Hello!");
	}

}
