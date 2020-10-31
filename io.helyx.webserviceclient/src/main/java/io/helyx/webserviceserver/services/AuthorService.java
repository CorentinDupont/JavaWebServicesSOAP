package io.helyx.webserviceserver.services;

import io.helyx.webserviceserver.controllers.AuthorController;
import io.helyx.webserviceserver.models.Author;

import javax.jws.WebService;
import java.sql.SQLException;

@WebService(endpointInterface="io.helyx.webserviceserver.services.IAuthorService")
public class AuthorService implements IAuthorService {

	AuthorController authorController = new AuthorController();

	public Author[] readAll() throws SQLException {
		return this.authorController.readAll();
	}

	public Author create(Author author) throws SQLException {
		return this.authorController.create(author);
	}

	public Author read(int id) throws SQLException {
		return this.authorController.read(id);
	}

	public Author update(int id, Author author) throws SQLException {
		return authorController.update(id, author);
	}

	public void delete(int id) throws SQLException {
		authorController.delete(id);
	}
}
