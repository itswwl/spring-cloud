package com.itswwl.practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EntityScan("com.itswwl.practice.entry")
@ComponentScan(basePackages ={"com.itswwl.practice.dao","com.itswwl.practice.service.impl","com.itswwl.practice.controller.impl"})
@EnableDiscoveryClient
@RefreshScope
@EnableEurekaClient//一定加此注解，不然服务不会被注册
public class ServiceApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(ServiceApplication.class, args);
	}

}
