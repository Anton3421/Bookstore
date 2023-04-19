package com.project.Bookstore.web;


import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.project.Bookstore.domain.Book;
import com.project.Bookstore.domain.BookRepository;

public class BookController {

	@RequestMapping(value="/index", method=RequestMethod.GET)
	public String Book(Model model) {
		return null;
		
	}	
	@GetMapping("/booklist")
	public String getBookList(Model model) {
		model.addAttribute("bookList", repository.findAll());
		System.out.println("PROGRAM READS: " + repository.findAll());
		return "bookList";
}
}

