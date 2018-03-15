package com.gkj.jpa.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gkj.jpa.model.Agent;

public interface AgentDAO extends JpaRepository<Agent, Integer> {
	public List<Agent> findByNom(String nom);
}
