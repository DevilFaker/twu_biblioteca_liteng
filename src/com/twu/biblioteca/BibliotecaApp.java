package com.twu.biblioteca;

import com.twu.biblioteca.entity.Book;
import com.twu.biblioteca.service.WelcomeService;

import  com.twu.biblioteca.service.*;

public class BibliotecaApp {
    public static void main(String[] args) {
        WelcomeService welcomeService=new WelcomeService();
        welcomeService.welcome();
        welcomeService.displayOptions();
        welcomeService.readOptions();
    }
}
