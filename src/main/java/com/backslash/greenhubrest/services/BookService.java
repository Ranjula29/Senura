package com.backslash.greenhubrest.services;

import com.backslash.greenhubrest.models.Book;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class BookService {

    private static List<Book> books = new ArrayList<>();

    private static int bookCount = 5;

    static{
        books.add(new Book(1,"Soththi Putha", new Date()));
        books.add(new Book(2,"Soththi Putha 2", new Date()));
        books.add(new Book(3,"Soththi Putha 3", new Date()));
        books.add(new Book(4,"Soththi Putha 4", new Date()));
        books.add(new Book(5,"Soththi Putha 5", new Date()));
    }

    public List<Book> findAllBooks(){
        return books;
    }

    public Book addBook(Book book){

        if(book.getBookID() == null){
            book.setBookID(bookCount++);
        }
        books.add(book);
        bookCount++;

        return book;

    }

    public Book findBook(int id){
        for(Book book:books){
            if( book.getBookID() == id ) {
                return book;
            }
        }
        return null;
    }


}
