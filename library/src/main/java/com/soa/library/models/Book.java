package com.soa.library.models;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Book {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int id;
	public String title;
	public String genre;
	public String author;
	public float price;
	public Book () {}
	public Book(String title, String author) {
		super();
		title = title;
		author = author;
	}
	public Book(int id, String title, String genre, String author, float price) {
		super();
		id = id;
		title = title;
		genre = genre;
		author = author;
		price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		title = title;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		genre = genre;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		author = author;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		price = price;
	}
	
	
	
	
	
	

}
