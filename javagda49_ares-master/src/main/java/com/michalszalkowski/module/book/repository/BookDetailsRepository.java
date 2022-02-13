package com.michalszalkowski.module.book.repository;

import com.michalszalkowski.module.book.entity.BookDetailsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface BookDetailsRepository extends JpaRepository<BookDetailsEntity, Long>,
        JpaSpecificationExecutor<BookDetailsEntity>
    {

}
