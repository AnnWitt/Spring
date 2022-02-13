package com.michalszalkowski.module.book.mapper;

import com.michalszalkowski.module.book.dto.BookDetailsDto;
import com.michalszalkowski.module.book.entity.BookDetailsEntity;

public class BookDetailsMapper {
    public static BookDetailsDto map(BookDetailsEntity details) {
        return  new BookDetailsDto(
                details.getIsbn(),
                details.getLang()
        );
    }


}
