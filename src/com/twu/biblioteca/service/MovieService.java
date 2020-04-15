package com.twu.biblioteca.service;

import com.twu.biblioteca.entity.Movie;
import com.twu.biblioteca.entity.User;

import java.util.ArrayList;
import java.util.List;

public class MovieService {
    private List<Movie> movieList=new ArrayList<Movie>();

    public MovieService(){
        Movie movie1=new Movie(1,"love",2019,"liteng",0,"","love",10);
        Movie movie2=new Movie(2,"war",2019,"liteng",0,"","war",9);
        movieList.add(movie1);
        movieList.add(movie2);
    }

    public List<Movie> viewAllMovies(){
        return movieList;
    }
    public int checkOutMovie(String movieName,User user){
        Movie temp =new Movie();

        for(Movie movie : movieList){
            if(movie.getName().equalsIgnoreCase(movieName)){
                temp=movie;
                if(movie.getStatus()==0){
                    movie.setStatus(1);
                    user.getCheckOutList().add(movie);
                    return 1;
                }else{
                    System.out.println("do not find this movie");
                    return 0;
                }
            }
        }

        return 0;
    }
    public int returnMovie(String movieName,User user){
        Movie temp =new Movie();

        for(Movie movie : movieList){
            if(movie.getName().equalsIgnoreCase(movieName)){
                temp=movie;
                if(movie.getStatus()==1){
                    movie.setStatus(0);
                   user.getCheckOutList().remove(movie);
                    return 1;
                }else if(movie.getStatus()==0){
                    System.out.println("you have not checkout this book before");
                    return 0;
                }
            }
        }

        return 0;
    }
}
