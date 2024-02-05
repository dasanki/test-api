package com.test.services.Interfaces;

import com.test.testapi.entities.ActorMovie;

public interface BaseActorMovieServices {
    Iterable<ActorMovie> getAll();

    ActorMovie get(int id);

    int add(ActorMovie actormovie) throws Exception;

    void update(int id, ActorMovie actormovie) throws Exception;

    void delete(int id);
}
