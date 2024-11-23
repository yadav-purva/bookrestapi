package com.api.book.bookrestapi.services;

import com.api.book.bookrestapi.entities.Book;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BoookSevice {
    private  static List<Book> list=new ArrayList<>();
    static {
        list.add(new Book(101,"Hibernet Complete  Refrence","xyz author"));
        list.add(new Book(102,"Spring  Complete  Refrence","abc author"));
        list.add(new Book(103,"Servlet Complete  Refrence","pqr author"));
    }
    public List<Book> getAllBooks(){
        return list;
    }
    public Book getBookById(int id){
       Book book=null;
      book=  list.stream().filter(e->e.getId()==id).findFirst().get();
      return  book;
    }

}
