package fr.futurskill.formation.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.futurskill.formation.business.Joueur;
import fr.futurskill.formation.dao.JoueurDAO;
import fr.futurskill.formation.service.JoueurService;

@Service
public class JoueurServiceImpl implements JoueurService {
	@Autowired
	private JoueurDAO dao;
	
	@Override
	public List<Joueur> getAll() {
		return dao.getAll();
	}

	@Override
	public Joueur get(int id) {
		return dao.get(id);
	}

}
