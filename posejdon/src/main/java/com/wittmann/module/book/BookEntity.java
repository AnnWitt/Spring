package com.wittmann.module.book;

//zwroc uwage na importy - pozostałe wywalic jeżeli były
//import javax.persistence.*;  mozna zamiast ponizszych

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="book")
public class BookEntity {

    //pod kontrola bzy danych
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    private String author;
    private String title;

    public Long getId() {
        return id;
    }
    public BookEntity setId(Long id) {
        this.id = id;
        return this;
    }
    public String getAuthor() {
        return author;
    }
    public BookEntity setAuthor(String author) {
        this.author = author;
        return this;
    }
    public String getTitle() {
        return title;
    }
    public BookEntity setTitle(String title) {
        this.title = title;
        return this;
    }
}
