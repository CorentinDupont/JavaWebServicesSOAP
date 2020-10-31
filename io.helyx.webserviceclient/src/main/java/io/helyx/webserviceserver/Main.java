package io.helyx.webserviceserver;

import io.helyx.webserviceserver.controllers.AuthorController;
import io.helyx.webserviceserver.models.Author;
import io.helyx.webserviceserver.services.AuthorService;
import io.helyx.webserviceserver.database.PostgreSQLJDBC;

import javax.xml.ws.Endpoint;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) throws SQLException {
		PostgreSQLJDBC pgsj = PostgreSQLJDBC.getInstance();
		pgsj.init();

//		Endpoint.publish("http://localhost:9998/ws/author", new AuthorService());

		AuthorController authorController = new AuthorController();
		Author author = new Author("Corentin", "Dupont");

		authorController.create(author);

		Author[] authors = authorController.readAll();

		for( Author authorTemp : authors ) {
			System.out.println(authorTemp.getId() + ": " + authorTemp.getFirstName());
		}
	}

}
