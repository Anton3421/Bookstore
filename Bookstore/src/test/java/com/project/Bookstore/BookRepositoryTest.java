package com.project.Bookstore;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.project.Bookstore.domain.Book;
import com.project.Bookstore.domain.BookRepository;
import com.project.Bookstore.domain.Category;


@ExtendWith(SpringExtension.class)
@DataJpaTest
@SpringBootTest(classes = BookstoreApplication.class)
public class BookRepositoryTest {
	
	@Autowired
	private BookRepository repository;
	
	@Test
	public void initialBooksAreReturned() {
		List<Book> books = repository.findByTitle("A Farewell to Arms");
		
		assertThat(books).hasSize(1);
		assertThat(books.get(0).getAuthor()).isEqualTo("Ernest Hemingway");
	}
	
	@Test 
	public void createNewBook() {
		Book book = new Book("Joku kirja", "Tom Smith","2000", "0-385-50420-9", "15.99€", new Category("Romance"));
		repository.save(book);
		assertThat(book.getId()).isNotNull();
	}
}
