package com.project.Bookstore;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.project.Bookstore.domain.User;
import com.project.Bookstore.domain.UserRepository;

@ExtendWith(SpringExtension.class)
@DataJpaTest
@SpringBootTest(classes = BookstoreApplication.class)
public class UserRepositoryTest {
	@Autowired
    private UserRepository urepository;

    @Test
    public void initialUsersAreReturned() {
        List<User> users = urepository.findByRole("ADMIN");
        
        assertThat(users).hasSize(1);
        assertThat(users.get(0).getUsername()).isEqualTo("admin");
    }
    
    @Test
    public void createNewStudent() {
    	User user = new User("user3", "USER3", "$2a$10$TU3qAOJjBHvMPYJeupILWe/UBLAXCGEftwMZ31l2xjwqU7KI03c/e", "user3@gmail.com");
    	urepository.save(user);
    	assertThat(user.getId()).isNotNull();
    }    
}
