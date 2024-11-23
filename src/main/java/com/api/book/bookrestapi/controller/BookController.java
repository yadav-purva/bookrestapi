package com.api.book.bookrestapi.controller;

import com.api.book.bookrestapi.entities.Book;
import com.api.book.bookrestapi.services.BoookSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {
    @Autowired
    private BoookSevice bookService;
    @RequestMapping("/books")
    public List<Book> getBooks(){

        return this.bookService.getAllBooks();
    }
}
