package com.michalszalkowski.module.book.dto;

import java.util.Set;

public class BookDto {
    private String author;
    private String title;
    private BookDetailsDto details;
    private Set<String> tags; //set zamiast list aby sie nie bawic w mapowanie typów

    public BookDto(String author, String title, BookDetailsDto details, Set<String> tags) {
        this.author = author;
        this.title = title;
        this.details = details;
        this.tags = tags;
    }


    public String getAuthor() {
        return author;
    }

    public Set<String> getTags() {
        return tags;
    }

    public String getTitle() {
        return title;
    }

    public BookDetailsDto getDetails() {
        return details;
    }
}
