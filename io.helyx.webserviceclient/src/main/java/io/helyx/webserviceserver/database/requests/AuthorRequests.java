package io.helyx.webserviceserver.database.requests;

public class AuthorRequests {
	
	public static String TABLE_NAME = "author";
	public static String READ_ALL = "SELECT * FROM " + TABLE_NAME;
	public static String CREATE_ONE = "INSERT INTO " + TABLE_NAME + " (firstName, lastName) VALUES(?, ?)";
}
