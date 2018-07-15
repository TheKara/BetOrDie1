package com.djordje.betOrDie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.djordje.betOrDie.repository")
@SpringBootApplication
public class BetOrDieApplication {

	public static void main(String[] args) {
		SpringApplication.run(BetOrDieApplication.class, args);
	}
}
