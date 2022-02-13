package com.michalszalkowski.module.book.mapper;

import com.michalszalkowski.module.book.entity.BookTagEntity;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class BookTagsMapperTest {
    @Test
    void shouldReturnEmptySetForNull() {
        // given
        Set<BookTagEntity> tags = null;
        // when
        Set<String> tag = BookTagsMapper.map(tags);
        // then
        assertThat(tag).isEmpty();
    }
    @Test
    void shouldReturnEmptySet() {
        // given
        Set<BookTagEntity> tags = Set.of();
        // when
        Set<String> tag = BookTagsMapper.map(tags);
        // then
        assertThat(tag).isEmpty();
    }
    @Test
    void shouldTagAsSet() {
        // given
        BookTagEntity tag1 = new BookTagEntity().setValue("tag1");
        Set<BookTagEntity> tags = Set.of(tag1);
        // when
        Set<String> tag = BookTagsMapper.map(tags);
        // then
        assertThat(tag).containsExactly("tag1");
    }
    @Test
    void shouldTagsAsSet() {
        // given
        BookTagEntity tag1 = new BookTagEntity().setValue("tag1");
        BookTagEntity tag2 = new BookTagEntity().setValue("tag2");
        Set<BookTagEntity> tags = Set.of(tag1, tag2);
        // when
        Set<String> tag = BookTagsMapper.map(tags);
        // then
        assertThat(tag).containsExactly("tag1", "tag2");
    }
}