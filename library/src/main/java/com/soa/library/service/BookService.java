package com.soa.library.service;

import java.util.List;

import com.soa.library.models.Book;

public interface BookService {
	List<Book> getAll();
	Book searchByNameAndAuthor(String Title,String Author);
}
