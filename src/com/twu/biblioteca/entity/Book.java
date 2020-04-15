package com.twu.biblioteca.entity;

public class Book {
    private int id;
    private String name;
    private int year;
    private String author;
    private int status;
    private String holder;
    private String category;

    public Book() {
        this.id = 0;
        this.name = "";
        this.year = 0;
        this.author = "";
        this.status = 0;
        this.holder = "";
        this.category = "";
    }

    public Book(int id, String name, int year, String author, int status, String holder, String category) {
        this.id = id;
        this.name = name;
        this.year = year;
        this.author = author;
        this.status = status;
        this.holder = holder;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", year=" + year +
                ", author='" + author + '\'' +
                ", status=" + status +
                ", holder='" + holder + '\'' +
                ", category='" + category + '\'' +
                '}';


    }
}
