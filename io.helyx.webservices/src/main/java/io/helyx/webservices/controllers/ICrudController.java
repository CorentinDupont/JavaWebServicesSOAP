package io.helyx.webservices.controllers;

import java.sql.SQLException;

import io.helyx.webservices.models.Author;

public interface ICrudController<T> {
	T readAll() throws SQLException;
	
	T create(Author author) throws SQLException;
	
	T read(int id) throws SQLException;
	
	T update(int id, Author author) throws SQLException;
	
	void delete(int id) throws SQLException;
}
