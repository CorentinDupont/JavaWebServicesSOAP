package webservices.database.requests;

public class AuthorRequests {
	
	public static String TABLE_NAME = "author";
	public static String CREATE_ONE = "INSERT INTO " + TABLE_NAME + " (firstName, lastName) VALUES(?, ?)";
}
