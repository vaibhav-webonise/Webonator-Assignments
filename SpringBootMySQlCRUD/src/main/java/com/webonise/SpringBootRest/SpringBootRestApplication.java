package com.webonise.SpringBootRest;

import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import com.webonise.SpringBootRest.dao.SystemRepository;
import com.webonise.SpringBootRest.model.ISystem;

@SpringBootApplication
@EnableJpaRepositories("com.webonise.SpringBootRest.dao")
@EntityScan("com.webonise.SpringBootRest.model")
public class SpringBootRestApplication implements CommandLineRunner {

	@Autowired(required = true)
	DataSource dataSource;

	@Autowired(required = true)
	SystemRepository systemRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRestApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Our DataSource is = " + dataSource);
		Iterable<ISystem> systemlist = systemRepository.findAll();
		for (ISystem systemmodel : systemlist) {
			System.out.println("Here is a system: " + systemmodel.toString());
		}
	}
}
