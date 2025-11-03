package net.javaguides.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import net.javaguides.sms.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

}
