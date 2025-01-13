package com.ram.spring.orm.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ram.spring.orm.config.RamConfig;
import com.ram.spring.orm.model.DAOImpl.UserDAOImpl;
import com.ram.spring.orm.model.entity.User;

public class Launch {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext apx = new AnnotationConfigApplicationContext(RamConfig.class);
		
		 User user = (User) apx.getBean("user");
		 UserDAOImpl udaoimpl = new UserDAOImpl();
		 udaoimpl.insertUser(user);
		 System.out.println(user);
		 apx.close();
	}

}
