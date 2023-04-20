package com.project.Bookstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

import com.project.Bookstore.domain.Book;
import com.project.Bookstore.domain.BookRepository;
import com.project.Bookstore.domain.Category;
import com.project.Bookstore.domain.CategoryRepository;

@SpringBootApplication
public class BookstoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}
	
	

	
	
	@Bean
	CommandLineRunner demo(BookRepository repository, CategoryRepository crepository) {
		return (args) -> {
			
			Category category1 = new Category("Horror");
			crepository.save(category1);
			Category category2 = new Category("Action");
			crepository.save(category2);
			
			Book book = new Book("A Farewell to Arms", "Ernest Hemingway", "1929", "1232323-21", "20€", category1);
			repository.save(book);
			book = new Book("Goodbye", "Luis Marco", "1950", "1212323-21", "205€", category2);
			repository.save(book);
			
		};
	}
	
}
