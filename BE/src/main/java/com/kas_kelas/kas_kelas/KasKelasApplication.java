package com.kas_kelas.kas_kelas;

import com.kas_kelas.kas_kelas.models.entity.Role;
import com.kas_kelas.kas_kelas.models.entity.Users;
import com.kas_kelas.kas_kelas.requests.RoleRequest;
import com.kas_kelas.kas_kelas.requests.UserRequest;
import com.kas_kelas.kas_kelas.services.RoleService;
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

	@Autowired
	private RoleService roleService;

	public static void main(String[] args) {
		SpringApplication.run(KasKelasApplication.class, args);
	}

	@Bean
	CommandLineRunner seedUser() {
		return args -> {
			UserRequest user = new UserRequest();
			user.setName("Admin");
			user.setEmail("admin@gmail.com");
			user.setPassword("admin");
			userService.createUser(user);
		};
	}

	@Bean
	CommandLineRunner seedRole() {
		return args -> {
			Role role = new Role();
			role.setName("Administrator");
			roleService.createRole(role);

			Role role2 = new Role();
			role2.setName("User");
			roleService.createRole(role2);
		};
	}


}
