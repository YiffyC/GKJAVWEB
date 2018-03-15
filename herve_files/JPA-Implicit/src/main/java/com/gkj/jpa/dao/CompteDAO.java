package com.gkj.jpa.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.gkj.jpa.model.Compte;

public interface CompteDAO extends JpaRepository<Compte, Integer> {
	
	@Query("select c from com.gkj.jpa.model.Compte c where c.solde <= :solde")
	public List<Compte> findComptesEnDessousSolde(@Param("solde") int solde);
	
	@Query("select c from com.gkj.jpa.model.Compte c, com.gkj.jpa.model.Agent a where (c.gestionnaire = a) and (a.nom =  ?1)")
	public List<Compte> findComptesByNomGestionnaire(String nom);
}
