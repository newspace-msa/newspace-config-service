package com.lgcns.newspace;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class NewspaceConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(NewspaceConfigServerApplication.class, args);
	}

}
