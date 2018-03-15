package fr.futurskill.formation.dao;

import java.util.List;

import fr.futurskill.formation.business.Joueur;

public interface JoueurDAO {
	public List<Joueur> getAll();
	
	public Joueur get(int id);
}
