package com.michalszalkowski.module.book.service;

import com.michalszalkowski.module.book.dto.BookDto;
import com.michalszalkowski.module.book.dto.BookForm;
import com.michalszalkowski.module.book.entity.BookDetailsEntity;
import com.michalszalkowski.module.book.entity.BookEntity;
import com.michalszalkowski.module.book.mapper.BookDetailsMapper;
import com.michalszalkowski.module.book.mapper.BookMapper;
import com.michalszalkowski.module.book.repository.BookDetailsRepository;
import com.michalszalkowski.module.book.repository.BooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//warstwa serwisowa ma zwracac  do Controllera dto's a encje zostaja ukryte

@Service
public class BookService {
    @Autowired
    private BookDetailsRepository detailsRepository;

    @Autowired
    private BooksRepository repository;

    public List<BookDto> list() {
        List<BookEntity> books = repository.findAll();
        return BookMapper.map(books);
    }

    public BookDto one(Long id) {
        BookEntity book = repository.findById(id).get();
        BookDto dto = BookMapper.map(book);
        return dto;
    }
//--------------------to mozna przeprobic na mappera, lepiej je miec w mapperach a n ie w serwisacg ---------
    public BookDto create(BookForm form) {
        BookDetailsEntity details= BookDetailsMapper.map(form);

        details= detailsRepository.saveAndFlush(details);
        //tu przechodzi przez baze danych i staje się encją. przedtem jest zwyklum dto'sem


        BookEntity book = BookMapper.map(form,details);
        return
                BookMapper.map(repository.saveAndFlush(book));
    }
//-----------------------------------------------------------------
    public BookDto update(Long id, BookForm form) {
        BookEntity bookFromDb = repository.findById(id).get();
        bookFromDb.setTitle(form.getTitle());
        bookFromDb.setAuthor(form.getAuthor());

        return BookMapper.map(repository.saveAndFlush(bookFromDb));
    }

    public void remove(Long id) {
        repository.deleteById(id);
    }




    //------------------------------------------
}
