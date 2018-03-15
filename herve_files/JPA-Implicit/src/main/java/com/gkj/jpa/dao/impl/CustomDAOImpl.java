package com.gkj.jpa.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gkj.jpa.dao.CustomDAO;
import com.gkj.jpa.model.Compte;

@Repository
public class CustomDAOImpl implements CustomDAO {
	@Autowired
	EntityManager em;
	
	@Override
	public Compte find(int id) {
		return em.find(Compte.class, id);
	}
	
	@Override
	public List<Compte> getComptesPauvres() {
		TypedQuery<Compte> query = em.createNamedQuery("comptes.pauvres", Compte.class);
		query.setParameter("soldemin", 50);
		
		return query.getResultList();
	}

	@Override
	public List<Compte> getComptesRiches() {
		TypedQuery<Compte> query = em.createNamedQuery("comptes.riches", Compte.class);
		query.setParameter(1, 10000);
		
		return query.getResultList();
	}

}
