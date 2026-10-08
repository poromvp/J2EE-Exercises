package com.example.chapter2restfulapi;

import com.example.chapter2restfulapi.model.Book;
import com.example.chapter2restfulapi.service.BookService;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import java.util.List;

@SpringBootApplication
public class Chapter2RestfulApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(Chapter2RestfulApiApplication.class, args);
    }

    @Bean
    public ApplicationRunner booksInitializer(BookService bookService) {
        return args -> {
            bookService.create(new Book("9780061120084", "To Kill a Mockingbird", List.of("Harper Lee")));
            bookService.create(new Book("9780451524935", "1984", List.of("George Orwell")));
            bookService.create(new Book("9780618260300", "The Hobbit", List.of("J.R.R. Tolkien")));
        };
    }
}