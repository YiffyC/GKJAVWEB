package fr.futurskill.formation.dao;

import java.util.List;

import fr.futurskill.formation.business.Court;

public interface CourtDAO {
	public List<Court> getAll();
	
	public Court get(int id);
	
	public void create(Court court);
}
