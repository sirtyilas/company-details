package com.example.companydetails;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableAutoConfiguration
@EnableJpaRepositories()//TODO add basepackages
public class CompanyDetailsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CompanyDetailsApplication.class, args);
	}

}
