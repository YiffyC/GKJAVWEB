package com.gkj.jpa.dao;

import java.util.List;

import com.gkj.jpa.model.Compte;

public interface CustomDAO {
	public Compte find(int id);
	
	public List<Compte> getComptesRiches();
	
	public List<Compte> getComptesPauvres();
}
