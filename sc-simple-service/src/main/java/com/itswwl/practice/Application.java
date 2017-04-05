package com.itswwl.practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EntityScan("com.itswwl.practice.entry")
@ComponentScan(basePackages ={"com.itswwl.practice.dao","com.itswwl.practice.service.impl","com.itswwl.practice.controller.impl"})
@EnableDiscoveryClient
@RefreshScope
public class Application {
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
