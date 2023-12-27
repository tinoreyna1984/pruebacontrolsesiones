package com.tinexlab.pruebacontrolsesiones;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class PruebacontrolsesionesApplication {

	public static void main(String[] args) {
		SpringApplication.run(PruebacontrolsesionesApplication.class, args);
	}

	@Autowired
	private PasswordEncoder passwordEncoder;

	@Bean
	public CommandLineRunner createPasswordsCommand(){
		return args -> {
			System.out.println("Prueba de control de sesiones");
			System.out.println("*****************************");
			System.out.println("Aseguramiento de claves - ini");
			/*System.out.println("Clave u$uari0CRM (usuario): " + passwordEncoder.encode("u$uari0CRM"));
			System.out.println("Clave Tr20010878 (admin): " + passwordEncoder.encode("Tr20010878"));*/
			System.out.println("Aeguramiento de claves - fin");
			System.out.println("Hola mundo! :)");
		};
	}

}
