package com.testapi.services;

import org.springframework.stereotype.Service;

import com.testapi.entities.Movie;
import com.testapi.repository.interfaces.BaseMovieRepository;
import com.testapi.services.interfaces.BaseMovieService;

@Service
public class MovieProducerService implements BaseMovieService {
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
