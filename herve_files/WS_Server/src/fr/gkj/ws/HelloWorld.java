package fr.gkj.ws;

import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public interface HelloWorld {
	public String sayHello(@WebParam(name="texte") String text);
}
