package com.bookapp.web.controller;
import java.util.*;

import com.bookapp.model.dao.Book;
import com.bookapp.model.service.BookService;
import com.bookapp.model.service.BookServiceImpl;

public class DemoBookApp {

	public static void main(String[] args) {
		BookService bookService=new BookServiceImpl();
		List<Book>books=bookService.getAll();
//		System.out.println("all book....");
//		for(Book book: books)
//			System.out.println(book);
//		Book book=bookService.findById(11);
//		System.out.println(book);
		
		Book book=new Book(1,"Java ", The Great, 4100);
//		bookService.addBook(book);
		
		bookService.updatebook(book);
	}
}
