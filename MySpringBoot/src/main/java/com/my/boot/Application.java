package com.my.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author root
 * 
 * 
 * 此项目  是  maven项目       maven并没有分子项目
 * 
 * 使用spring boot   
 * 
 * data option   数据操作   
 * 
 * jpa    jpa  Spring 默认实现简单的crud
 * 
 * 
 * mybatis  (使用注解方式)
 * 
 * 参考
 * http://www.cnblogs.com/shenlanzhizun/p/5832976.html
 *
 *
 * http://blog.didispace.com/springbootmybatis/
 * 
 * 
 * http://www.jianshu.com/p/5ef281100bb6   这个还没有看
 * 
 * 如有复杂sql可使用JDBCTeplate
 * 
 * 
 * 这个醒目的mybatis没有使用xml而是注解
 * 
 * mybatis的分页插件没有      http://412887952-qq-com.iteye.com/blog/2303121
 * 
 * mybatis常用那些插件？
 * 
 * view  视图层
 * 
 * 
 * thymeleaf  
 * 
 * 可在resources中的static中添加css,js,images
 * 
 * 可在resource中的templates添加html文件 
 * 
 * 
 * 请注意 thymeleaf严格解析h5,请注意h5写法的严谨
 * 
 *
 */
@SpringBootApplication
@ComponentScan(basePackages ={"com.my.boot.model","com.my.boot.dao","com.my.boot.service","com.my.boot.controller","com.my.boot.configer"})
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
