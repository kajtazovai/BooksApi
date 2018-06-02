package com.soa.library.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.soa.library.models.Book;
import com.soa.library.repository.BookRepository;

@Service
public class BookServiceImpl implements BookService{
	@Autowired
	BookRepository repo;
	
	
	@Override
	public List<Book> getAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}


	@Override
	public Book searchByNameAndAuthor(String title, String author) {
		return repo.findByTitleAndAuthor(title, author);
	}


	

}
