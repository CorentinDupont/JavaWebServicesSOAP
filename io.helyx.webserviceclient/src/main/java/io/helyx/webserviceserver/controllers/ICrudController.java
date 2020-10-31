package io.helyx.webserviceserver.controllers;

import io.helyx.webserviceserver.models.Author;

import java.sql.SQLException;

public interface ICrudController<T> {
	T[] readAll() throws SQLException;
	
	T create(T object) throws SQLException;
	
	T read(int id) throws SQLException;
	
	T update(int id, T object) throws SQLException;
	
	void delete(int id) throws SQLException;
}
