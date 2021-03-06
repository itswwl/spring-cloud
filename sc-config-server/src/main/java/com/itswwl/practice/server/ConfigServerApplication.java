package com.itswwl.practice.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.annotation.Configuration;

/**
 * @author Administrator
 *
 *
 *   参考博客
 *   http://www.cnblogs.com/skyblog/category/774535.html
 *
 *
 *   SpringCloud分布式开发五大神兽
 *   http://blog.csdn.net/u011686226/article/details/54091325
 *   
 *   github
 *   https://github.com/zpng/spring-cloud-7simple
 *
 */
@SpringBootApplication
@Configuration
@EnableAutoConfiguration
@EnableDiscoveryClient
@EnableConfigServer
public class ConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServerApplication.class, args);
	}
	
}
