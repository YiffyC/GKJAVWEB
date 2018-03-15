package com.gkj.jpa.cmdline;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gkj.jpa.dao.CustomDAO;

public class TestCustomDAOById {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		
		CustomDAO dao = context.getBean(CustomDAO.class);
		System.out.println(dao.find(1));

	}

}
