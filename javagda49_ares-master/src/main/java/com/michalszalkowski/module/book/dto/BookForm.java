package com.michalszalkowski.module.book.dto;

import javax.validation.constraints.NotNull;

public class BookForm {
	@NotNull(message="Author is required")
	private String author;

	@NotNull(message="title is required")
	private String title;

	private String isbn;
	private String lang;

	public String getIsbn() {
		return isbn;
	}
	public BookForm setIsbn(String isbn) {
		this.isbn = isbn;
		return this;
	}
	public String getLang() {
		return lang;
	}
	public BookForm setLang(String lang) {
		this.lang = lang;
		return this;
	}



	public String getAuthor() {
		return author;
	}

	public BookForm setAuthor(String author) {
		this.author = author;
		return this;
	}

	public String getTitle() {
		return title;
	}

	public BookForm setTitle(String title) {
		this.title = title;
		return this;
	}
}
