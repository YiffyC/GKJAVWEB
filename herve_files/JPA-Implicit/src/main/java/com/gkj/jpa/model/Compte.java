package com.gkj.jpa.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity(name="comptes")
@NamedQueries({
@NamedQuery(name="comptes.riches", query="select c from com.gkj.jpa.model.Compte c where c.solde >= ?1"),
@NamedQuery(name="comptes.pauvres", query="select c from com.gkj.jpa.model.Compte c where c.solde < :soldemin"),
})
public class Compte {
	@Id @GeneratedValue
	private int id;
	private String libelle;
	private int solde;
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="gestionnaire")
	private Agent gestionnaire;
	
	public int getId() {
		return id;
	}
	public String getLibelle() {
		return libelle;
	}
	public int getSolde() {
		return solde;
	}
	@Override
	public String toString() {
		return "Compte [id=" + id + ", libelle=" + libelle + ", solde=" + solde + "]";
	}
}
