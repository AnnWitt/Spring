package com.michalszalkowski.module.book;

import javax.validation.constraints.NotNull;

public class BookForm {
	@NotNull(message="Author is required")
	private String author;

	@NotNull(message="title is required")
	private String title;

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