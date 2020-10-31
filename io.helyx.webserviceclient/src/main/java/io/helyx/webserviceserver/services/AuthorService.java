package io.helyx.webserviceserver.services;

import io.helyx.webserviceserver.controllers.AuthorController;
import io.helyx.webserviceserver.models.Author;

import javax.jws.WebParam;
import javax.jws.WebService;
import java.sql.SQLException;
import java.util.ArrayList;

@WebService(endpointInterface="io.helyx.webserviceserver.services.IAuthorService")
public class AuthorService implements IAuthorService {

	AuthorController authorController = new AuthorController();

	public Author[] readAll() throws SQLException {
		return this.authorController.readAll();
	}

	public Author create(Author author) throws SQLException {
		return this.authorController.create(author);
	}

//	@WebMethod(operationName = "readAuthor")
//	public Author read(Long id) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@WebMethod(operationName = "updateAuthor")
	public Author update(int id, Author author) throws SQLException {
		return authorController.update(id, author);
	}
//
//	@WebMethod(operationName = "deleteAuthor")
//	public void delete(Long id) {
//		// TODO Auto-generated method stub
//	}

}
