package ws;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import metier.Compte;

@WebService(serviceName="BanqueWS")
public class BanqueService {
	@WebMethod(operationName="conversionEuroToD")
	public double conversion(@WebParam(name="montant") double mt){
		return mt*1.11;
	}
	
	@WebMethod
	public Compte getCompte(@WebParam(name="code") long code){
		return new Compte(code, code*1000, new Date());
	}
	
	@WebMethod
	public List<Compte> getComptes(){
		List<Compte> comptes = new ArrayList<>();
		comptes.add(new Compte(1L, 700, new Date()));
		comptes.add(new Compte(5L, 500, new Date()));
		comptes.add(new Compte(8L, 800, new Date()));
		
		return comptes;
	}
}
