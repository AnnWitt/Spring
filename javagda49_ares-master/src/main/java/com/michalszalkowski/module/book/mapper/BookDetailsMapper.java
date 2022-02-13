package com.michalszalkowski.module.book.mapper;

import com.michalszalkowski.module.book.dto.BookDetailsDto;
import com.michalszalkowski.module.book.dto.BookForm;
import com.michalszalkowski.module.book.entity.BookDetailsEntity;

public class BookDetailsMapper {
    public static BookDetailsDto map(BookDetailsEntity details) {
        return  new BookDetailsDto(
                details.getIsbn(),
                details.getLang()
        );
    }

    public static BookDetailsEntity map(BookForm form) {
        return new BookDetailsEntity()
                .setIsbn(form.getIsbn())
                .setLang(form.getLang());
    };
}
