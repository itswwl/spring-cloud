package com.itswwl.practice.controller.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itswwl.practice.controller.ISpringCloudController;
import com.itswwl.practice.service.ISpringCloudService;

@Controller
@RequestMapping("/springcloud")
public class SpringCloudControllerImpl implements ISpringCloudController {

	
	@Autowired
//	@Qualifier("SpringCloudService")
	private ISpringCloudService springCloudService;
	
	@Override
	@RequestMapping("/searchAll")
	public String searchAll(Model model) {
		model.addAttribute("springcloud", springCloudService.searchAll());
		return "springcloud";
	}

	@Override
	@RequestMapping("/test")
	public String test() {
		return "测试";
	}

}
