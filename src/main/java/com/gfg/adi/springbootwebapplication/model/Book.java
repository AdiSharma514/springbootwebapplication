package com.gfg.adi.springbootwebapplication.model;

public class Book {
    private String title;
    private String isbn;
    public String getTitle() {
        return title;
    }
    public Book(String title, String isbn) {
        this.title = title;
        this.isbn = isbn;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
