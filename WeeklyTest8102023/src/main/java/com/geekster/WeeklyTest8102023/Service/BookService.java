package com.geekster.WeeklyTest8102023.Service;

import com.geekster.WeeklyTest8102023.Model.Book;
import com.geekster.WeeklyTest8102023.Repository.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    BookRepo bookRepo;

    public String addBook(Book newBook) {
        bookRepo.save(newBook);
        return "book added";
    }

    public List<Book> getAllBooks() {
        return bookRepo.findAll();
    }

    public Book getBookById(String id) {
        return bookRepo.findById(id).orElseThrow();
    }


    public void deleteBookById(String id) {
        bookRepo.deleteById(id);
    }

    public String updateAuthor(String id, String newAuthor) {
        Book book = bookRepo.findById(id).orElse(null);
        if(book != null){
            book.setAuthor(newAuthor);
            bookRepo.save(book);
        }
        return "book author successfully updated";
    }
}
