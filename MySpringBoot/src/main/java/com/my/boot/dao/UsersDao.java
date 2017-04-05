package com.my.boot.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.my.boot.model.Users;

/**
 * @author root
 * 
 * 
 * jpa方式  ，jpa默认实现简单的crud
 *
 */
@Repository
public interface UsersDao  extends BaseDao<Users, Long> {
	
	
	@Query(" from Users model where model.name = :n and model.pwd = :pwd ")
	public Users findByUP(@Param("n")String name,@Param("pwd")String pwd);

}
