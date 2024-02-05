package com.test.services.Interfaces;

import com.test.testapi.entities.Genre;

public interface BaseGenreServices {
    Iterable<Genre> getAll();

    Genre get(int id);

    int add(Genre Genre) throws Exception;

    void update(int id, Genre Genre) throws Exception;

    void delete(int id);
}
