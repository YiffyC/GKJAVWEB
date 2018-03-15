package serveur;

import javax.xml.ws.Endpoint;

import ws.BanqueService;

public class ServeurJWS {

	public static void main(String[] args) {
		String URL = "http://localhost:8080/";
		Endpoint.publish(URL, new BanqueService());
		System.out.println("waiting for orders");
	}

}
