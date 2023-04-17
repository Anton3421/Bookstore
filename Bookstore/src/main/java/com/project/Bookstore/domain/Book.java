package com.project.Bookstore.domain;
import jakarta.persistence.Entity;

@Entity
public class Book {

	private String title;
	private String author;
	private String publicationYear;
	private String isbn;
	private String price;
	
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public String getPublicationYear() {
		return publicationYear;
	}
	public String getIsbn() {
		return isbn;
	}
	public String getPrice() {
		return price;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setPublicationYear(String publicationYear) {
		this.publicationYear = publicationYear;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	
}
