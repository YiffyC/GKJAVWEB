package fr.gkj.tp1.cmdline;

import fr.gkj.tp1.business.Devise;
import fr.gkj.tp1.service.ConversionService;
import fr.gkj.tp1.service.impl.ConversionServiceAxisImpl;

public class Main {

	public static void main(String[] args) {
		ConversionService service = new ConversionServiceAxisImpl();
		
		double resultat = service.convert(15, Devise.EURO, Devise.Dollar);
		System.out.println("Résultat: " + resultat);
	}

}
