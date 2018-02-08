package com.user.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import com.user.springboot.configuration.JpaConfiguration;


@Import(JpaConfiguration.class)
@SpringBootApplication(scanBasePackages={"com.user.springboot"})// same as @Configuration @EnableAutoConfiguration @ComponentScan
public class SpringBootUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootUserApplication.class, args);
	}
}
