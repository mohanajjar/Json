package com.mkyong.rest.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.mkyong.rest.HelloWorldService;

import io.github.binout.jaxrsunit.JaxrsResource;
import io.github.binout.jaxrsunit.JaxrsResponse;
import io.github.binout.jaxrsunit.JaxrsServer;
import io.github.binout.jaxrsunit.JaxrsUnit;

public class HelloTest {
	private JaxrsServer server;

	
	@Before
	public void init() {
		server = JaxrsUnit.newServer(HelloWorldService.class);
	}

	@Test
	public void should_return_hello() {
		JaxrsResource resource = server.resource("test/najjar");

		JaxrsResponse response = resource.get();

		Assert.assertEquals(response.ok(), true);
		Assert.assertEquals(response.content(), "hello najjar");
	}
}