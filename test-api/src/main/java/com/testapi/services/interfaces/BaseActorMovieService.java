package com.testapi.services.interfaces;

import com.testapi.entities.ActorMovie;

public interface BaseActorMovieService {
    Iterable<ActorMovie> getAll();

    ActorMovie get(int id);

    int add(ActorMovie actormovie) throws Exception;

    void update(int id, ActorMovie actormovie) throws Exception;

    void delete(int id);
}
