package com.gkj.jpa.service;

import java.util.List;

import com.gkj.jpa.model.Agent;

public interface AgentService {
	public Agent findById(int id);
	
	public List<Agent> findByNom(String nom);
	
	public List<Agent> findAll();
}
