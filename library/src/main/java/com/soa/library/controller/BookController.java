package com.soa.library.controller;

import java.util.List;

import javax.persistence.GeneratedValue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.soa.library.models.Book;
import com.soa.library.repository.BookRepository;
import com.soa.library.service.BookService;

@RestController
@RequestMapping(value="/library")
public class BookController {
	@Autowired
	public BookService service;
	
	
	@RequestMapping(value="/all",method=RequestMethod.GET)
	public List<Book> getAllBooks()
	{
		return service.getAll();
	}
	@RequestMapping(value="/find",method=RequestMethod.GET)
	public Book findByNameAuthor(@RequestParam String title, @RequestParam String author)
	{
		return service.searchByNameAndAuthor(title, author);
	}
	
	
}
