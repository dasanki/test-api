package com.test.services;

import org.springframework.stereotype.Service;

import com.test.services.Interfaces.BaseActorMovieService;
import com.test.testapi.entities.ActorMovie;
import com.test.testapi.repository.interfaces.BaseActorMovieRepository;

@Service
public class ActorMovieService implements BaseActorMovieService {

    private BaseActorMovieRepository repository;

    @Override
    public Iterable<ActorMovie> getAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAll'");
    }

    @Override
    public ActorMovie get(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'get'");
    }

    @Override
    public int add(ActorMovie actormovie) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }

    @Override
    public void update(int id, ActorMovie actormovie) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public void delete(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

}
