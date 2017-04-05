package com.itswwl.practice.controller;

import java.util.List;

import com.itswwl.practice.entry.SpringCloud;

public interface ISpringCloudController {

	public SpringCloud findById(Long id);
	
	public String test();
	 
	public List<SpringCloud> search();
	
}
