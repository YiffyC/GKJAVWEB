package fr.gkj.ws;

import javax.jws.WebService;

@WebService
public class HelloWorldImpl implements HelloWorld {

	@Override
	public String sayHello(String text) {
		return "Hello " + text;
	}

}
