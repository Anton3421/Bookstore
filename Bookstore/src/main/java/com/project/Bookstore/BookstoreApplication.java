package com.project.Bookstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

import com.project.Bookstore.domain.Book;
import com.project.Bookstore.domain.BookRepository;

@SpringBootApplication
public class BookstoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}
	@Bean
	public CommandLineRunner demo (BookRepository repository) {
		return (args) -> {
			Book a = new Book("A Farewell to Arms", "Ernest Hemingway", "1929", "1232323-21", "20€");
			
			repository.save(a);
		};
	}
	
}
