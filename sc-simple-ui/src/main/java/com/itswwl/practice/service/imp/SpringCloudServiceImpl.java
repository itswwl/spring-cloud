package com.itswwl.practice.service.imp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import com.itswwl.practice.entry.SpringCloud;
import com.itswwl.practice.service.ISpringCloudService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
//@Service("SpringCloudService")
public class SpringCloudServiceImpl implements ISpringCloudService {

	@Autowired
	RestTemplate restTemplate;
	final String SERVICE_NAME = "sc-simple-service";

	@SuppressWarnings("unchecked")
	@HystrixCommand(fallbackMethod = "fallbackSearchAll")
	public List<SpringCloud> searchAll() {
		try {
			return restTemplate.getForObject("http://" + SERVICE_NAME + "/springcloud/search",
					List.class);
//			return restTemplate.getForObject("http://localhost:8081/springcloud/search",
//					List.class);
		} catch (RestClientException e) {
			e.printStackTrace();
			return null;
		}
	}

	@SuppressWarnings("unused")
	private List<SpringCloud> fallbackSearchAll() {

		System.out.println("HystrixCommand fallbackMethod handle!");

		List<SpringCloud> ls = new ArrayList<SpringCloud>();

		SpringCloud springCloud = new SpringCloud();

		springCloud.setSpringCloud("springCloud");

		ls.add(springCloud);
		return ls;
	}

}
