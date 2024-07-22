package com.kas_kelas.kas_kelas;

import com.kas_kelas.kas_kelas.models.entity.Users;
import com.kas_kelas.kas_kelas.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.HashMap;

@SpringBootApplication
public class KasKelasApplication {

	@Autowired
	private UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(KasKelasApplication.class, args);
	}

	@Bean
	CommandLineRunner seedUser() {
		return args -> {
			Users user = new Users();
			user.setName("Admin");
			user.setEmail("admin@gmail.com");
			user.setPassword("admin");
			user.setToken("12345678");
			userService.createUser(user);
		};
	}


}
