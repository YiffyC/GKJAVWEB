package fr.futurskill.formation.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import fr.futurskill.formation.business.Joueur;
import fr.futurskill.formation.dao.JoueurDAO;

@Repository
public class JoueurDaoImpl implements JoueurDAO {
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	@SuppressWarnings("unchecked")
	public List<Joueur> getAll() {
		Session session = sessionFactory.openSession();
		return session.createQuery("from Joueur").list();
	}

	@Override
	public Joueur get(int id) {
		Session session = sessionFactory.openSession();
		return (Joueur)session.get(Joueur.class, id);
	}
}
