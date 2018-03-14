package exe;

import java.rmi.RemoteException;

import ws.BanqueService;
import ws.BanqueServiceProxy;

public class ConsomationWS
{

	public static void main(String[] args) throws RemoteException
	{
		
		BanqueService service = new BanqueServiceProxy();
		
		service.getComptes();
		System.out.println(service.getCompte(1000).getSolde());

	}

}
