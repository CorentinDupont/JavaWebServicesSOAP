package io.helyx.webserviceserver.controllers;

import io.helyx.webserviceserver.database.PostgreSQLJDBC;
import io.helyx.webserviceserver.models.Author;

import java.sql.Connection;
import java.sql.SQLException;

public abstract class BaseController<T> implements ICrudController<T> {
	
	public Connection dbConnection;
	
	public BaseController() {
		this.dbConnection = PostgreSQLJDBC.getInstance().connection;
	}

	public abstract T[] readAll() throws SQLException;

	public abstract T create(T object) throws SQLException;

	public abstract T read(int id) throws SQLException;

	public abstract T update(int id, T object) throws SQLException;

	public abstract void delete(int id) throws SQLException;
}
