package io.helyx.webservices.models;

public class Author {
	
	private String firstName;
	private String lastName;
	private String[] booksIds;
	
	public Author(String firstName, String lastName, String[] booksIds) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.booksIds = booksIds;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String[] getBooksIds() {
		return booksIds;
	}

	public void setBooksIds(String[] booksIds) {
		this.booksIds = booksIds;
	}
	
	
	
}
