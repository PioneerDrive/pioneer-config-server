package com.pioneer.configserver.pioneerconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class PioneerConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(PioneerConfigServerApplication.class, args);
	}

}

