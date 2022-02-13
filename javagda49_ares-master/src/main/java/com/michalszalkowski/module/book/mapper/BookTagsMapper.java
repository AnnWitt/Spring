package com.michalszalkowski.module.book.mapper;

import com.michalszalkowski.module.book.entity.BookTagEntity;

import java.util.Set;
import java.util.stream.Collectors;

public class BookTagsMapper {


    public static Set<String> map(Set<BookTagEntity> tags) {
        if (tags==null) {
            return Set.of();
        }
        return tags
                .stream()
                .map(tag -> tag.getValue())
                .collect(Collectors.toSet());
    }
}
