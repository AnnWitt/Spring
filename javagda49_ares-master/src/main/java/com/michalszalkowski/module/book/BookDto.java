package com.michalszalkowski.module.book;

public class BookDto  {
	private String author;
	private String title;
	private BookDetailsDto details;

	public BookDto(String author, String title, BookDetailsDto details) {
		this.author = author;
		this.title = title;
		this.details = details;
	}

	public BookDto(String author, String title) {
		this.author = author;
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public String getTitle() {
		return title;
	}
}
