package com.michalszalkowski.module.book;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "book")
public class BookEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String author;
	private String title;

	public BookEntity() {
	}

	@OneToOne
	@JoinColumn(name="details_id",referencedColumnName = "id")//odnosi się z columnye detai.s_id z
	// BookEntity do BookDetailEntity do kolumny id
	//dopisuje my selecta w data.sqg
	private BookDetailEntity details;

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
	public BookDetailEntity getDetails() {
		return details;
	}
	public BookEntity setDetails(BookDetailEntity details) {
		this.details = details;
		return this;
	}
}