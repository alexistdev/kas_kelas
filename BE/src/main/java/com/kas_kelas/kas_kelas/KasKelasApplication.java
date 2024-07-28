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


//	@Bean
//	CommandLineRunner init() {
//		return args -> {
//
//			List<Roles> listRoles = new ArrayList<>();
//
//
//			Roles role = new Roles();
//			role.setName("administration");
//			listRoles.add(role);
//
//			Roles role2 = new Roles();
//			role2.setName("user");
//			listRoles.add(role2);
//
//			roleRepository.saveAll(listRoles);
//
//			Roles adminRole = roleRepository.findByName("administration");
//			Roles userRole = roleRepository.findByName("user");
//			if(adminRole != null) {
//				Users admin = new Users();
//				admin.setName("Administrator");
//				admin.setEmail("admin@gmail.com");
//				admin.setPassword("admin");
//				admin.setRole(adminRole);
//				admin.setToken("12312312312312");
//				userRepository.save(admin);
//			}
//
//			if(userRole != null) {
//				Users user = new Users();
//				user.setName("Jane Doe");
//				user.setEmail("janedoe@gmail.com");
//				user.setPassword("1234");
//				user.setRole(userRole);
//				user.setToken("12312312312312");
//				userRepository.save(user);
//			}
//
//
//		};
//	}

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
