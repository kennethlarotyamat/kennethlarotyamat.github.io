package edu.unlv.mis768.kly;

public class Book {
	
	// field
	private String id;
	private String author;
	private String title;
	private String genre;
	private double price;
	
	
	public Book(String id, String author, String title, String genre, double price) {
		super();
		this.id = id;
		this.author = author;
		this.title = title;
		this.genre = genre;
		this.price = price;
	}
	
	public Book () {}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

}
// D:\GitHub\MIS76810032024Sprg\src\MIS768\book.xml