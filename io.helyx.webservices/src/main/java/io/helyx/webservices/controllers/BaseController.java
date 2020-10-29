package io.helyx.webservices.controllers;

import java.sql.Connection;
import java.sql.SQLException;

import io.helyx.webservices.database.PostgreSQLJDBC;
import io.helyx.webservices.models.Author;

public abstract class BaseController<T> implements ICrudController<T> {
	
	public Connection dbConnection = null;
	
	public BaseController() {
		this.dbConnection = PostgreSQLJDBC.getInstance().connection;
	}

	public abstract T readAll() throws SQLException;

	public abstract T create(Author author) throws SQLException;

	public abstract T read(int id) throws SQLException;

	public abstract T update(int id, Author author) throws SQLException;

	public abstract void delete(int id) throws SQLException;
}
