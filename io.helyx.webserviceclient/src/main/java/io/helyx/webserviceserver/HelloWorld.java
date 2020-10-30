package io.helyx.webserviceserver;

import javax.jws.WebService;

@WebService(endpointInterface="io.helyx.webservices.IHelloWorld")
public class HelloWorld implements IHelloWorld {

	public String getHelloWorldAsString(String name) {
		return "Hello World " + name;
	}

}
