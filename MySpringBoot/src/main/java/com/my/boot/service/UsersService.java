package com.my.boot.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.my.boot.dao.UsersDao;
import com.my.boot.model.Users;


@Service
public class UsersService {
	
	@Autowired
	private UsersDao usersDao;
	
	
	@Transactional(readOnly = true)
	public Users findByNp(String name,String pwd){
		try {
			return usersDao.findByUP(name, pwd);
		} catch (Exception e) {
			throw new RuntimeException();
		}
	}
	
	@Transactional(readOnly = true)
	public Users findById(Long id){
		try {
			return usersDao.findOne(id);
		} catch (Exception e) {
			throw new RuntimeException();
		}
	}
	
	@Transactional(rollbackFor = {Exception.class})
	public Users save(Users user){
		try {
			return usersDao.save(user);
		} catch (Exception e) {
			throw new RuntimeException();
		}
	}
	
	@Transactional(rollbackFor = {Exception.class})
	public Users update(Users user){
		try {
			return usersDao.save(user);
		} catch (Exception e) {
			throw new RuntimeException();
		}
	}
	
	@Transactional(rollbackFor = {Exception.class})
	public void delete(Long id){
		try {
			usersDao.delete(id);
		} catch (Exception e) {
			throw new RuntimeException();
		}
	}
	
	@Transactional(readOnly = true)
	public List<Users> userList(){
		try {
			return (List<Users>) usersDao.findAll();
		} catch (Exception e) {
			throw new RuntimeException();
		}
	}
	
	@Transactional(readOnly = true)
	public Page<Users> searchByPage(final Map<String,Object> map){
		try {
			List<Sort.Order> orders=new ArrayList();
            orders.add(new Sort.Order(Sort.Direction.DESC,"id"));
            
            Sort sort = new Sort(orders);//(Sort.Direction.DESC,"id");
            Pageable pageable = new PageRequest(Integer.valueOf(map.get("number").toString()), Integer.valueOf(map.get("size").toString()), sort);
            
            return usersDao.findAll(new Specification<Users>() {

            	 public Predicate toPredicate(Root<Users> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
                     Predicate predicate = criteriaBuilder.conjunction();
                     if(map!=null){
                         String name = map.get("name").toString();
                         if(name!=null){
                             predicate.getExpressions().add(criteriaBuilder.equal(root.<String>get("name"), name));
                         }
                     }
                     return predicate;
                 }
			},pageable);
		} catch (Exception e) {
			throw new RuntimeException();
		}
	}

}
