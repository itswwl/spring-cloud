package com.my.boot.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.my.boot.model.Userinfo;

/**
 * @author root
 *http://www.cnblogs.com/shenlanzhizun/p/5832976.html
 *
 *
 *http://blog.didispace.com/springbootmybatis/
 *
 *
 *mybatis
 */
@Mapper
public interface UserinfoMapper {

	@Select(" select * from userinfo where id = #{id} ")
	public Userinfo findById(@Param("id")String id);
	
	@Insert(" insert into userinfo (userinfo) values (#{userinfo})  ")
	public int insert(@Param("userinfo")String userinfo);
	
	@Delete(" delete from userinfo where id = #{id} ")
	public int delete(@Param("id")Long id);
	
	@Update(" update  userinfo set userinfo = #{userinfo} where id = #{id} ")
	public int update (@Param("id")Long id,@Param("userinfo")String userinfo);
	
	/**
	 * @param info
	 * @return
	 * 
	 * http://w6513017.iteye.com/blog/1512761
	 * 
	 * mybatis    like用法
	 */
	@Select(" select * from userinfo where userinfo like CONCAT('%',#{info},'%') ")
	public List<Userinfo> searchPage(@Param("info")String info);
	
}
