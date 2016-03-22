import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.glassfish.jersey.client.ClientConfig;
import org.glassfish.jersey.filter.LoggingFilter;

public class ClientTest {

	// private static String url =
	// "http://localhost:8080/JavaRESTJerseyExample/api/hello";

	// @Test
	public static void main(String[] args) {
		Client client = ClientBuilder.newClient(new ClientConfig().register(LoggingFilter.class));
		WebTarget webTarget = client.target("http://localhost:8080/JavaRESTJerseyExample/api").path("hello");
		Invocation.Builder invocationBuilder = 
				webTarget.request(MediaType.TEXT_PLAIN);
		Response response = invocationBuilder.get();

		System.out.println(response.getStatus());
	     
		
		System.out.println(response.readEntity(String.class));
		/*
		 * WebTarget webTarget = client.target(url); String response =
		 * webTarget.request().get(String.class); System.out.println(response);
		 */
	}
}
