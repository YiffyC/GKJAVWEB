package server;

import javax.xml.ws.Endpoint;

import ws.BanqueService;

public class ServerJWS
{

	public static void main(String[] args)
	{

		String url = "http://localhost:8080/";
		//voir wsdl http://localhost:8080/BanqueWS?wsdl
		Endpoint.publish(url,  new BanqueService());
		System.out.println(url);

	}

}
