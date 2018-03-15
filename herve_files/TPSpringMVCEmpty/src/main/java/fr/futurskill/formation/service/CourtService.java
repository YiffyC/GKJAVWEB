package fr.futurskill.formation.service;

import java.util.List;

import fr.futurskill.formation.business.Court;

public interface CourtService {
	public List<Court> getAll();
	
	public Court get(int id);
}
