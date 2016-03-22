package org.sample.test;

import java.awt.List;
import java.util.ArrayList;

//package test;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.sample.test.model.Customer;

@Path("hello")
public class Hello {
	// This method is called if TEXT_PLAIN is request
	@GET
	// @Produces(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	public String sayPlainTextHello() {
		return "Hello Jersey 12345676";
	}

	// This method is called if XML is request
	@GET
	@Produces(MediaType.TEXT_XML)
	public String sayXMLHello() {
		return "" + " Hello Jersey" + "";
	}

	// This method is called if HTML is request
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String sayHtmlHello() {
		 //return "JsonExample [title=hello, singer=22]";
		 Customer customer = new Customer();
		 customer.set_Name("Andy");
		return "<html> " + "<title>" + "Hello Jersey"+customer.get_Name() + "</title>" + "<body><h1>" + "Hello Jersey" + "</h1></body>"
				+ "</html> ";
	}

//	
//	@GET
//	@Produces(MediaType.TEXT_PLAIN)
//	public String sayHtmlHello2() {
//		Customer customer = new Customer();
//		return "99999 ";
//	}
//	
	// Self test
//	@Path("/GetJson")
//	@GET
//	// @Produces({"application/xml; qs=0.9", "application/json"})
//	@Produces(MediaType.APPLICATION_JSON)
//	// @Produces({"application/xml", "application/json"})
//	public Response getAlls() {
//		Customer customer = new Customer();
//		customer.set_Name("Andy");
//		customer.set_Name("Bob");
//		customer.set_Name("Test");
//		GenericEntity<Customer> entity = new GenericEntity<Customer>(customer, Customer.class);
//		return Response.ok().entity(entity).build();
//	}
	
	@GET
	@Path("/GetJson")
	@Produces(MediaType.APPLICATION_JSON)
	public Customer getAlls() {
		Customer customer = new Customer();
		customer.set_Name("Andy");

		return customer;
	}
}
