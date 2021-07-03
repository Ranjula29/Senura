package com.backslash.greenhubrest.models;

import java.util.Date;

public class Book {

    private Integer bookID;
    private String bookName;
    private Date publishedDate;

//    Constructor

    public Book(Integer bookID, String bookName, Date publishedDate) {
        this.bookID = bookID;
        this.bookName = bookName;
        this.publishedDate = publishedDate;
    }

//    getters and setters

    public Integer getBookID() {
        return bookID;
    }

    public void setBookID(Integer bookID) {
        this.bookID = bookID;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Date getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(Date publishedDate) {
        this.publishedDate = publishedDate;
    }

//    to String
    @Override
    public String toString() {
        return "Book{" +
                "bookID=" + bookID +
                ", bookName='" + bookName + '\'' +
                ", publishedDate=" + publishedDate +
                '}';
    }
}
