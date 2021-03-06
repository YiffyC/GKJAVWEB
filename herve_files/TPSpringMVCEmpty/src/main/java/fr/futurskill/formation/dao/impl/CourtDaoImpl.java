package fr.futurskill.formation.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import fr.futurskill.formation.business.Court;
import fr.futurskill.formation.dao.CourtDAO;

public class CourtDaoImpl implements CourtDAO{
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	@SuppressWarnings("unchecked")
	public List<Court> getAll() {
		Session session = sessionFactory.openSession();
		return session.createQuery("from Court").list();
	}

	@Override
	public Court get(int id) {
		Session session = sessionFactory.openSession();
		return (Court)session.get(Court.class, id);
	}

}
