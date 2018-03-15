package com.gkj.jpa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="agents")
public class Agent {
	@Id @GeneratedValue
	@Column(name="a_id")
	private int id;
	
	@Column(name="a_nom")
	private String nom;
	
	@Column(name="a_prenom")
	private String prenom;

	public int getId() {
		return id;
	}

	public String getNom() {
		return nom;
	}

	public String getPrenom() {
		return prenom;
	}

	@Override
	public String toString() {
		return "Agent [id=" + id + ", nom=" + nom + ", prenom=" + prenom + "]";
	}
}
