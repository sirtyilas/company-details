package com.example.companydetails;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.companydetails.repos.DetailsRepository;

@Component
public class MyRunner implements CommandLineRunner {

	private static final Logger logger = LoggerFactory.getLogger(MyRunner.class);

	@Autowired
	private DetailsRepository detailsyRepository;

	@Override
	public void run(String... args) throws Exception {
		/*
		 * detailsyRepository.save(new DataBaseInfo("org.postgresql.Driver",
		 * "jdbc:postgresql://localhost:5432/V5_adp", "postgres", "postgres","6","V5"));
		 * detailsyRepository.save(new DataBaseInfo("org.postgresql.Driver",
		 * "jdbc:postgresql://localhost:5432/V6_adp", "postgres", "postgres","7","V6"));
		 */
		logger.info("# of details: {}", detailsyRepository.count());

	}
}
