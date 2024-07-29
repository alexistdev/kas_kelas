package com.kas_kelas.kas_kelas;

import com.kas_kelas.kas_kelas.models.entity.Menu;
import com.kas_kelas.kas_kelas.models.entity.Role;
import com.kas_kelas.kas_kelas.services.MenuService;
import com.kas_kelas.kas_kelas.services.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


@SpringBootApplication
public class KasKelasApplication {

	@Autowired
	private RoleService roleService;

	@Autowired
	private MenuService menuService;

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

			Menu menu = new Menu();
			menu.setName("Dashboard");
			menu.setOrder(1);
			menu.setUrl("/dashboard");
			menu.setIcon("nav-icon far fa-circle text-danger");

			menuService.createMenu(menu);

			Menu menu2 = new Menu();
			menu2.setName("Transaksi");
			menu2.setOrder(1);
			menu2.setUrl("/transaksi");
			menu2.setIcon("nav-icon far fa-circle text-warning");

			menuService.createMenu(menu2);

			List<Menu> mymenu = new ArrayList<>();
			Iterable<Menu> menus = menuService.getAllMenu();
			menus.forEach(mymenu::add);

			Role role = new Role();
			role.setName("Administration");
			role.setMenuList(mymenu);

			Role role2 = new Role();
			role2.setName("user");
			role2.setMenuList(mymenu);

			roleService.createRole(role);
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
