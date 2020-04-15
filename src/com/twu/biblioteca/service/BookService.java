package com.twu.biblioteca.service;

import com.twu.biblioteca.dao.BookMapper;
import com.twu.biblioteca.entity.Book;

import java.util.ArrayList;
import java.util.List;

public class BookService  {

    private List<Book> bookList=new ArrayList<Book>();

    public BookService(){
        Book book1=new Book(1,"love",2019,"liteng",0,"","love");
        Book book2=new Book(2,"war",2019,"liteng",0,"","war");
        bookList.add(book1);
        bookList.add(book2);
    }

    public List<Book> viewAllBooks(){
        return bookList;
    }
    public int checkOutBook(String bookName){
        Book temp =new Book();

        for(Book book : bookList){
            if(book.getName().equalsIgnoreCase(bookName)){
                temp=book;
               if(book.getStatus()==0){
                   book.setStatus(1);
                   return 1;
               }else{
                   return 0;
               }
            }
        }

        return 0;
    }
    public int returnBook(String bookName){
        Book temp =new Book();

        for(Book book : bookList){
            if(book.getName().equalsIgnoreCase(bookName)){
                temp=book;
                if(book.getStatus()==1){
                    book.setStatus(0);
                    return 1;
                }else if(book.getStatus()==0){
                    return 0;
                }
            }
        }

        return 0;
    }
}
