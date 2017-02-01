 package com.example.demo.rest;

import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
/***
 * To validate this project you need to run using command line 
 * java -jar demo-swarm.jar
 * @author gagan.tyagi
 *
 */
@Path("/hello")
public class HelloWorldEndpoint {

	@GET
	@Produces("text/plain")
	public Response doGet() {
		System.out.println("@@@@ Wildfly Service Start @@@@@@@@@@@@");
		return Response.ok("Hello from WildFly Swarm!- Test Project").build();
	}
}