package fr.gk.tpcurrency.cmdLine;

import fr.gk.tpcurrency.business.Devise;
import fr.gk.tpcurrency.service.ConvertService;
import fr.gk.tpcurrency.service.ConvertServiceImpl;

public class Main
{

	public static void main(String[] args)
	{
		ConvertService service = new ConvertServiceImpl();
		
		double res = service.convert(1, Devise.Euro, Devise.Dollar);
		System.out.println("Result : " + res);
	}

}
