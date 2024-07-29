package com.kas_kelas.kas_kelas;

import com.kas_kelas.kas_kelas.models.entity.Roles;
import com.kas_kelas.kas_kelas.services.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class KasKelasApplication {

	@Autowired
	private RoleService roleService;

	public static void main(String[] args) {
		SpringApplication.run(KasKelasApplication.class, args);
	}

	@Bean
	public PasswordEncoder getPasswordEncoder() {
		return new BCryptPasswordEncoder();
	}


	@Bean
	CommandLineRunner init() {
		return args -> {

			Roles role = new Roles();
			role.setName("administration");

			roleService.createRole(role);
			Roles role2 = new Roles();
			role2.setName("user");

			roleService.createRole(role2);

		};
	}

//	@Bean
//	CommandLineRunner seedUser() {
//		return args -> {
//				Roles role = roleRepository.findByName("administration");
//				if(role == null) {
//					role = new Roles();
//				}
//
//				Users user = new Users();
//				user.setEmail("admin@gmail.com");
//				user.setPassword("12345");
//				user.setToken("123123132123");
//				user.setName("Administrator");
//				user.setRole(role);
//
//				userRepository.save(user);
//		};
//	}

}
