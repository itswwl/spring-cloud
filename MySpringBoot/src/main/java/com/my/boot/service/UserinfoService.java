package com.my.boot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.my.boot.dao.UserinfoMapper;
import com.my.boot.model.Userinfo;

@Service
public class UserinfoService {
	
	@Autowired
	private UserinfoMapper userinfoMapper;
	
	@Transactional(readOnly = true)
	public Userinfo findById(String id){
		return userinfoMapper.findById(id);
	}
	
	@Transactional(rollbackFor = {Exception.class})
	public int insert(String userinfo){
		return userinfoMapper.insert(userinfo);
	}
	
	@Transactional(rollbackFor = {Exception.class})
	public int delete(Long id){
		return userinfoMapper.delete(id);
	}
	
	@Transactional(rollbackFor = {Exception.class})
	public int update (Long id,String userinfo){
		return userinfoMapper.update(id, userinfo);
	}
	
	@Transactional(readOnly = true)
	public List<Userinfo> searchPage(String userinfo){
		return userinfoMapper.searchPage(userinfo);
	}

}
