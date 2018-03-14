package server;

import javax.xml.ws.Endpoint;

import ws.BanqueService;

public class ServerJWS
{

	public static void main(String[] args)
	{

		String url = "http://localhost:8585/";
		Endpoint.publish(url,  new BanqueService());
		System.out.println(url);

	}

}
