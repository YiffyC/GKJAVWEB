package fr.gkj.tp0;

import NET.webserviceX.www.LengthUnitSoap;
import NET.webserviceX.www.LengthUnitSoapProxy;
import NET.webserviceX.www.Lengths;

public class Main {

	public static void main(String[] args) throws Exception
	{
		//LengthUnitSoap <-- interface
		LengthUnitSoap service = new LengthUnitSoapProxy();
		
		double resultat = service.changeLengthUnit(1, Lengths.Feet, Lengths.Centimeters);
		System.out.println(resultat);
		
	}

}
