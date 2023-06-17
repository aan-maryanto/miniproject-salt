package com.salt.saltminiproject;

import com.salt.saltminiproject.entity.Konsumen;
import com.salt.saltminiproject.service.KonsumenService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import java.util.Date;

@SpringBootApplication
public class SaltMiniprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SaltMiniprojectApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(KonsumenService konsumenService) {
		return args -> {
			konsumenService.addKonsumen(new Konsumen(
					1L,
					"Budi",
					"Manggarai",
					"Jakarta Selatan",
					"DKI JAKARTA",
					new Date(),
					"Aktif"));
			konsumenService.addKonsumen(new Konsumen(
					2L,
					"Roni",
					"Manggarai",
					"Jakarta Selatan",
					"DKI JAKARTA",
					new Date(),
					"Aktif"));
			konsumenService.addKonsumen(new Konsumen(
					3L,
					"Alex",
					"Manggarai",
					"Jakarta Selatan",
					"DKI JAKARTA",
					new Date(),
					"Aktif"));
			konsumenService.addKonsumen(new Konsumen(
					4L,
					"Gadis",
					"Manggarai",
					"Jakarta Selatan",
					"DKI JAKARTA",
					new Date(),
					"Aktif"));
			konsumenService.addKonsumen(new Konsumen(
					5L,
					"Tina",
					"Manggarai",
					"Jakarta Selatan",
					"DKI JAKARTA",
					new Date(),
					"Aktif"));
			konsumenService.addKonsumen(new Konsumen(
					6L,
					"Yasmin",
					"Manggarai",
					"Jakarta Selatan",
					"DKI JAKARTA",
					new Date(),
					"Aktif"));
		};
	}

}
