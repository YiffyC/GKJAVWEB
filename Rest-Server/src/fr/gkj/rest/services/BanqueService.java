package fr.gkj.rest.services;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.websocket.server.PathParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import metier.Compte;


@Path("/banque")
public class BanqueService
{
	@GET
	@Path("/conversion/{montant}")
	public double conversion(@PathParam("montant") double mt)
	{
		return mt*1.11;
	}
	
	@GET
	@Path("/{code}")
	@Produces({MediaType.APPLICATION_ATOM_XML, MediaType.APPLICATION_JSON})
	public Compte getCompte(@PathParam("code")long code)
	{
		return new Compte(code, 7000, new Date());
	}
	

	@GET
	@Path("/comptes")
	@Produces({MediaType.APPLICATION_ATOM_XML, MediaType.APPLICATION_JSON})
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