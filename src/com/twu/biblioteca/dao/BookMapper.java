package com.twu.biblioteca.dao;

import com.twu.biblioteca.entity.Book;

import java.util.List;


public interface BookMapper {
    List<Book>selectAllBooks();
    List<Book>selectBooksByCategory(String category);
    Book selectBookByName(String name);
    int checkOutBook(int id,String name);
    int returnBook(int id,String name);
}
