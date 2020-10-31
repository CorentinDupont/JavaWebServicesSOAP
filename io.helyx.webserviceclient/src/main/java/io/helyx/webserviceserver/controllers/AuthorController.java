package io.helyx.webserviceserver.controllers;

import io.helyx.webserviceserver.database.requests.AuthorRequests;
import io.helyx.webserviceserver.models.Author;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class AuthorController extends BaseController<Author> {
	
	public AuthorController() {
		super();
	}

	public Author[] readAll() throws SQLException {
		Statement statement = this.dbConnection.createStatement();
		ResultSet rs = statement.executeQuery(AuthorRequests.READ_ALL);
		ArrayList<Author> authors = new ArrayList<Author>();

		while (rs.next()) {
			Author author = new Author(
				rs.getInt(rs.findColumn("id")),
				rs.getString(rs.findColumn("firstName")),
				rs.getString(rs.findColumn("lastName"))
			);
			authors.add(author);
		}

		Author[] authorsArray = new Author[authors.size()];
		return authors.toArray(authorsArray);
	}

	public Author create(Author author) throws SQLException {
		PreparedStatement pst = this.dbConnection.prepareStatement(
			AuthorRequests.CREATE_ONE,
			Statement.RETURN_GENERATED_KEYS
		);

		pst.setString(1, author.getFirstName());
		pst.setString(2, author.getLastName());
		pst.executeUpdate();

		ResultSet rs = pst.getGeneratedKeys();
		rs.next();
		author.setId(rs.getInt(1));
		pst.close();

		return author;
	}

	public Author read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public Author update(int id, Author author) throws SQLException {
		PreparedStatement pst = this.dbConnection.prepareStatement(AuthorRequests.UPDATE_ONE);

		pst.setString(1, author.getFirstName());
		pst.setString(2, author.getLastName());
		pst.setInt(3, id);
		pst.executeUpdate();
		pst.close();

		return author;
	}

	public void delete(int id) {
		// TODO Auto-generated method stub
	}
	
}
