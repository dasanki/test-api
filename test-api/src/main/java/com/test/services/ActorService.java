package com.test.services;

import org.springframework.stereotype.Service;

import com.test.services.Interfaces.BaseActorService;
import com.test.testapi.entities.Actor;
import com.test.testapi.repository.interfaces.BaseActorReposoitory;

@Service
public class ActorService implements BaseActorService {
    private BaseActorReposoitory repository;

    @Override
    public Iterable<Actor> getAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAll'");
    }

    @Override
    public Actor get(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'get'");
    }

    @Override
    public int add(Actor actor) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }

    @Override
    public void update(int id, Actor actor) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public void delete(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

}
