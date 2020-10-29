package io.helyx.webservices;

import io.helyx.webservices.database.PostgreSQLJDBC;

public class Main {

	public static void main(String[] args) {
		// Endpoint.publish("http://localhost:9998/ws/hello", new HelloWorld());
		PostgreSQLJDBC pgsj = new PostgreSQLJDBC();
		
		pgsj.init();
	}

}
