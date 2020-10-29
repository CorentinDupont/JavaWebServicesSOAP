package io.helyx.webservices.database.requests;

public class TableRequests {
	
	/**
	 * PostgreSQL string to create the Author table.
	 */
	public static String CREATE_AUTHOR_TABLE = ""+
		"CREATE TABLE IF NOT EXISTS author (" +
		    "id				serial primary key, " +
		    "firstName      text    			not null, " +
		    "lastName       text    			not null" +
	    ")";
	
	/**
	 * PostgreSQL string to create the Book table.
	 */
	public static String CREATE_BOOK_TABLE = ""+
		"CREATE TABLE IF NOT EXISTS book (" +
		    "id				serial primary key  not null, " +
		    "title      	text    			not null, " +
		    "isbn       	varchar(13)    		not null, " +
		    "authorId   	int					references author" +
	    ")";

}
