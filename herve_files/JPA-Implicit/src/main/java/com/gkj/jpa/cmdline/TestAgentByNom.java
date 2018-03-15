package com.gkj.jpa.cmdline;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gkj.jpa.dao.AgentDAO;
import com.gkj.jpa.model.Agent;

public class TestAgentByNom {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		
		AgentDAO dao = context.getBean(AgentDAO.class);
		List<Agent> agents = dao.findByNom("Madoff");
		for(Agent agent: agents) {
			System.out.println(agent);
		}
		
		
		/*
		AgentService service = context.getBean(AgentService.class);
		System.out.println(service.findAll());
		*/
	}

}
