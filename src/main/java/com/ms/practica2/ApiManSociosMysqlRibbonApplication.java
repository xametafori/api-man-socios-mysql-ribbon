package com.ms.practica2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@RibbonClient(name="api-man-socios-mysql")
@EnableFeignClients
@SpringBootApplication
public class ApiManSociosMysqlRibbonApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiManSociosMysqlRibbonApplication.class, args);
	}

}
