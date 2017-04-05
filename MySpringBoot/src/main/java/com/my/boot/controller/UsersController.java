package com.my.boot.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.my.boot.model.Users;
import com.my.boot.service.UsersService;


@Controller
@RequestMapping("/users")
public class UsersController {
	
	@Autowired
	private UsersService usersService;
	
	@RequestMapping("/usersList")
	public String userList(Model model){
		List<Users> users =  usersService.userList();
		model.addAttribute("users", users);
		return "/users/users";
	}

}
