package br.com.incode.adminactuator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@SpringBootApplication
@EnableAdminServer
public class AdminActuatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdminActuatorApplication.class, args);
	}

}
