package com.project.docker_devtools;

import com.project.docker_devtools.entity.UserEntity;
import com.project.docker_devtools.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DockerDevtoolsApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DockerDevtoolsApplication.class, args);
	}

	@Autowired
	private UserRepository repository;

	@Override
	public void run(String... args) throws Exception {

		repository.save(new UserEntity(1L, "Lamark"));
		repository.save(new UserEntity(2L, "Bella"));
		repository.save(new UserEntity(3L, "Ricarte"));

	}
}
