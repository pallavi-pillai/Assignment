package org.spring;

import org.spring.entity.customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.spring.repo.custrepo;
@SpringBootApplication
public class JavaAssignmentApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(JavaAssignmentApplication.class, args);
	}
	
	@Autowired
	private custrepo custrepo;
	@Override
	public void run(String... args) throws Exception {
		
		
	}

}
