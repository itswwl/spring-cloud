package com.my.boot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageHelper;
import com.my.boot.model.Userinfo;
import com.my.boot.service.UserinfoService;


@RequestMapping("/UserinfoMyBatis")
@RestController
public class UserinfoMyBatisController {
	
	@Autowired
	private UserinfoService userinfoService;
	
	@RequestMapping("/findById/{id}")
	public Userinfo findById(@PathVariable("id")String id){
		return userinfoService.findById(id);
	}
	@RequestMapping("/insert/{userinfo}")
	public int insert(@PathVariable("userinfo")String userinfo){
		return userinfoService.insert(userinfo);
	}
	
	@RequestMapping("/delete/{id}")
	public int delete(@PathVariable("id")Long id){
		return userinfoService.delete(id);
	}
	
	@RequestMapping("/update/{id}/{userinfo}")
	public int update (@PathVariable("id")Long id,@PathVariable("userinfo")String userinfo){
		return userinfoService.update(id, userinfo);
	}
	
	@RequestMapping("/searchPage/{userinfo}")
	public List<Userinfo> searchPage(@PathVariable("userinfo")String userinfo){
		 PageHelper.startPage(1,1);
		return userinfoService.searchPage(userinfo);
	}

}
