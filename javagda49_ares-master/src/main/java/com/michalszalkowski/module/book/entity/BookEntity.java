package com.michalszalkowski.module.book.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.util.Set;

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
	private BookDetailsEntity details;

	@OneToMany(mappedBy = "book", cascade = CascadeType.ALL)
	private Set<BookTagEntity> tags;

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
	public BookDetailsEntity getDetails() {
		if (details==null) {
			return new BookDetailsEntity();
		}
		return details;
	}
	public BookEntity setDetails(BookDetailsEntity details) {
		this.details = details;
		return this;
	}
	public Set<BookTagEntity> getTags() {
		return tags;
	}
	public BookEntity setTags(Set<BookTagEntity> tags) {
		this.tags = tags;
		return this;
	}
}