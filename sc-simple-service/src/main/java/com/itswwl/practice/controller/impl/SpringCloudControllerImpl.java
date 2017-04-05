package com.itswwl.practice.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.itswwl.practice.controller.ISpringCloudController;
import com.itswwl.practice.entry.SpringCloud;
import com.itswwl.practice.service.ISpringCloudService;

@RestController
@RequestMapping("/springcloud")
public class SpringCloudControllerImpl implements ISpringCloudController {

	
	@Autowired
	private ISpringCloudService springCloudService;
	
	@Override
	@RequestMapping("/findById/{id}")
	public SpringCloud findById(@PathVariable("id")Long id) {
		return springCloudService.findById(id);
	}

	@Override
	@RequestMapping("/test")
	public String test() {
		return "测试";
	}

}
