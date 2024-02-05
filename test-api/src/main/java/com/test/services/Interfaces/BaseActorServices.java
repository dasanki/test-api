package com.test.services.Interfaces;

import com.test.testapi.entities.Actor;

public interface BaseActorServices {
    Iterable<Actor> getAll();

    Actor get(int id);

    int add(Actor actor) throws Exception;

    void update(int id, Actor actor) throws Exception;

    void delete(int id);
}
