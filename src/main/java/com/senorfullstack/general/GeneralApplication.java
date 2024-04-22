package com.senorfullstack.general;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({
	"com.senorfullstack.general",
	"controllers", "services", "dto", "dao", "models", "utils"
	})
public class GeneralApplication {

	public static void main(String[] args) {
		SpringApplication.run(GeneralApplication.class, args);
	}

}
