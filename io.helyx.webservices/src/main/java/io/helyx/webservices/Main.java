package io.helyx.webservices;

import javax.xml.ws.Endpoint;

public class Main {

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:9998/ws/hello", new HelloWorld());
		
	}

}
