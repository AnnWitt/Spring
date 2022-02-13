package com.michalszalkowski.module.book;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="book_details")
public class BookDetailEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String isbn;
    private String lang;
    private String publisher;

    public Long getId() {
        return id;
    }
    public BookDetailEntity setId(Long id) {
        this.id = id;
        return this;
    }
    public String getIsbn() {
        return isbn;
    }
    public BookDetailEntity setIsbn(String isbn) {
        this.isbn = isbn;
        return this;
    }
    public String getLang() {
        return lang;
    }
    public BookDetailEntity setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getPublisher() {
        return publisher;
    }
    public BookDetailEntity setPublisher(String publisher) {
        this.publisher = publisher;
        return this;
    }



}