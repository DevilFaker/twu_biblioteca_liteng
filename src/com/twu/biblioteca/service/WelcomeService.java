package com.twu.biblioteca.service;

import com.twu.biblioteca.BibliotecaApp;
import com.twu.biblioteca.entity.Book;
import com.twu.biblioteca.entity.User;
import com.twu.biblioteca.service.*;
import com.twu.biblioteca.entity.Movie;

import java.util.List;
import java.util.Scanner;

public class WelcomeService {
    private boolean isLogin=false;
    private User user;

    public void welcome(){
        System.out.println("welcome to bibloteca\n"+
                "here are some options:\n"
        );
    }

    public boolean isLogin() {
        return isLogin;
    }

    public void setLogin(boolean login) {
        isLogin = login;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void displayOptions(){
        System.out.println("1.view movies\n"
                +"2.check out a movie\n"
                +"3.return a movie\n"
                +"4.quit\n"
                +"5.view your account\n"
                +"input your option number:"
        );
    }

    public void  requiredLogin(){
        System.out.println("please login first\n"+
                            "input your username:");
        Scanner in = new Scanner(System.in);
        String username=in.nextLine();
        System.out.println("and your password:");
        Scanner ip = new Scanner(System.in);
        String password=ip.nextLine();
        UserService userService=new UserService();
        if(userService.checkUser(username,password)==1){
            user=userService.getUserByName(username);
            isLogin=true;
            System.out.println("log in successfully");
        }else{
            System.out.println("log in failed");
        }
    }

    /*
        read options from user
        1.view movie list
        2.check out movie
        3.return movie
        4.quit
        5.view your account
     */
    public void readOptions(){
        Scanner in = new Scanner(System.in);
        MovieService movieService=new MovieService();

        while (in.hasNext()){
            int optionNumber=in.nextInt();
            if(optionNumber==1){
                List<Movie>movieList=movieService.viewAllMovies();
                for(Movie movie:movieList){
                    int tempRating=movie.getRating();
                    if(tempRating>0){
                        System.out.println("name: "+movie.getName()
                                +" year:"+movie.getYear()
                                +" director: "+movie.getAuthor()
                                +" rating: "+ tempRating
                        );
                    }else {
                        System.out.println("name: "+movie.getName()
                                +" year:"+movie.getYear()
                                +" director: "+movie.getAuthor()
                                +" unrated"
                        );
                    }

                }
                displayOptions();
            }else if(optionNumber==2){
                while(!isLogin){
                    System.out.println("your have not log in yet");
                    requiredLogin();
                }
                System.out.println("which movie do you want to check out?");
                Scanner ic = new Scanner(System.in);
                if(movieService.checkOutMovie(ic.nextLine(),user)==1){
                    System.out.println("check out successfully");
                }
                else{
                    System.out.println("check out failed");
                }
                displayOptions();
            }else if(optionNumber==3){
                while(!isLogin);{
                    System.out.println("your have not log in yet");
                    requiredLogin();
                }

                System.out.println("which movie do you want to return");
                Scanner ir = new Scanner(System.in);
                if(movieService.returnMovie(ir.nextLine(),user)==1){
                    System.out.println("return successfully");
                }
                else{
                    System.out.println("return failed");
                }
                displayOptions();
            }else if(optionNumber==4){
                System.out.println("bye bye");
                System.exit(0);
            }else if(optionNumber==5){
                if(!isLogin){
                    System.out.println("your have not log in yet");
                    requiredLogin();
                }else{
                    System.out.println("Your username:\n"
                            + user.getUsername()
                            + "\n Your password:\n"
                            + user.getPassword()
                            +"\n the checkout list:"
                    );

                    if(user.getCheckOutList().size()==0)
                        System.out.println("empty");

                    for (Movie movie:user.getCheckOutList()){
                        System.out.println("movie name:"
                                + movie.getName());
                    }
                }
                displayOptions();
            }
            else{
                System.out.println("please input valid option number");
            }
        }
    }
}
