package com.test.services;

import org.springframework.stereotype.Service;

import com.test.services.Interfaces.BaseMovieService;
import com.test.testapi.entities.Movie;
import com.test.testapi.repository.interfaces.BaseMovieRepository;

@Service
public class MovieService implements BaseMovieService {
    private BaseMovieRepository repository;

    @Override
    public Iterable<Movie> getAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAll'");
    }

    @Override
    public Movie get(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'get'");
    }

    @Override
    public int add(Movie movie) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }

    @Override
    public void update(int id, Movie movie) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public void delete(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

}
