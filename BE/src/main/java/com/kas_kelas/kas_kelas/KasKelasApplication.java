package com.kas_kelas.kas_kelas;

import com.kas_kelas.kas_kelas.models.entity.Roles;
import com.kas_kelas.kas_kelas.models.entity.Users;
import com.kas_kelas.kas_kelas.models.repository.RoleRepository;
import com.kas_kelas.kas_kelas.models.repository.UserRepository;
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
	private UserRepository userRepository;

	@Autowired
	private RoleRepository roleRepository;

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

			List<Roles> listRoles = new ArrayList<>();


			Roles role = new Roles();
			role.setName("administration");
			listRoles.add(role);

			Roles role2 = new Roles();
			role2.setName("user");
			listRoles.add(role2);

			roleRepository.saveAll(listRoles);

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
