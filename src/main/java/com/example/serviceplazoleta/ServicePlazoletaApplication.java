package com.example.serviceplazoleta;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
@EnableFeignClients
@SpringBootApplication
public class ServicePlazoletaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServicePlazoletaApplication.class, args);
			System.out.print("Terminado---------------*******");
		}

}
