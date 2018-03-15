package com.gkj.jpa.cmdline;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gkj.jpa.dao.ClientDAO;
import com.gkj.jpa.dao.CompteDAO;
import com.gkj.jpa.model.Client;
import com.gkj.jpa.model.Compte;

public class TestComptesByNomGestionnaire {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		
		CompteDAO dao = context.getBean(CompteDAO.class);
		List<Compte> comptes = dao.findComptesByNomGestionnaire("Kiervel");
		
		comptes.forEach(System.out::println);

	}

}
