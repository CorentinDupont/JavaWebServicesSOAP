package io.helyx.webservices;

import java.sql.SQLException;

import io.helyx.webservices.controllers.AuthorController;
import io.helyx.webservices.database.PostgreSQLJDBC;
import io.helyx.webservices.models.Author;

public class Main {

	public static void main(String[] args) {
		// Endpoint.publish("http://localhost:9998/ws/hello", new HelloWorld());
		PostgreSQLJDBC pgsj = PostgreSQLJDBC.getInstance();
		pgsj.init();
		
		AuthorController authorController = new AuthorController();
		Author author = new Author("Corentin", "Dupont");
		
		try {
			authorController.create(author);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
