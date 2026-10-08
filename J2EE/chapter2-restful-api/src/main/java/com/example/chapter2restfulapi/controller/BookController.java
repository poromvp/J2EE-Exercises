package com.example.chapter2restfulapi.controller;

import com.example.chapter2restfulapi.model.Book;
import com.example.chapter2restfulapi.service.BookService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;


@RestController
@RequestMapping("/books")
public class BookController {
    private final BookService bookService;

    // Tự động tiêm (inject) BookService vào Controller
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    // Liệt kê tất cả sách (GET /books)
    @GetMapping
    public Iterable<Book> all() {
        return bookService.findAll();
    }

    // Tìm sách theo ISBN (GET /books/{isbn})
    @GetMapping("/{isbn}")
    public ResponseEntity<Book> get(@PathVariable("isbn") String isbn) {
        return ResponseEntity.of(bookService.find(isbn));
    }

    // Thêm một quyển sách mới (POST /books)
    @PostMapping
    public ResponseEntity<Book> create(@RequestBody Book book, UriComponentsBuilder uriBuilder) {
        var created = bookService.create(book);
        var newBookUri = uriBuilder.path("/books/{isbn}").build(created.isbn());
        return ResponseEntity.created(newBookUri).body(created);
    }
}
