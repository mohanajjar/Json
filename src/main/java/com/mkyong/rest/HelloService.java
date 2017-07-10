package com.mkyong.rest;

import javax.inject.Named;

/**
 * A simple CDI service which is able to say hello to someone
 */
@Named("helloService")
public class HelloService {

	public String createHelloMessage(String name) {
		return "Hello " + name + "!";
	}

}
