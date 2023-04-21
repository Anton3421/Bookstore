package com.project.Bookstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

import com.project.Bookstore.domain.Book;
import com.project.Bookstore.domain.BookRepository;
import com.project.Bookstore.domain.Category;
import com.project.Bookstore.domain.CategoryRepository;
import com.project.Bookstore.domain.User;
import com.project.Bookstore.domain.UserRepository;


@SpringBootApplication
public class BookstoreApplication {
	private static final Logger log = LoggerFactory.getLogger(BookstoreApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}
	
	

	
	
	@Bean
	CommandLineRunner demo(BookRepository repository, CategoryRepository crepository, UserRepository urepository) {
		return (args) -> {
			
			Category category1 = new Category("Horror");
			crepository.save(category1);
			Category category2 = new Category("Action");
			crepository.save(category2);
			
			Book book = new Book("A Farewell to Arms", "Ernest Hemingway", "1929", "1232323-21", "20€", category1);
			repository.save(book);
			book = new Book("Goodbye", "Luis Marco", "1950", "1212323-21", "205€", category2);
			repository.save(book);
			
			User user1 = new User("user", "USER", "$2a$10$sTaVf9alFVduKKeoj5d3ie.fO9UJET1FVQ0H1vRSKxxtN215C8y7u", "user@gmail.com");
			User user2 = new User("admin", "Admin", "$2a$10$U0F0R3/Iczfxo8.D5csAde8phvS9j3PJoOOZIs2QV.MJ5cGLM3bk6", "admin@gmail.com");
			urepository.save(user1);
			urepository.save(user2);
			
		};
	}
	
}
