package com.twu.biblioteca;

import com.twu.biblioteca.entity.User;
import com.twu.biblioteca.service.BookService;
import org.junit.Assert;
import org.junit.Test;
import com.twu.biblioteca.service.*;

public class BiblotecaTest {

    WelcomeService welcomeService = new WelcomeService();
    MovieService movieService=new MovieService();
    UserService userService=new UserService();


    @Test
    public void testViewMovie(){
        Assert.assertEquals(2,movieService.viewAllMovies().size());
    }


    @Test
    public void testCheckOutBooks(){
        welcomeService.setUser(userService.getUserByName("love"));
        User user=welcomeService.getUser();
        Assert.assertEquals(1,movieService.checkOutMovie("war",user));
        Assert.assertEquals(0,movieService.checkOutMovie("war",user));
    }

    @Test
    public void testReturnBooks(){
        welcomeService.setUser(userService.getUserByName("love"));
        User user=welcomeService.getUser();
        movieService.checkOutMovie("war",user);
        Assert.assertEquals(1,movieService.returnMovie("war",user));
        Assert.assertEquals(0,movieService.returnMovie("war",user));
    }
}
