package com.geekster.WeeklyTest8102023.Controller;

import com.geekster.WeeklyTest8102023.Model.Address;
import com.geekster.WeeklyTest8102023.Model.Book;
import com.geekster.WeeklyTest8102023.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {
    @Autowired
    BookService bookService;

    @PostMapping("book")
    public String addBook(@RequestBody Book newBook){
        return bookService.addBook(newBook);
    }

    @GetMapping("books")
    public List<Book> getAddress(){
        return bookService.getAllBooks();
    }

    @GetMapping("book/{id}")
    public Book getBook(@PathVariable String id){
        return bookService.getBookById(id);
    }

    @DeleteMapping("delete/{id}")
    public String deleteBook(@PathVariable String id){
       bookService.deleteBookById(id);
       return "deleted";
    }

    @PutMapping("book/id/{id}/author/{author}")
    public String updateBook(@PathVariable String id,@PathVariable String newAuthor){
        return bookService.updateAuthor(id,newAuthor);
    }
}
