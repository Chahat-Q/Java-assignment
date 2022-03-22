package com.bookApp.web.controller;
import java.util.*;

import com.bookApp.model.dao.Book;
import com.bookApp.model.services.BookService;
import com.bookApp.model.services.BookServiceImpl;

public class Main {
	public static void main(String[] args) {
		BookService bookService=new BookServiceImpl();
		List<Book>books=bookService.getAll();
		for(Book book: books) {
			System.out.println(book);
		}
		Book book=new Book("Candle light", 8000);
		bookService.addBook(book);
	}
}
