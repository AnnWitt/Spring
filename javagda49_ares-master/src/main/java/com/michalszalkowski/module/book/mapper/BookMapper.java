package com.michalszalkowski.module.book.mapper;


import com.michalszalkowski.module.book.dto.BookDetailsDto;
import com.michalszalkowski.module.book.dto.BookDto;
import com.michalszalkowski.module.book.entity.BookEntity;

import java.util.List;
import java.util.stream.Collectors;

public class BookMapper {

    public static List<BookDto> map(List<BookEntity> books) {
        return books
                .stream()
                .map(bookEntity -> map(bookEntity))
                .collect(Collectors.toList());
    }

    public static BookDto map(BookEntity book) {
        return new BookDto(
                book.getAuthor(),
                book.getTitle(),
                BookDetailsMapper.map(book.getDetails()),
                BookTagsMapper.map(book.getTags())
                //book.getTags().stream().map(x -> x.getValue()).collect(Collectors.toSet())
        );

    }

    ;

};
