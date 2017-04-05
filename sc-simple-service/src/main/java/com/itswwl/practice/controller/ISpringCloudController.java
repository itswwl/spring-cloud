package com.itswwl.practice.controller;

import com.itswwl.practice.entry.SpringCloud;

public interface ISpringCloudController {

	public SpringCloud findById(Long id);
	
	public String test();
	
}
