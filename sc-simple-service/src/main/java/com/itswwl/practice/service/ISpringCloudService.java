package com.itswwl.practice.service;

import java.util.List;

import com.itswwl.practice.entry.SpringCloud;

public interface ISpringCloudService {
	
	public SpringCloud findById(Long id);
	
	public List<SpringCloud> search();

}
