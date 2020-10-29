package io.helyx.webservices.database;

public class TableRequests {
	
	/**
	 * @static
	 * PostgreSQL string to create the Author table.
	 */
	public static String CREATE_AUTHOR_TABLE = ""+
		"CREATE TABLE author (" +
		    "id				int primary key    	not null, " +
		    "firstName      text    			not null, " +
		    "lastName       text    			not null" +
	    ")";
	
	/**
	 * @static
	 * PostgreSQL string to create the Book table.
	 */
	public static String CREATE_BOOK_TABLE = ""+
		"CREATE TABLE book (" +
		    "id				int primary key    	not null, " +
		    "title      	text    			not null, " +
		    "isbn       	varchar(13)    		not null, " +
		    "authorId   	int					references author" +
	    ")";

}
