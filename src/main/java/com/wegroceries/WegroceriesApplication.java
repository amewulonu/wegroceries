package com.wegroceries;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.wegroceries"})
public class WegroceriesApplication {

	public static void main(String[] args) {
		SpringApplication.run(WegroceriesApplication.class, args);

}
}