package io.helyx.webserviceserver;

import io.helyx.webserviceserver.services.AuthorService;
import io.helyx.webserviceserver.database.PostgreSQLJDBC;

import javax.xml.ws.Endpoint;

public class Main {

	public static void main(String[] args) {
		PostgreSQLJDBC pgsj = PostgreSQLJDBC.getInstance();
		pgsj.init();

		Endpoint.publish("http://localhost:9998/ws/author", new AuthorService());

//		AuthorController authorController = new AuthorController();
//		Author author = new Author("Corentin", "Dupont");
//
//		try {
//			authorController.create(author);
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}

}
