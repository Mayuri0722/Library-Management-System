package net.javaguides.sms.service;

import java.util.List;
import net.javaguides.sms.entity.Book;

public interface BookService {

    List<Book> getAllBooks();

    Book saveBook(Book book);

    Book getBookById(Long id);

    Book updateBook(Book book);

    void deleteBookById(Long id);
}
