package com.kas_kelas.kas_kelas;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.HashMap;

@SpringBootApplication
public class KasKelasApplication {

	public static void main(String[] args) {
		SpringApplication.run(KasKelasApplication.class, args);
	}

//	@Bean
//	CommandLineRunner seedUser() {
//		return args -> {
//			HashMap<String,String> names = new HashMap<>();
//			names.put("Superadmin","Super Admin");
//			names.put("Admin","Administrator");
//			names.put("Admin Gudang","Admin Gudang Input Stock");
//			names.put("Admin PO","Admin untuk membuat PO");
//			for (Map.Entry<String, String> set : names.entrySet()) {
//				RoleDAO roleDAO = RoleDAO.builder()
//						.name(set.getKey())
//						.description(set.getValue())
//						.createdBy("System")
//						.modifiedBy("System")
//						.status("1")
//						.build();
//				roleService.save(roleDAO);
//			}
//		};
//	}


}
