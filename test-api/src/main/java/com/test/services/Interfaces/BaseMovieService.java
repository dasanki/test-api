package com.test.services.Interfaces;

import com.test.testapi.entities.Movie;

public interface BaseMovieService {
    Iterable<Movie> getAll();

    Movie get(int id);

    int add(Movie movie) throws Exception;

    void update(int id, Movie movie) throws Exception;

    void delete(int id);
}
