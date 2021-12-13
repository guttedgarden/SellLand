package com.example.sellland;

import com.example.sellland.controllers.ProductController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;


@SpringBootApplication()
//@EnableJpaRepositories(basePackageClasses = ProductController.class)
public class SellLandApplication {

	public static void main(String[] args) {
		SpringApplication.run(SellLandApplication.class, args);
	}

}
