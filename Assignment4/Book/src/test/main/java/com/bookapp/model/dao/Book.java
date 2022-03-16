package com.bookapp.model.dao;
//DTO: data transfer object
public class Book {
	private int id;
	private String title;
	private String author;
	private double price;

	//getter setter , ctr
}


	public Book(int id,String title,String author,double price) {
		this.id = id;
		this.title = title;
		this.author = author;
this.price=price;
	}

	
	
	public Book(int id,String title,String author,double price) {
		this.id = id;
		this.title = title;
		this.author = author;
this.price=price;

	}

	public Book() {}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}

public String setTitle()
{
this.title=title;
}

public String getAuthor() {
		return author;
	}
public String setAuthor()
{
this.author=author;
}


	public void setTitleString  title) {
		this.title= title;
	}

	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
     

	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", title=" + title + ", author=" + author + ", price=" + price+ "]";
	}
	
	
}
