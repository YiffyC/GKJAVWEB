package com.gkj.jpa.cmdline;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gkj.jpa.dao.CustomDAO;
import com.gkj.jpa.model.Compte;

public class TestCustomDAOPauvres {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		
		CustomDAO dao = context.getBean(CustomDAO.class);
		List<Compte> comptesRiches = dao.getComptesPauvres();
		for(Compte compte: comptesRiches) {
			System.out.println(compte);
		}
	}

}
