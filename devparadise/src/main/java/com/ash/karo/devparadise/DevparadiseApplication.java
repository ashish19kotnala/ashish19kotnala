package com.ash.karo.devparadise;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class DevparadiseApplication {

	public static void main(String[] args) {
		SpringApplication.run(DevparadiseApplication.class, args);
	}

}
