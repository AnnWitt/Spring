package com.wittmann.module.book;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

//inaczej dao ale w springu raczej Repository
//JpaRepository<T1,T2>,

//interfejs sam zaimportowany przez springa
@Repository
public interface BookRepository extends JpaRepository<BookEntity,Long>,
        JpaSpecificationExecutor<BookEntity>
{
}
