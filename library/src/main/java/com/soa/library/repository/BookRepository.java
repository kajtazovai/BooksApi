package com.soa.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.soa.library.models.Book;

@Repository
public interface BookRepository extends JpaRepository<Book,Integer>{
	
	//@Query("SELECT b FROM Book b where b.title=?1 and b.author=?2")
	public Book findByTitleAndAuthor(String title, String author);
	
}
