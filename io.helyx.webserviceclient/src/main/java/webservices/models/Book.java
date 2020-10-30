package webservices.models;

public class Book {
	
	private String title;
	private String isbn;
	private String authorId;
	
	public Book(String title, String isbn, String authorId) {
		super();
		this.title = title;
		this.isbn = isbn;
		this.authorId = authorId;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getIsbn() {
		return isbn;
	}
	
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	public String getAuthorId() {
		return authorId;
	}
	
	public void setAuthorId(String authorId) {
		this.authorId = authorId;
	}
	
	

}
