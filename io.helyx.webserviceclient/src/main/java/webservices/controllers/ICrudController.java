package webservices.controllers;

import webservices.models.Author;

import java.sql.SQLException;

public interface ICrudController<T> {
	T readAll() throws SQLException;
	
	T create(Author author) throws SQLException;
	
	T read(int id) throws SQLException;
	
	T update(int id, Author author) throws SQLException;
	
	void delete(int id) throws SQLException;
}
