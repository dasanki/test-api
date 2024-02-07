package com.test.services;

import org.springframework.stereotype.Service;

import com.test.services.Interfaces.BaseGenreService;
import com.test.testapi.entities.Genre;
import com.test.testapi.repository.interfaces.BaseActorMovieRepository;

@Service
public class GenreService implements BaseGenreService {
    private BaseActorMovieRepository repository;

    @Override
    public Iterable<Genre> getAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAll'");
    }

    @Override
    public Genre get(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'get'");
    }

    @Override
    public int add(Genre Genre) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }

    @Override
    public void update(int id, Genre Genre) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public void delete(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

}
