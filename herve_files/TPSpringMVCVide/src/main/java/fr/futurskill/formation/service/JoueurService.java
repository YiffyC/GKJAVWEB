package fr.futurskill.formation.service;

import java.util.List;

import fr.futurskill.formation.business.Joueur;

public interface JoueurService {
	public List<Joueur> getAll();
	
	public Joueur get(int id);
}
