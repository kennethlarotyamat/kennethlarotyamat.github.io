package edu.unlv.mis768;


public class ImprovedBook {
	
	// field
	private String id;
	private String author;
	private String title;
	private String genre;
	private double price;
	
	
	public ImprovedBook(String id, String author, String title, String genre, double price) {
		super();
		this.id = id;
		this.author = author;
		this.title = title;
		this.genre = genre;
		this.price = price;
	}
	
	public ImprovedBook () {}
	
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
	public String toString() {
		return "\""+this.id+"\",\""+this.author+"\",\""+this.title+"\",\""+this.genre+"\",\""+this.price+"\""; // return """+this.id+"\",\""+this.author+"\",\""+this.title+"\",\""+this.genre+"\",\""+this.price+"\""; // return "\""+this.id+"\",\""+this.author+"\",\""+this.title+"\",\""+this.genre+"\",\""+this.price+"\""; // commented out the original line of code. // return this.id+","+this.author+","+this.title+","+this.genre+","+this.price;
	}

}
// D:\GitHub\MIS76810032024Sprg\src\MIS768\book.xml