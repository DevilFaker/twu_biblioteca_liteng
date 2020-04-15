package com.twu.biblioteca.dao;

import com.twu.biblioteca.entity.Movie;

import java.util.List;

public interface MovieMapper {
    List<Movie> selectMoviesByCategory(String category);
    int selectCountByCategory(String category);
    Movie selectMovieByName(String name);
    List<Movie> selectMoviesAvailable();
    int checkOutMovie(int id,String movieName);
    int returenMovie(int id,String movieName);
}
