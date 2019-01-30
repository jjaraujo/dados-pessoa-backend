package com.dados.teste;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class PessoasServer {
	
	public static void main(String[] args) {
		SpringApplication.run(PessoasServer.class, args);
	}

}
