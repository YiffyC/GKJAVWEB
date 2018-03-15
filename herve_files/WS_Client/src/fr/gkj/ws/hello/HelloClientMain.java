package fr.gkj.ws.hello;

import java.net.URL;

import javax.xml.namespace.QName;

public class HelloClientMain {

	public static void main(String[] args) throws Exception {
		HelloWorldService service = new HelloWorldService(new URL("http://10.33.131.117:80/HelloWorld?wsdl"));//, new QName("http://server.cxf.com/", "HelloWorldService"));
		System.out.println(service.getServiceName());
		
		HelloWorld world = service.getHelloWorldPort();
		
		String texte2 = world.sayHello("Test");
		
		System.out.println("Got '" + texte2 + "'");
	}

}
