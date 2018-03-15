package com.gkj.jpa.cmdline;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gkj.jpa.dao.ClientDAO;
import com.gkj.jpa.model.Client;

public class TestListClients {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		
		ClientDAO dao = context.getBean(ClientDAO.class);
		List<Client> clients = dao.findAll();
		
		clients.forEach(System.out::println);

	}

}
