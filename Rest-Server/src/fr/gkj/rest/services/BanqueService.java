package fr.gkj.rest.services;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import metier.Compte;



public class BanqueService
{
	public double conversion(double mt)
	{
		return mt*1.11;
	}
	
	public Compte getCompte(long code)
	{
		return new Compte(code, 7000, new Date());
	}
	

	public List<Compte> getComptes()
	{
		List<Compte> cpts = new ArrayList<Compte>();
		cpts.add(new Compte(1, 1000, new Date()));
		cpts.add(new Compte(2, 2000, new Date()));
		cpts.add(new Compte(3, 3000, new Date()));
		cpts.add(new Compte(4, 4000, new Date()));
		cpts.add(new Compte(5, 5000, new Date()));
		
		return cpts;
	}
	
}