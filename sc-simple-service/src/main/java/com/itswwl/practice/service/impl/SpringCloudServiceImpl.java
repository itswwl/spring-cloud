package com.itswwl.practice.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itswwl.practice.dao.SpringCloudDao;
import com.itswwl.practice.entry.SpringCloud;
import com.itswwl.practice.service.ISpringCloudService;

@Service
public class SpringCloudServiceImpl implements ISpringCloudService {

	@Autowired
	private SpringCloudDao springCloudDao;
	
	@Override
	public SpringCloud findById(Long id) {
		return springCloudDao.findOne(id);
	}

}
