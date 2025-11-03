package net.javaguides.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.javaguides.sms.entity.Book;
import net.javaguides.sms.repository.BookRepository;

@SpringBootApplication
public class LibraryManagementSystemApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(LibraryManagementSystemApplication.class, args);
    }

    @Autowired
    private BookRepository bookRepository;

    @Override
    public void run(String... args) throws Exception {

        // Sample data for the library
//        Book book1 = new Book("Atomic Habits", "James Clear", "Self-Help", true);
//        bookRepository.save(book1);
//
//        Book book2 = new Book("Clean Code", "Robert C. Martin", "Programming", true);
//        bookRepository.save(book2);
//
//        Book book3 = new Book("The Alchemist", "Paulo Coelho", "Fiction", false);
//        bookRepository.save(book3);
    }
}
