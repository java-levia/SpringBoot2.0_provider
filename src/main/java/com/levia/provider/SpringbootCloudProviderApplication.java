package com.levia.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SpringbootCloudProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootCloudProviderApplication.class, args);
	}
}
