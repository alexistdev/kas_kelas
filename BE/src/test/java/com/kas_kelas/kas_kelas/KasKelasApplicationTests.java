package com.kas_kelas.kas_kelas;

import com.kas_kelas.kas_kelas.models.entity.Users;
import com.kas_kelas.kas_kelas.requests.UserRequest;
import com.kas_kelas.kas_kelas.services.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootTest
class KasKelasApplicationTests {

	@Autowired
	private UserService userService;

	@Autowired
	private PasswordEncoder passwordEncoder;


	@Test
	void contextLoads() {
	}


	@Test
	void testpassword() throws Exception {
//		String password = passwordEncoder.encode("123456");
//		UserRequest userRequest = new UserRequest();
//		userRequest.setPassword("123456");
//		userRequest.setName("Admin");
//		userRequest.setEmail("admin2@admin.com");
//
//		Users result =userService.createUser(userRequest);
//
//		System.out.println(result.getPassword());
//		System.out.println(password);
	}
}
