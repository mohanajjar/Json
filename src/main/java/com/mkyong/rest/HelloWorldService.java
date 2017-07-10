package com.mkyong.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import com.mkyong.models.Order;
import com.mkyong.models.Product;

@Path("/test")
public class HelloWorldService {

	// @Inject
	private HelloService helloService;
	private Order order;
	private List<Product> products;

	public HelloWorldService() {
		init();
	}

	private void init() {
		helloService = new HelloService();
		order = new Order();
		products = new ArrayList<Product>();

		Product p1 = new Product(1, "10101010", "PC");
		Product p2 = new Product(1, "20202020", "tablette");
		products.add(p1);
		products.add(p2);

		order.setId(1);
		order.setProducts(products);
	}

	@GET
	@Path("/{param}")
	public Response getMsg(@PathParam("param") String msg) {

		String output = "hello " + msg.trim();

		return Response.status(200).entity(output).build();

	}

	@GET
	@Path("/json")
	@Produces({ "application/json" })
	public String getHelloWorldJSON() {
		return "{\"result\":\"" + helloService.createHelloMessage("World") + "\"}";
	}

	@GET
	@Path("/xml")
	@Produces({ "application/xml" })
	public String getHelloWorldXML() {
		return "<xml><result>" + helloService.createHelloMessage("World") + "</result></xml>";
	}

	@GET
	@Path("/listProducts")
	@Produces({ "application/json" })
	public ArrayList<Product> getAllProducts() {
		return (ArrayList<Product>) products;
	}

	@GET
	@Path("/orderId/{id}")
	@Produces({ "application/json" })
	public Order getOrder(@PathParam(value = "id") Integer id) {
		return order;
	}

}