package com.nebula;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication(scanBasePackages = "com.nebula")
@EnableSwagger2
public class AgricultureBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(AgricultureBackendApplication.class, args);
	}

}
