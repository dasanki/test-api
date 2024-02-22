package com.testapi.services;

import org.springframework.stereotype.Service;

import com.testapi.entities.GenreMovie;
import com.testapi.repository.interfaces.BaseActorMovieRepository;
import com.testapi.services.interfaces.BaseGenreMovieService;

@Service
public class GenreMoviesService implements BaseGenreMovieService {
    private BaseActorMovieRepository repository;

    @Override
    public Iterable<GenreMovie> getAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAll'");
    }

    @Override
    public GenreMovie get(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'get'");
    }

    @Override
    public int add(GenreMovie genremovie) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }

    @Override
    public void update(int id, GenreMovie genremovie) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public void delete(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

}
