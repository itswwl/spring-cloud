package com.my.boot.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.my.boot.model.Users;
import com.my.boot.service.UsersService;

@RequestMapping("/restUsers")
@RestController
public class UsersRestController {

	@Autowired
	private UsersService usersService;

	@RequestMapping("/findByNp/{name}/{pwd}")
	public Users findByNp(@PathVariable("name") String name,
			@PathVariable("pwd") String pwd) {
		return usersService.findByNp(name, pwd);
	}

	@RequestMapping("/findById/{id}")
	public Users findById(@PathVariable("id") Long id) {
		return usersService.findById(id);
	}

	@RequestMapping("/save")
	public Users save() {

		Users user = new Users(3L, "ww", "ww");
		return usersService.save(user);

	}

	@RequestMapping("/update")
	public Users update(HttpServletRequest request) {

		Users user = new Users();
		if (StringUtils.isNotBlank(request.getParameter("id"))) {
			user.setId(Long.valueOf(request.getParameter("id")));
		}
		if (StringUtils.isNotBlank(request.getParameter("name"))) {
			user.setName(request.getParameter("name"));
		}
		if (StringUtils.isNotBlank(request.getParameter("pwd"))) {
			user.setPwd(request.getParameter("pwd"));
		}

		return usersService.update(user);

	}

	@RequestMapping("/delete/{id}")
	public void delete(@PathVariable("id") Long id) {

		usersService.delete(id);

	}

	@RequestMapping("/userList")
	public List<Users> userList() {

		return (List<Users>) usersService.userList();

	}

	@RequestMapping("/searchByPage")
	public Page<Users> searchByPage(HttpServletRequest request) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("number", 0);
		map.put("size", 2);
		map.put("name", "test");
		return usersService.searchByPage(map);
	}

}
