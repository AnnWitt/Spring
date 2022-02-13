package com.michalszalkowski.module.book;

import com.michalszalkowski.module.book.dto.BookDto;
import com.michalszalkowski.module.book.dto.BookForm;
import com.michalszalkowski.module.book.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
public class BookRestController {

    //nie trzymamy dostepu do repo w conmtrollerze (tak jakby byly sqle)

    @Autowired
    private BookService bookService;

    @GetMapping("/api/book")
    public List<BookDto> getBooks() {
        return bookService.list();
    }

    @GetMapping(value = "/api/book/{id}")
    public BookDto getBook(@PathVariable Long id) {
        return bookService.one(id);
    }

    //ti są dtosy a lista pobiera encje i wycieka za duzo danych np podwojnie id, publisher. Trzeba mapowania w
    //get mapping (np inne nazwy pól author/wroter

    @PostMapping("/api/book")
    //aby wyciagal komunikat bleu
    public BookDto newBooks(@RequestBody @Valid BookForm form) { //dodano valiud aby wywolac z bookform
        return bookService.create(form);
    }

    @PutMapping("/api/book/{id}")
    public BookDto updateBooks(@PathVariable Long id, @RequestBody BookForm form) {
        return bookService.update(id,form);
    }

    @DeleteMapping("/api/book/{id}")
    public void deleteBooks(@PathVariable Long id) {
		bookService.remove(id);
    }

}
