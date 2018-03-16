package fr.gkj.rest.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


/*
 * p242
 */
@Path("/hello")
public class HelloService
{
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String sayHelloText()
	{
		return "hello";
	}
	
	@GET
	@Produces(MediaType.TEXT_XML)
	public String sayHelloXml()
	{
		return "<?xml version:\"1.0\"?><hello>Helloo</hello>";
	}
}
