package com.backslash.greenhubrest.controller;


import com.backslash.greenhubrest.customExceptions.BookNotFoundException;
import com.backslash.greenhubrest.models.Book;
import com.backslash.greenhubrest.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
@RequestMapping("/api")
@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/books")
    public List<Book> getAllBooks(){
        return bookService.findAllBooks();
    }

    @GetMapping("/books/{bookID}")
    public Book getBook(@PathVariable int bookID){
        Book book = bookService.findBook(bookID);

        if(book == null){
            throw new BookNotFoundException("Book Not Found for ID -> "+ bookID);
        }
        return book;
    }

    @PostMapping("/books")
    public ResponseEntity<Object> createBook(@RequestBody Book book){
        Book newBook = bookService.addBook(book);

        URI newBookLocation = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{bookID}")
                .buildAndExpand(newBook.getBookID())
                .toUri();

        return ResponseEntity.created(newBookLocation).build();

    }

}
