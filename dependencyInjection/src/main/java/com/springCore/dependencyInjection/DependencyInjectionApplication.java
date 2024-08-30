package com.springCore.dependencyInjection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//
//to access the components from out of your package directory
@SpringBootApplication(
		scanBasePackages = {"com.springCore.dependencyInjection",
							"com.springCore.util"

		}
)
public class DependencyInjectionApplication {

	public static void main(String[] args) {
		SpringApplication.run(DependencyInjectionApplication.class, args);
	}

}
