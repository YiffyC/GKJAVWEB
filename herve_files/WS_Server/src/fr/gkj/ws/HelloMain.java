package fr.gkj.ws;

import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

public class HelloMain {

	public static void main(String[] args) {
		HelloWorld helloWorld = new HelloWorldImpl();
		
		JaxWsServerFactoryBean factory = new JaxWsServerFactoryBean();
		factory.setServiceClass(HelloWorld.class);
		factory.setAddress("http://10.33.131.115:80/HelloWorld");
		factory.setServiceBean(helloWorld);
		factory.create();

		System.out.println("Server ready...");
	}

}
