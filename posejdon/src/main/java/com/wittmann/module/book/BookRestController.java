package com.wittmann.module.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookRestController {
    //zavezpiecza przed injection typu dopuszczalne 1 i 2 a ktos by probowal np 3
//https://chrome.google.com/webstore/detail/json-viewer/
/*    private static final List<BookEntity> STORAGE = List.of(
            new BookEntity().setId(1L).setTitle("Tytul 1").setAuthor("Autor 1"),
            new BookEntity().setId(2L).setTitle("Tytul 2").setAuthor("Autor 2"),
            new BookEntity().setId(3L).setTitle("Tytul 3").setAuthor("Autor 3")

    );*/

    @Autowired
    private BookRepository bookRepository;

    @GetMapping("/api/book/")
    public List<BookEntity> getBooks() {
        return bookRepository.findAll();
        //return STORAGE;
        //return List.of();
    }

    @GetMapping("/api/book/{id}") //pod jakim zasobem urlem //id to samo co w BookEntity
    public BookEntity getBook(@PathVariable Long id) {
        //return new BookEntity();
/*        return STORAGE
                .stream()
                .filter(item -> item.getId().equals(id))
                .findFirst()
                .get();*/
        return bookRepository.findById(id).get(); //na optionalu nie mozna get

    }


}
