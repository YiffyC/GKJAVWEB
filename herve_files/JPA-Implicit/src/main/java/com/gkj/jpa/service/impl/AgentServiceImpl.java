package com.gkj.jpa.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gkj.jpa.dao.AgentDAO;
import com.gkj.jpa.model.Agent;
import com.gkj.jpa.service.AgentService;

//@Service
public class AgentServiceImpl implements AgentService {
	@Autowired
	private AgentDAO dao;
	
	@Override
	public Agent findById(int id) {
		return dao.findOne(id);
	}

	@Override
	public List<Agent> findByNom(String nom) {
		return dao.findByNom(nom);
	}

	@Override
	public List<Agent> findAll() {
		return dao.findAll();
	}

}
