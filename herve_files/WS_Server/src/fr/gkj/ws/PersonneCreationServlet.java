package fr.gkj.ws;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PersonneCreationServlet extends HttpServlet {
	private PersonneService service;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String nom = req.getParameter("nom");
		String prenom = req.getParameter("prenom");
		int age = Integer.parseInt(req.getParameter("age"));
		
		Personne P = new Personne();
		P.setAge(age);
		P.setNom(nom);
		P.setPrenom(prenom);
		
		service.create(P);
		
		//////
		
		super.doPost(req, resp);
	}
	
}
