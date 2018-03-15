package com.gkj.jpa.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity(name="clients")
public class Client {
	@Id @GeneratedValue
	private int id;
	private String nom;
	private String prenom;
	@Temporal(TemporalType.DATE)
	private Date dateNaissance;
	@OneToMany(fetch=FetchType.EAGER)
	@JoinColumn(name="proprio")
	private List<Compte> comptes;
	
	public int getId() {
		return id;
	}
	public String getNom() {
		return nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public Date getDateNaissance() {
		return dateNaissance;
	}
	public List<Compte> getComptes() {
		return comptes;
	}
	
	@Override
	public String toString() {
		return "Client [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", dateNaissance=" + dateNaissance
				+ ", comptes=" + comptes + "]";
	}
}
