package com.judsonpaiva.gestaodelivros.repository;
import com.judsonpaiva.gestaodelivros.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {

}
